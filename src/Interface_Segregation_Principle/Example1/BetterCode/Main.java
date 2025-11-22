package Interface_Segregation_Principle.Example1.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IUser>users=new ArrayList<>();
        users.add(new Admin());
        users.add(new Buyer());
        users.add(new Seller());

        for (IUser user : users) {

            System.out.println("---- " + user.getClass().getSimpleName() + " ----");

            if (user instanceof ICanBuy buyUser) {
                buyUser.buy();
            }

            if (user instanceof ICanSell sellUser) {
                sellUser.sell();
            }

            if (user instanceof ICanModify modifyUser) {
                modifyUser.modify();
            }

            if (user instanceof ICanApprove approveUser) {
                approveUser.approve();
            }

            System.out.println();
        }
    }
}
