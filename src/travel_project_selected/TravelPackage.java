/*
 * This code demonstrates the Prototype and Factory Design Patterns.
 * The Prototype pattern allows creating duplicate objects while maintaining performance by cloning existing objects.
 * The Factory pattern provides a method for creating objects based on specified criteria, encapsulating the instantiation logic.
 */

package travel_project_selected;

// Updated TravelPackage Class implementing Prototype Design Pattern
public class TravelPackage implements Cloneable {

    // Attributes of the Travel Package
    private String flight;        // Flight details
    private String hotel;         // Hotel details
    private String packageType;   // Type of the package (e.g., Luxury, Adventure)
    private double basePrice;     // Base price of the package

    // Constructor to initialize a TravelPackage
    public TravelPackage(String flight, String hotel, String packageType, double basePrice) {
        this.flight = flight;
        this.hotel = hotel;
        this.packageType = packageType;
        this.basePrice = basePrice;
    }

    // Factory method to create specific types of packages
    public static TravelPackage createPackage(String type, String flight, String hotel, String packageType, double basePrice) {
        // Determine package type and adjust the base price accordingly
        if (type.equalsIgnoreCase("Luxury")) {
            return new TravelPackage(flight, hotel, "Luxury", basePrice + 500);
        } else if (type.equalsIgnoreCase("Adventure")) {
            return new TravelPackage(flight, hotel, "Adventure", basePrice + 300);
        } else if (type.equalsIgnoreCase("Cultural")) {
            return new TravelPackage(flight, hotel, "Cultural", basePrice + 200);
        } else {
            throw new IllegalArgumentException("Invalid package type.");
        }
    }

    // Implementing the Prototype pattern by overriding the clone method
    @Override
    public TravelPackage clone() {
        try {
            // Create and return a clone of the current object
            return (TravelPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            // Handle exceptions if cloning is not supported
            throw new RuntimeException("Clone not supported for TravelPackage", e);
        }
    }

    // Getter for flight details
    public String getFlight() {
        return flight;
    }

    // Getter for hotel details
    public String getHotel() {
        return hotel;
    }

    // Getter for package type
    public String getPackageType() {
        return packageType;
    }

    // Getter for base price
    public double getBasePrice() {
        return basePrice;
    }

    // Method to print package details
    public void describe() {
        System.out.println("Travel Package Details:");
        System.out.println("Flight: " + flight);
        System.out.println("Hotel: " + hotel);
        System.out.println("Type: " + packageType);
        System.out.println("Total Price: $" + basePrice);
    }
}
