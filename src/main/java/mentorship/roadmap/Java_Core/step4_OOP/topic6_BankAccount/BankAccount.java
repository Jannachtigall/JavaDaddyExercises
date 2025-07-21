package mentorship.roadmap.Java_Core.step4_OOP.topic6_BankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("На банковском счёте недостаточно средств!");
        } else {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
