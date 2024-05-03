/**
 * Author: Safiya Doyle | B00915654
 * CSC1 2110
 * Assignment 2 | 28 February 2024
 * Objects of this class are buses. They each have a number
 * of doors which determines the way they are offloaded and
 * an ArrayList of Passenger objects that stores all the
 * bus' passengers.
 */

import java.util.*;
public class Bus {

    // Initializing the necessary attributes for each bus object.
    private ArrayList<Passenger> passengers = new ArrayList<>();

    private int numDoors = 0;

    /**
     * Constructor for creating new Bus objects.
     * @param numDoors Integer value for the number of doors
     *                 the bus has.
     */
    public Bus(int numDoors){
        this.numDoors = numDoors;
    }

    // Getter method that returns the bus' passenger list.
    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    /**
     * Method that returns the list of passengers in their order
     * of exiting the bus (determined by the number of doors).
     * @return passengerList String listing the passengers in
     *                       order of departure.
     */
    public String offloadPassengers(){
        String passengerList = "";

        if(this.numDoors == 2){
            for(int i = 0; i < this.passengers.size(); i++){
                passengerList = passengerList + this.passengers.get(i).getName() + "\n";
            }
        } else {
            for(int i = this.passengers.size() - 1; i >= 0; i--){
                passengerList = passengerList + this.passengers.get(i).getName() + "\n";
            }
        }

        return passengerList;
    }
}
