package back_end.model;

public class saleCard {
    private int id;
    private Product product;
    private double price;
    private int quantity;

    public saleCard () {

    }

    public saleCard(int id, Product product, double price, int quantity) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "saleCard{" +
                "id=" + id +
                ", product=" + product +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
