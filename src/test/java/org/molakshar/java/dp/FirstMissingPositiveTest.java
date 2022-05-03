package org.molakshar.java.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMissingPositiveTest {

    @Test
    public void testFirstMissingPositive_Simple(){
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{0, 2, 2, 4, 0, 1, 0, 1, 3}), 5);
    }

    @Test
    public void testFirstMissingPositive_1(){
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{0, 2, 2}), 1);
    }

    @Test
    public void testFirstMissingPositive_2(){
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{}), 1);
    }

    @Test
    public void testFirstMissingPositive_3(){
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{-1, 0, 2, 3}), 1);
    }

    @Test
    public void testFirstMissingPositive_4(){
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{-1, 0, 2, 1}), 3);
    }

    @Test
    public void testFirstMissingPositive_5(){
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{1, 1, 0, -1, -2}), 2);
    }

    @Test
    public void testFirstMissingPositive_6(){
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{2, 3, -7, 6, 8, 1, -10, 15}), 4);
    }

    @Test
    public void testFirstMissingPositive_7(){
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{2, 3, 7, 6, 8, -1, -10, 15}), 1);
    }

    public static class IsSeatManagerTest {

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
}
