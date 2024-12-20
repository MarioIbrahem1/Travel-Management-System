/*
 * This code demonstrates the Strategy Design Pattern.
 * The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * It allows the algorithm to vary independently from the clients that use it.
 */

package travel_project_selected;

/**
 * PricingStrategy Interface
 * Author: MarioIbrahem
 *
 * This interface represents the Strategy in the Strategy pattern.
 * It defines a method that different pricing strategies must implement to calculate discounted prices.
 */
public interface PricingStrategy {

    // Method to calculate the discounted price based on the given base price
    public double calculateDiscountedPrice(double basePrice);
}
