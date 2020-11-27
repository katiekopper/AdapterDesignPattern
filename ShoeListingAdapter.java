/**
 * public class ShoeListingAdapter implements ProductListing
 * private variables: ShoeListing shoe, String title, String brand, double price, String description
 */
public class ShoeListingAdapter implements ProductListing {
    private ShoeListing shoe;
    private String title;
    private String brand;
    private double price;
    private String description;

    /**
     * public ShoeListingAdapter is the constructor for class ShoeListingAdapter
     * gathers title, price, brand, and description information by turning object shoe into a string
     * it then uses the substring and indexOf methods to get information
     * @param shoe
     */
    public ShoeListingAdapter(ShoeListing shoe) {
        this.shoe = shoe;
        String info = shoe.toString();

        title = info.substring(info.indexOf("Shoe:")+6, info.indexOf("By:"));
        price = Double.parseDouble(info.substring(info.indexOf("$")+1));
        brand = info.substring(info.indexOf("By:")+4, info.indexOf("Details:"));
        description = info.substring(info.indexOf("Details:")+9, info.indexOf("Cost:"));
    }

    /**
     * public String getTitle returns title
     * @return
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * public double getPrice returns price
     * @return
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * public String getDescription returns "Created by" + brand, description
     * @return
     */
    @Override
    public String getDescription() {
        return "Created by " + brand + ", " + description;
    }
}
