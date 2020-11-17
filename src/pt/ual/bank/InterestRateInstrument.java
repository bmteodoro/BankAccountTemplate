package pt.ual.bank;

public interface InterestRateInstrument {

    void setRate(double rate) throws NegativeRateException;

    double getRate(double rate);

    void updateBalance();
}
