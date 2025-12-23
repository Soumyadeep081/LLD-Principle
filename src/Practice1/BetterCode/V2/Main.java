package Practice1.BetterCode.V2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Object>hm=new HashMap<>();
        hm.put("name","Iphone");
        hm.put("Desc","Made by apple");
        hm.put("price",150000);
        Product p =new Product(hm);
        System.out.println(p.price);
    }
}
