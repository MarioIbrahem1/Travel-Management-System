/*
 * Singleton Pattern - مدير بيانات المستخدم
 * This class implements the Singleton design pattern to ensure that there is only one instance
 * of UserProfileManager, which is globally accessible and responsible for managing user profile data.
 */
package travel_project_selected;

/**
 * UserProfileManager Class
 * Manages user data such as preferences and loyalty points in a travel booking system.
 * Ensures consistent and centralized management of user-related information.
 */
public class UserProfileManager {

    // Static instance of UserProfileManager (singleton instance)
    private static UserProfileManager instance;

    // User preferences (e.g., preferred destinations, room types)
    private String preferences;

    // Loyalty points earned by the user
    private int loyaltyPoints;

    // Private constructor to prevent instantiation from outside the class
    private UserProfileManager() {}

    /**
     * getInstance Method
     * Ensures a single instance of UserProfileManager exists.
     * Creates the instance if it does not already exist.
     * @return the singleton instance of UserProfileManager
     */
    public static UserProfileManager getInstance() {
        if (instance == null) {
            instance = new UserProfileManager();
        }
        return instance;
    }

    /**
     * updatePreferences Method
     * Updates the user's preferences.
     * @param preferences the user's new preferences
     */
    public void updatePreferences(String preferences) {
        this.preferences = preferences;
    }

    /**
     * getPreferences Method
     * Retrieves the user's preferences.
     * @return the user's preferences as a String
     */
    public String getPreferences() {
        return preferences;
    }

    /**
     * addLoyaltyPoints Method
     * Adds loyalty points to the user's account.
     * @param points the number of points to add
     */
    public void addLoyaltyPoints(int points) {
        loyaltyPoints += points;
    }

    /**
     * getLoyaltyPoints Method
     * Retrieves the user's current loyalty points.
     * @return the user's loyalty points as an integer
     */
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    /**
     * manageUserProfile Method
     * Placeholder method for additional user profile management logic.
     */
    void manageUserProfile() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools | Templates.
    }
}
