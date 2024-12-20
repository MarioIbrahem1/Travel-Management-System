/*
 * Builder Pattern - بناء رحلة مخصصة
 * The Builder pattern is implemented here to allow for the flexible construction of a Trip object.
 * This ensures clear, step-by-step construction and a clean representation of optional parameters.
 */
package travel_project_selected;

/**
 * Trip Class
 * Represents a customizable travel trip, including details such as flight, hotel, and package type.
 */
class Trip {
    private String flight;        // Flight details
    private String hotel;         // Hotel details
    private String packageType;   // Package type (e.g., Luxury, Adventure, Cultural)

    // Private constructor to enforce the use of the TripBuilder for object creation
    private Trip(TripBuilder builder) {
        this.flight = builder.flight;
        this.hotel = builder.hotel;
        this.packageType = builder.packageType;
    }

    // Overrides toString to provide a readable description of the trip
    @Override
    public String toString() {
        return "Trip [Flight=" + flight + ", Hotel=" + hotel + ", Package=" + packageType + "]";
    }

    /**
     * TripBuilder Class
     * A static nested class used to construct a Trip object.
     * It allows setting each attribute individually and ensures immutability of the Trip object once built.
     */
    public static class TripBuilder {
        private String flight;      // Flight details
        private String hotel;       // Hotel details
        private String packageType; // Package type (optional)

        // Setter method for flight details
        public TripBuilder setFlight(String flight) {
            this.flight = flight;
            return this;
        }

        // Setter method for hotel details
        public TripBuilder setHotel(String hotel) {
            this.hotel = hotel;
            return this;
        }

        // Setter method for package type
        public TripBuilder setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }

        // Builds and returns a new Trip object
        public Trip build() {
            return new Trip(this);
        }
    }
}
