package org.molakshar.java.dp;

import org.junit.Assert;
import org.junit.Test;


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
}
