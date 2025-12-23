package Practice1.BetterCode.V5;


import java.util.List;

public class product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;
    private product(Builder b){
        if(b.getPrice()>0)this.price=b.getPrice();
        this.name = b.getName();
        this.desc = b.getDesc();
        this.price = b.getPrice();
        this.brand = b.getBrand();
        this.category = b.getCategory();
        this.discount = b.getDiscount();
        this.createdAt = b.getCreatedAt();
        this.updatedAt = b.getUpdatedAt();
        this.images = b.getImages();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private String desc;
        private int price;
        private String brand;
        private String category;
        private int discount;
        private String createdAt;
        private String updatedAt;
        private List<String> images;

        Builder() {
        }

        public product build(){
            return new product(this);
        }

        public String getName() {
            return this.name;
        }

        public int getPrice() {
            return this.price;
        }

        public String getDesc() {
            return this.desc;
        }
        public String getBrand() { return this.brand; }

        public String getCreatedAt() { return this.createdAt; }

        public String getUpdatedAt() { return this.updatedAt; }

        public String getCategory(){return this.category; }

        public List<String> getImages() { return this.images; }

        // ...

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder setPrice(int price) {
            if(price < 0) return this;
            this.price = price;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setImages(List<String> images) {
            this.images = images;
            return this;
        }
        public Builder setCreatedAt(String date){
            this.createdAt=date;
            return this;
        }
        public Builder setUpdatedAt(String date){
            this.updatedAt=date;
            return this;
        }

        public int getDiscount() {
            return this.discount;
        }

        // .....

    }
}
