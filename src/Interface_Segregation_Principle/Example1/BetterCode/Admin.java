package Interface_Segregation_Principle.Example1.BetterCode;

public class Admin implements IUser,ICanBuy,ICanApprove,ICanModify,ICanSell{
    @Override
    public void approve(){
        System.out.println("Can Approve");
    }
    @Override
    public void buy(){
        System.out.println("Can Buy");
    }

    @Override
    public void modify() {
        System.out.println("Can Modify");
    }

    @Override
    public void sell() {
        System.out.println("Can Sell");
    }
}
