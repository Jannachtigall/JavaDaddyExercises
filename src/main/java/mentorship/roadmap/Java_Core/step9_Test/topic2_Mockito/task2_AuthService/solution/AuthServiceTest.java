package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.AuthService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.User;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("user1", "password123");
    }

    @Test
    void testSuccessfulAuthentication() {
        when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        boolean result = authService.authenticateUser(user.getUsername(), user.getPassword());

        assertTrue(result);
        verify(userRepository, times(1)).findUserByUsername(user.getUsername());
    }

    @Test
    void testAuthenticationFailure_WrongPassword() {
        when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        boolean result = authService.authenticateUser(user.getUsername(), "wrongpassword");

        assertFalse(result);
        verify(userRepository, times(1)).findUserByUsername(user.getUsername());
    }

    @Test
    void testAuthenticationFailure_UserNotFound() {
        when(userRepository.findUserByUsername("unknownUser")).thenReturn(null);

        boolean result = authService.authenticateUser("unknownUser", user.getPassword());

        assertFalse(result);
        verify(userRepository, times(1)).findUserByUsername("unknownUser");
    }
}
