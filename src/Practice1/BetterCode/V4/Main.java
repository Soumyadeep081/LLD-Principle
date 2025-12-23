package Practice1.BetterCode.V4;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .setName("Iphone")
                .setPrice(1000)
                .setBrand("Apple")
                .setDesc("New apple iphone")
                .setCategory("Mobile")
                .build();
    }
}
