Tarefas:

1. Extender Account com BusinessAccount. Acrescentar os métodos:

        double getLoanLimit();
        void setLoanLimit(double loanLimit);
        void loan(double amount) throws InvalidAmountException;

2. Implementar `BusinessAccount` com uma classe `BusinessAccountClass`

3. Criar a interface `InterestRateInstrument` para representar um instrumento sujeito a uma taxa de juro.
   
        void setRate(double rate) throws NegativeRateException;
        double getRate(double rate);
        void updateBalance();

4. Criar uma classe `SavingsAccount`, que extende `AccountClass` e implementa
   `InterestRateInstrument`
   
5. Implementar testes unitários para as classes desenvolvidas.