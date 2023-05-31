public class product {
    String product_name;
    String product_description;
    int product_price;

    public void set_product(String name, String disc, int price) {
        this.product_name = name;
        this.product_description = disc;
        this.product_price = price;
    }

    public String product_detail() {
        return this.product_name + " "
                + this.product_description + " "
                + this.product_price;
    }
}
