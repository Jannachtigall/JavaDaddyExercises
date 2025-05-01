package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.Account;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account("acc123", 500.0);
    }

    @Test
    void testSuccessfulWithdrawal() {
        when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);

        boolean result = accountService.withdraw(account.getAccountId(), 200.0);

        assertTrue(result);
        assertEquals(300.0, account.getBalance());

        verify(accountRepository, times(1)).findAccountById(account.getAccountId());
        verify(accountRepository, times(1)).updateAccount(account);
    }

    @Test
    void testWithdrawalFailure_InsufficientFunds() {
        when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);

        boolean result = accountService.withdraw(account.getAccountId(), 2000.0);

        assertFalse(result);
        assertEquals(500.0, account.getBalance());

        verify(accountRepository, times(1)).findAccountById(account.getAccountId());
        verify(accountRepository, never()).updateAccount(any());
    }

    @Test
    void testWithdrawalFailure_AccountNotFound() {
        when(accountRepository.findAccountById("unknownAccount")).thenReturn(null);

        boolean result = accountService.withdraw("unknownAccount", 100.0);

        assertFalse(result);

        verify(accountRepository, times(1)).findAccountById("unknownAccount");
        verify(accountRepository, never()).updateAccount(any());
    }
}
