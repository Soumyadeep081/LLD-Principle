package Interface_Segregation_Principle.Example1.BetterCode;

public class Seller implements IUser,ICanSell,ICanModify{

    @Override
    public void sell() {
        System.out.println("Can Sell");
    }

    @Override
    public void modify() {
        System.out.println("Can Modify");
    }
}
