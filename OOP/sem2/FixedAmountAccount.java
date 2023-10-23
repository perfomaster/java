public abstract class FixedAmountAccount implements account{
    public double balance;
    
    public FixedAmountAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getAmount () {
        return this.balance;
    }

    @Override
    public void put (double amount) {
        
    }

    @Override
    public void take (double amount) {
        
    }
}
