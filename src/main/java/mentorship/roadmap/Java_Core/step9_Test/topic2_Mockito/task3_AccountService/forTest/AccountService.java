package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean withdraw(String accountId, double amount) {
        Account account = accountRepository.findAccountById(accountId);
        if (account != null && account.getBalance() >= amount) {
            account.withdraw(amount);
            accountRepository.updateAccount(account);
            return true;
        }
        return false;
    }
}
