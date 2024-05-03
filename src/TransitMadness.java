/**
 * Author: Safiya Doyle | B00915654
 * CSC1 2110
 * Assignment 2 | 28 February 2024
 * This class creates a loading dock object by receiving
 * the number of buses and type of each bus from the user.
 * It then boards passengers, offloads passengers,
 * dispatches buses and loops buses in the loading dock
 * according to user instructions.
 */

import java.util.*;
public class TransitMadness {

    public static void main(String args[]){

        // Initializing scanner
        Scanner in = new Scanner(System.in);

        // Receiving the number of buses from user.
        int numBuses  = in.nextInt();

        //Creating the loading dock.
        LoadingDock loadingDock = new LoadingDock(numBuses);

        for(int i = 0; i < numBuses; i++){
            int numDoors = in.nextInt();
            loadingDock.enqueue(new Bus(numDoors));
        }

        /**
         * Receiving length of manifest from user service instructions from user
         * and following instructions accordingly.
         */
        int manifestLength = in.nextInt();

        for(int i = 0; i < manifestLength; i++){
            String transportationTask = in.next();
            if(transportationTask.equals("loop")){
                Bus busToMove = loadingDock.dequeue();
                loadingDock.enqueue(busToMove);
            } else if(transportationTask.equals("depart")){
                Bus busToMove = loadingDock.dequeue();
                System.out.print(busToMove.offloadPassengers());
            } else {
                loadingDock.getFrontBus().getPassengers().add(new Passenger(transportationTask));
            }
        }

    }
}