package org.molakshar.java.dp;

import java.util.PriorityQueue;
import java.util.Queue;


/** Input
        ["SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"]
        [[5], [], [], [2], [], [], [], [], [5]]
        Output
        [null, 1, 2, null, 2, 3, 4, 5, null]

        Explanation
        SeatManager seatManager = new SeatManager(5); // Initializes a SeatManager with 5 seats.
        seatManager.reserve();    // All seats are available, so return the lowest numbered seat, which is 1.
        seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        seatManager.unreserve(2); // Unreserve seat 2, so now the available seats are [2,3,4,5].
        seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        seatManager.reserve();    // The available seats are [3,4,5], so return the lowest of them, which is 3.
        seatManager.reserve();    // The available seats are [4,5], so return the lowest of them, which is 4.
        seatManager.reserve();    // The only available seat is seat 5, so return 5.
        seatManager.unreserve(5); // Unreserve seat 5, so now the available seats are [5].

        Constraints:

        1 <= n <= 105
        1 <= seatNumber <= n
        For each call to reserve, it is guaranteed that there will be at least one unreserved seat.
        For each call to unreserve, it is guaranteed that seatNumber will be reserved.
        At most 105 calls in total will be made to reserve and unreserve.

**/

// Use a min-heap to keep track of lowest returned seat if any.
// Otherwise reserve the next seat.
public class SeatManager {

    private Queue<Integer> queue;
    private int i = 1;

    public SeatManager(int n) {
        // Step 1- Initialize the queue but will not put values in it
        queue = new PriorityQueue<>();

    }

    // O(log n)
    public int reserve() {
        // Step 2- We return i and increment it as i will
        if (queue.isEmpty())
            return i++;                 // always be smallest if queue is empty

        // Step 4- Queue will have smallest number if it is non empty
        // as i wil be ahead of any unreserved value
        return queue.poll();
    }

    // O(log n)
    public void unreserve(int seatNumber) {

     /** Inserts the specified element into this queue if it is possible to do
     * so immediately without violating capacity restrictions.
     * When using a capacity-restricted queue, this method is generally
     * preferable to {@link #add}, which can fail to insert an element only
     * by throwing an exception. **/

     // Step 3- Adding element which are not present in queue
     queue.offer(seatNumber);

    }
}
