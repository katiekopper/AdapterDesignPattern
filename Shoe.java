/**
 * public class Shoe implements ShoeListing
 * private variables: String brand, String name, double cost, String description
 */
public class Shoe implements ShoeListing {
    private String brand;
    private String name;
    private double cost;
    private String description;

    /**
     * public Shoe is the constructor for the shoe class
     * @param brand
     * @param name
     * @param cost
     * @param description
     */
    public Shoe(String brand, String name, double cost, String description) {
        this.brand = brand;
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    /**
     * public String toString returns the information for the shoe
     * @return
     */
    @Override
    public String toString() {
        String output;
        output = "Shoe: "+ name + "By: " + brand + "Details: " + description + "Cost: $" + cost;
        return output;
    }
}
