/*
 * This code demonstrates the Prototype Design Pattern.
 * The Prototype pattern is used to create new objects by copying an existing object (prototype).
 * It reduces the need to reinitialize objects directly and allows for easy object duplication.
 */

package travel_project_selected;

/**
 * Prototype Interface
 * Author: MarioIbrahem
 *
 * This interface defines the contract for the Prototype design pattern.
 * Classes implementing this interface must provide a method to clone the object.
 */
public interface Prototype {

    // Method to create and return a copy of the current object
    Prototype clone();  // Must return an exact duplicate of the object.
}
