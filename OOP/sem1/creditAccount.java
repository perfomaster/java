public class creditAccount extends account {
    public creditAccount(double balance) {
        super(balance);
    }

    @Override
    public void take (double cash) {
        cash = cash * 1.01;
        if ((this.balance - cash) >= 0 && cash > 0) {
            this.balance += cash;
        }
    }
}
