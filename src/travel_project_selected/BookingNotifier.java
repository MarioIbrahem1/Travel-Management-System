/*
 * This code implements the Observer Design Pattern.
 * The Observer pattern defines a one-to-many dependency between objects so that when one object (the subject) changes state,
 * all its dependent objects (observers) are notified and updated automatically.
 */

package travel_project_selected;

import java.util.ArrayList;
import java.util.List;

/**
 * BookingNotifier Class
 * Author: MarioIbrahem
 *
 * This class acts as the Subject in the Observer pattern. 
 * It maintains a list of observers and notifies them about updates, such as booking confirmations.
 */
class BookingNotifier {

    // List to hold all observers who want to receive notifications
    private List<Observer> observers = new ArrayList<>();

    // Method to add an observer to the list
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer from the list
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Method to notify all observers with a specific message
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            // Call the update method of each observer to send the message
            observer.update(message);
        }
    }

    // Placeholder method for sending notifications (implementation not yet provided)
    void sendNotification(String booking_confirmed) {
        throw new UnsupportedOperationException("Not supported yet."); 
        // To change body of generated methods, choose Tools | Templates.
    }
}
