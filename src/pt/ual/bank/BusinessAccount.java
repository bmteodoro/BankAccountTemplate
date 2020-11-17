package pt.ual.bank;

public interface BusinessAccount extends Account {
    void setLoanLimit(double loanLimit);
    double getLoanLimit();
    void loan(double amount, double operationCost) throws InvalidAmountException;
}
