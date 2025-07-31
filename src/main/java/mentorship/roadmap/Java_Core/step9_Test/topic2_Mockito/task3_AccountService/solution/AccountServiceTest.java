package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.Account;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    @Test
    public void testGoodWithdraw() {
        Account account = new Account("accId123", 1000);

        when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);

        Assertions.assertTrue(accountService.withdraw(account.getAccountId(), 500));
        Assertions.assertEquals(500, account.getBalance());

        verify(accountRepository, times(1)).findAccountById("accId123");
        verify(accountRepository, times(1)).updateAccount(account);
    }

    @Test
    public void testWithWrongAccWithdraw() {
        Account account = new Account("accId123", 100);

        when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);

        Assertions.assertFalse(accountService.withdraw(account.getAccountId(), 500));
        Assertions.assertEquals(100, account.getBalance());

        verify(accountRepository, times(1)).findAccountById("accId123");
        verify(accountRepository, never()).updateAccount(account);
    }

    @Test
    public void testBadWithdraw() {
        Account account = new Account("wrongId", 1000000);

        when(accountRepository.findAccountById(account.getAccountId())).thenReturn(null);

        Assertions.assertFalse(accountService.withdraw(account.getAccountId(), 1000000));
        Assertions.assertEquals(1000000, account.getBalance());

        verify(accountRepository, times(1)).findAccountById(account.getAccountId());
        verify(accountRepository, never()).updateAccount(account);
    }
}
