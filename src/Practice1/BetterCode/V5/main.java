package Practice1.BetterCode.V5;


public class main {
    public static void main(String[] args) {
        product p=product.getBuilder().setName("Notebook 14").
                setDesc("High end Professional Working Laptop").setPrice(56000).setBrand("Xiaomi").setCategory("Laptop").
                setCreatedAt("15-05-2021").setUpdatedAt("23-12-2025").build();


    }
}
