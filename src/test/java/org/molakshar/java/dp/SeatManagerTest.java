package org.molakshar.java.dp;

import org.junit.Test;


public class SeatManagerTest {

    @Test
    public void testSeatManager_Simple(){

        SeatManager seatManager = new SeatManager(5); // Initializes a SeatManager with 5 seats.
        // All seats are available, so return the lowest numbered seat, which is 1.
        System.out.println(seatManager.reserve());
        System.out.println(seatManager);

        // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        System.out.println(seatManager.reserve());
        // Unreserve seat 2, so now the available seats are [2,3,4,5].
        seatManager.unreserve(2);
        // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        System.out.println(seatManager.reserve());
        // The available seats are [3,4,5], so return the lowest of them, which is 3.
        System.out.println(seatManager.reserve());
        // The available seats are [4,5], so return the lowest of them, which is 4.
        System.out.println(seatManager.reserve());
        // The only available seat is seat 5, so return 5.
        System.out.println(seatManager.reserve());
        // Unreserve seat 5, so now the available seats are [5].
        seatManager.unreserve(5);

    }

}
