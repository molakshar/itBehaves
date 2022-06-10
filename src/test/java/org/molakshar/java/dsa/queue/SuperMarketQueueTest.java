package org.molakshar.java.dsa.queue;

import org.junit.Test;
import org.molakshar.java.dp.QueueReconstructionByHeight;

import static org.junit.Assert.assertEquals;


public class SuperMarketQueueTest {

    private int [] customer1 = { 2, 2, 4 };
    private int [] customer2 = { 10, 2, 3, 3 };
    private int [] customer3 = { 2, 3, 10 };

    @Test
    public void testSuperMarketQueue_Input1() {
        assertEquals(SuperMarketQueue.solveSuperMarketQueue(customer1, 1), 8);
    }

    @Test
    public void testSuperMarketQueue_Input2() {
        assertEquals(SuperMarketQueue.solveSuperMarketQueue(customer2, 2), 10);
    }

    @Test
    public void testSuperMarketQueue_Input3() {
        assertEquals(SuperMarketQueue.solveSuperMarketQueue(customer3, 2), 12);
    }
}
