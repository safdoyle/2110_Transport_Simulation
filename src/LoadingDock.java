/**
 * Author: Safiya Doyle | B00915654
 * CSC1 2110
 * Assignment 2 | 28 February 2024
 * Objects of this class are loading docks. They have
 * a circular array ("buses") that stores all buses in
 * the dock. They also possess a value for the maximum
 * number of buses that can be stored (numBuses), a value indicating
 * the index of the bus at front that is available to board
 * passengers (front) and a value that indicates the number of buses
 * currently present at the dock (size).
 */

import java.util.*;
public class LoadingDock {

    // Declaring/ initializing necessary attributes for each loading dock object.
    private Bus[] buses;

    private int numBuses;

    private int front = 0;

    private int size = 0;

    /**
     * Constructor for creating new LoadingDock objects.
     * @param numBuses integer value for the number of buses
     *                 present at the dock.
     */
    public LoadingDock(int numBuses){
        this.buses = new Bus[numBuses];
        this.numBuses = numBuses;
    }

    /**
     * Method to check if there are no buses at the dock.
     */
    public boolean isEmpty(){
        return (size == 0);
    }

    /**
     * Method to return the bus at the front of the line.
     * @return Returns the bus at the front of the dock
     *         (at front of "buses" array) or null if
     *         the dock is empty.
     */
    public Bus getFrontBus() {
        if(this.isEmpty()){
            return null;
        } else {
            return this.buses[this.front];
        }
    }

    /**
     *  Method to add a bus to the back of the line and
     *  store the new number of buses present. This
     *  method is used for new buses or looped buses
     *  where applicable.
     * @param busToMove This is the Bus object to add
     *                  to the line.
     */
    public void enqueue(Bus busToMove) throws IllegalStateException{

        if(this.size == this.numBuses) {
            throw new IllegalStateException("Dock is full");

        } else if (this.size < this.numBuses){
            int i = (this.front + this.size) % this.numBuses;
            this.buses[i] = busToMove;
            this.size++;
        }
    }

    /**
     * Method to remove the bus at the front of the line
     * and decrease the number of buses present by 1.
     * This method is used for departing buses or looped
     * buses where applicable.
     * return Returns the Bus object at the front
     *        of the line (busToMove) or null if the dock
     *        is empty.
     */
    public Bus dequeue(){
        if(this.isEmpty()){
            return null;
        } else if(this.size > 0){
            Bus busToMove = this.buses[this.front];
            this.front = (this.front + 1) % this.numBuses;
            this.size--;
            return busToMove;
        }
        return null;
    }
}
