package heranca.entities;

public class BusinessAcount extends Account {
    private double loanLimit;

    public BusinessAcount() {

    }

    public BusinessAcount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= this.loanLimit) {
            balance += amount - 10.0;
        }
    }
}
