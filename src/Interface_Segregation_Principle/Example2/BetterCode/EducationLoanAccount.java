package Interface_Segregation_Principle.Example2.BetterCode;


public class EducationLoanAccount implements ILoan, IPartialWithdraw{
    @Override
    public void withdraw() {
        System.out.println("Education Loan Amount withdrawn");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking Education Loan Amount");
    }

    @Override
    public void payEMI() {
        System.out.println("EMI Paid");
    }

    @Override
    public boolean isPartiallyWithdraw() {
        return true;
    }
}