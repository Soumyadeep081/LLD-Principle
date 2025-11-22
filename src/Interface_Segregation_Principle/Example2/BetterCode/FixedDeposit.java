package Interface_Segregation_Principle.Example2.BetterCode;


public class FixedDeposit implements IFixedDeposit{
    @Override
    public void withdraw() {
        System.out.println("Withdrawal in process");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking FD balance");
    }

    @Override
    public void deposit() {
        System.out.println("Making one time FD Deposit");
    }

    @Override
    public void getMaturityPeriod() {
        System.out.println("3 years");
    }
}