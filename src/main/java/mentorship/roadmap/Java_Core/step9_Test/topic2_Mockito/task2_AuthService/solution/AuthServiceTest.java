package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.AuthService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.User;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;

    @Test
    public void testGoodAuthenticateUser() {
        User user = new User("user", "password");

        when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        Assertions.assertTrue(authService.authenticateUser(user.getUsername(), user.getPassword()));

        verify(userRepository, times(1)).findUserByUsername(user.getUsername());
    }

    @Test
    public void testWrongPassAuthenticateUser() {
        User user = new User("user", "password");

        when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        Assertions.assertFalse(authService.authenticateUser(user.getUsername(), "wrongPass"));

        verify(userRepository, times(1)).findUserByUsername(user.getUsername());
    }

    @Test
    public void testBadAuthenticateUser() {
        when(userRepository.findUserByUsername("user")).thenReturn(null);

        Assertions.assertFalse(authService.authenticateUser("user", "password"));

        verify(userRepository, times(1)).findUserByUsername("user");
    }
}
