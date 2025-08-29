package codepractice;

public class BankATM {
   BankAccount account ; //= new BankAccount(0);

    public void depositMoney(double amount) {
        try {
            account.deposit(amount);
        } catch (CustomInvalidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void withdrawMoney(double amount) {
        try {
            account.withdraw(amount);
        } catch (CustomInvalidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        BankATM atm = new BankATM();
        atm.depositMoney(500);
        atm.withdrawMoney(200);
    }
}