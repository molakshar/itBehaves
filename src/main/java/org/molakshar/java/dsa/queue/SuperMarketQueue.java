package org.molakshar.java.dsa.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 * There is a queue for the self-checkout tills at the supermarket.
 * Your task is write a function to calculate the total time required for all the customers to check out!
 *
 *The function has two input variables:
 *
 * customers: an array of positive integers representing the queue.
 * Each integer represents a customer, and its value is the amount of time they require to check out.
 * n: a positive integer, the number of checkout tills.
 * The function should return an integer, the total time required.
 *
 * queueTime([5,3,4], 1)
 * // should return 12
 * // because when there is 1 till, the total time is just the sum of the times
 *
 * queueTime([10,2,3,3], 2)
 * // should return 10
 * // because here n=2 and the 2nd, 3rd, and 4th people in the
 * // queue finish before the 1st person has finished.
 *
 * queueTime([2,3,10], 2)
 * // should return 12
 *
 * There is only ONE queue, and
 * The order of the queue NEVER changes, and
 * Assume that the front person in the queue (ie the first element in the array/list)
 * proceeds to a till as soon as it becomes free.
 *
 *
 * N.B. You should assume that all the test input will be valid, as specified above.
 *
 * P.S. The situation in this kata can be likened to the more-computer-science-related idea of a thread pool,
 * with relation to running multiple processes at the same time: https://en.wikipedia.org/wiki/Thread_pool
 */
public class SuperMarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int till) {
        Queue<Integer> smQueue = new PriorityQueue();

        // initialise the queue
        for (int index = 0; index < till; index++)
            smQueue.add(0);

        // process the customer
        for (int customer: customers)
            smQueue.add(smQueue.remove() + customer);

        return Collections.max(smQueue);
    }
}
