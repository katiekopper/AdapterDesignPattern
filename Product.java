/**
 * public class Product implements ProductListing interface
 * private variables: String title, double price, String description
 */
public class Product implements ProductListing {
    private String title;
    private double price;
    private String description;

    /**
     * public Product is the constructor for the Product class
     * @param title
     * @param price
     * @param description
     */
    public Product(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    /**
     * public String getTitle returns String title
     * @return
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * public double getPrice returns double price
     * @return
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * public String getDescription returns String description
     * @return
     */
    @Override
    public String getDescription() {
        return description;
    }
}
