package Practice1.BetterCode.V2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Product {
    private String name;
    private String desc;
    public int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    Product(HashMap<String, Object> mp) {
        if((int)mp.get("price")>0) {
            this.price = (int)mp.get("price");
        }
    }


}