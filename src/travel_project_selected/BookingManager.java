/*
 * This code implements the Singleton Design Pattern.
 * The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
 */

package travel_project_selected;

/**
 * BookingManager Class
 * Author: MarioIbrahem
 *
 * This class is responsible for managing bookings, such as flights, hotels, and packages.
 * It implements the Singleton pattern to ensure there is only one BookingManager instance throughout the application.
 */

// Singleton Pattern - مدير الحجز
public class BookingManager {

    // Static instance of the BookingManager class (Single instance for the Singleton pattern)
    private static BookingManager instance;

    // Private constructor to prevent direct instantiation from outside the class
    BookingManager() {}

    // Method to get the single instance of the BookingManager class
    public static BookingManager getInstance() {
        // Check if the instance is null, and if so, create a new instance
        if (instance == null) {
            instance = new BookingManager();
        }
        // Return the existing or newly created instance
        return instance;
    }

    // Method to book a flight, takes flight details as a parameter
    public void bookFlight(String flightDetails) {
        // Prints a confirmation of the flight booking
        System.out.println("Flight booked: " + flightDetails);
    }

    // Method to book a hotel, takes hotel details as a parameter
    public void bookHotel(String hotelDetails) {
        // Prints a confirmation of the hotel booking
        System.out.println("Hotel booked: " + hotelDetails);
    }

    // Method to book a package, takes package details as a parameter
    public void bookPackage(String packageDetails) {
        // Prints a confirmation of the package booking
        System.out.println("Package booked: " + packageDetails);
    }
}
