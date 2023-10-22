public class account {
    protected double balance;

    public account(double balance) {
        this.balance = balance;
    }

    public void put (double cash) {
        if (cash > 0) {
            balance += cash;
        }
    }
    public void take (double cash) {
        if ((balance - cash) >= 0 && cash > 0) {
            balance += cash;
        }
    }
    public double getAmount () {
        return balance;
    }
}
