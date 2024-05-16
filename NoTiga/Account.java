package NoTiga;

public class Account {
    // Attributes
    private String id;
    private String name;
    private int balance = 0;

    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Methods
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account anotherAccount, int amount) {
        if (amount <= balance) {
            balance -= amount;
            anotherAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString method
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
