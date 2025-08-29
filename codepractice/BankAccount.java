package codepractice;

public class BankAccount {

    //private String accountNumber;
    private double balance;

    public BankAccount(double initialBalance) {
        //this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }



    public void deposit(double amount) throws CustomInvalidException {
        if (amount <= 0) {
            throw new CustomInvalidException("Invalid deposit amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws CustomInvalidException {
        if (amount <= 0) {
            throw new CustomInvalidException("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new CustomInvalidException("Insufficient funds");
        }
        balance -= amount;
    }

}
