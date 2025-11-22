package Interface_Segregation_Principle.Example1.ProblematicCode;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
            users.add(new Admin());
            users.add(new Buyer());
            users.add(new Seller());

            f(users);
    }
    public static void f(List<User>users){
        for(User user:users){
            user.approveProduct();
        }
    }
}