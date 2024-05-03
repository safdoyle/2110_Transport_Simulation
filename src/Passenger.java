/**
 * Author: Safiya Doyle | B00915654
 * CSC1 2110
 * Assignment 2 | 28 February 2024
 * Objects of this class are passengers.
 * They each have a first name.
 */
public class Passenger {

    // Initializing the name attribute for each Passenger object.
    private String name = " ";

    /**
     * Constructor to create new Passenger objects.
     * @param name String value representing the
     *             name of the passenger.
     */
    public Passenger(String name){
        this.name = name;
    }

    // Getter that returns a passenger's name.
    public String getName(){
        return this.name;
    }

}
