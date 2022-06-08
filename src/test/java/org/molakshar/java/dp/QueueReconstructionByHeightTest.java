package org.molakshar.java.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QueueReconstructionByHeightTest {

    private int [][] people1 = { {7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2} };
    private int [][] reconstructedQueue1 = { {5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};

    private int [][] people2 = { {6,0}, {5,0}, {4,0}, {3,2}, {2,2}, {1,4} };
    private int [][] reconstructedQueue2 = { {4,0}, {5,0}, {2,2}, {3,2}, {1,4}, {6,0}};

    @Test
    public void testFirstMissingPositive_Input1() {
        assertEquals(QueueReconstructionByHeight.reconstructQueue(people1), reconstructedQueue1);
    }

    @Test
    public void testFirstMissingPositive_Input2() {
        assertEquals(QueueReconstructionByHeight.reconstructQueue(people2), reconstructedQueue2);
    }

}
