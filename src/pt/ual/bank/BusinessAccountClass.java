package pt.ual.bank;

public class BusinessAccountClass extends AccountClass implements BusinessAccount{
    private double loanLimit;

    public BusinessAccountClass(String number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public double getLoanLimite() {
        return this.loanLimit;
    }

    @Override
    public void setLoanLimite(double loanLimit) {
        this.loanLimit = loanLimit;

    }

    @Override
    public void loan(double amount, double operationCost) throws InvalidAmountException {
        if (amount > this.getLoanLimite()){
            throw new InvalidAmountException();
        }
        this.deposit(amount - operationCost);

    }
}
