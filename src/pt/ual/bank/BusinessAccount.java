package pt.ual.bank;

public interface BusinessAccount extends Account{
    double getLoanLimite();
    void setLoanLimite(double loanLimit);
    void loan(double amount, double operationCost) throws InvalidAmountException;
}


