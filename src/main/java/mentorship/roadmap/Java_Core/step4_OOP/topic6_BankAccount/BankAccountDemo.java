package mentorship.roadmap.Java_Core.step4_OOP.topic6_BankAccount;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", 1000);
        bankAccount.deposit(500); // 1500
        bankAccount.withdraw(1499); // 1
        bankAccount.withdraw(100); // нельзя!
        System.out.println(bankAccount.getBalance());
    }
}
