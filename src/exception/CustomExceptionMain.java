package exception;

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Balance is insufficient and the current balance is " + balance);
        } else {
            balance -= amount;
            System.out.println("Amount withdraw successful and the current balance is " + balance);
        }
    }
}

public class CustomExceptionMain {
    public static void main(String[] args) {
        BankAccount icici = new BankAccount(1000);
        try {
            icici.withdraw(1001);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}
