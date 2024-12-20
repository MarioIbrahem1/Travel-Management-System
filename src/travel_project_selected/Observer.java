/*
 * This code implements the Observer Design Pattern.
 * The Observer pattern defines a one-to-many dependency between objects so that when one object (the subject) changes state,
 * all its dependent objects (observers) are notified and updated automatically.
 */

package travel_project_selected;

import java.util.ArrayList;
import java.util.List;

// Observer Pattern - إشعارات الحجوزات

// Observer Interface
// Defines the contract for all observer classes to implement the update method
interface Observer {
    void update(String message);
}

// Admin Class
// Represents a concrete implementation of the Observer interface
class Admin implements Observer {

    // Name of the Admin (used for identifying which admin received the notification)
    private String name;

    // Constructor to initialize the Admin with a specific name
    public Admin(String name) {
        this.name = name;
    }

    // Implementation of the update method from the Observer interface
    // This method gets called when the subject (e.g., BookingNotifier) sends a notification
    public void update(String message) {
        // Prints the notification message along with the admin's name
        System.out.println("Admin " + name + " received notification: " + message);
    }
}
