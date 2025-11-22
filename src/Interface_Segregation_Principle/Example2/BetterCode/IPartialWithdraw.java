package Interface_Segregation_Principle.Example2.BetterCode;

public interface IPartialWithdraw extends IAccount{
    public boolean isPartiallyWithdraw();
}