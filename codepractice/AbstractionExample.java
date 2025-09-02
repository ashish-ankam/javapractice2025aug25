package codepractice;

public class AbstractionExample {
    public static void main(String[] args) {
        ATM atm = new MyATM();
        atm.withdrawMoney(); // Outputs: Money withdrawn.
        atm.checkBalance(); // Outputs: Balance checked.
    }
}