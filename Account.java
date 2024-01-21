//Write java code for the Account class explained above.
public class Account {
    private String id;
    private String name;
    private int balance = 0;

    // constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getters & setters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // credit() method returns the amount deposited, or 0 if amount is negative
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // debit() method returns the amount withdrawn, or 0 if amount exceeded balance
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // transferTo() method returns the amount transferred, or 0 if amount exceeded
    // balance
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // format output as Account[id=?,name=?,balance=?]
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
