package Interface_Segregation_Principle.Example2.BetterCode;


public interface IAccount {
    public void withdraw();

    public void checkBalance(int accNo);
}