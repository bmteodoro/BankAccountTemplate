package pt.ual.bank;

public class SavingsAccount extends AccountClass implements InterestRateInstrument{

    private double rate;

    public SavingsAccount(String number, String holder, double balance, double rate) {
        super(number, holder, balance);
        this.rate = rate;
    }

    @Override
    public void setRate(double rate) throws NegativeRateException {
        this.rate = rate;
    }

    @Override
    public double getRate(double rate) {
        return this.rate;
    }

    @Override
    public void updateBalance() {
        
    }
}
