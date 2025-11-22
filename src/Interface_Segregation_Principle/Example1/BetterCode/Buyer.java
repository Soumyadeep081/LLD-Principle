package Interface_Segregation_Principle.Example1.BetterCode;

public class Buyer implements IUser,ICanBuy{
    @Override
    public void buy(){
        System.out.println("Can Buy");
    }
}
