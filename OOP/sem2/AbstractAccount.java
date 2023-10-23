public abstract class AbstractAccount implements account {
    public double balance;
    
    public AbstractAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getAmount () {
        return this.balance;
    }

    @Override
    public void put (double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void take (double amount) {
        if ((balance - amount) >= 0 && amount > 0) {
            balance += amount;
        }
    }
}
