class BankAccount {
    String name;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if(amount > balance)
            System.out.println("Insufficient balance!");
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.name = "Alice";
        acc.deposit(1000);
        acc.withdraw(500);
        acc.displayBalance();
    }
}