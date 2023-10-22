import java.time.LocalDate;
import java.time.Period;

public class depositAccount extends account {
    private LocalDate lastTake;

    public depositAccount(double balance) {
        super(balance);
        this.lastTake = LocalDate.of(0000, 0, 0);
    }

    @Override
    public void take (double cash) {
        cash = cash * 1.01;
        LocalDate now = LocalDate.now();
        Period period = Period.between(now, this.lastTake);
        if (period.getMonths() > 0) {
            if ((this.balance - cash) >= 0 && cash > 0) {
                this.balance += cash;
                LocalDate date = LocalDate.now();
                lastTake = date;
            }
        }
    }
}
