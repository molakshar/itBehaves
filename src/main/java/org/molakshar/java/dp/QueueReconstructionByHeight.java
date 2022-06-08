package org.molakshar.java.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//406. Queue Reconstruction by Height
//        You are given an array of people, people, which are the attributes of some people in a queue (not necessarily in order). Each people[i] = [hi, ki] represents the ith person of height hi with exactly ki other people in front who have a height greater than or equal to hi.
//
//        Reconstruct and return the queue that is represented by the input array people. The returned queue should be formatted as an array queue, where queue[j] = [hj, kj] is the attributes of the jth person in the queue (queue[0] is the person at the front of the queue).

//        Example 1:

//        Input: people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
//        Output: [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]
//        Explanation:
//        Person 0 has height 5 with no other people taller or the same height in front.
//        Person 1 has height 7 with no other people taller or the same height in front.
//        Person 2 has height 5 with two persons taller or the same height in front, which is person 0 and 1.
//        Person 3 has height 6 with one person taller or the same height in front, which is person 1.
//        Person 4 has height 4 with four people taller or the same height in front, which are people 0, 1, 2, and 3.
//        Person 5 has height 7 with one person taller or the same height in front, which is person 1.
//        Hence [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]] is the reconstructed queue.

//        Example 2:

//        Input: people = [[6,0],[5,0],[4,0],[3,2],[2,2],[1,4]]
//        Output: [[4,0],[5,0],[2,2],[3,2],[1,4],[6,0]]


//        Constraints:

//        1 <= people.length <= 2000
//        0 <= hi <= 106
//        0 <= ki < people.length
//        It is guaranteed that the queue can be reconstructed.



//        https://www.youtube.com/watch?v=_DtZIPUt8jo
//        The algo will be are inserting people based on their k values,
//        starting from Tallest to shorter. So, later no change will occur in k
//        values of tall people when we move shorter people ahead of taller ones.

//        Note
//        add method in arraylist definition
//        public void add(int index, E element)
//        Inserts the specified element at the specified position in this list.
//        Shifts the element currently at that position (if any) and any subsequent elements to the right
//        (adds one to their indices).


//        [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
//        [7,0][7,1][6,1][5,0][5,2][4,4] : after sorting on increasing height and number of people ahead

//        x[1] : 0, x [7,0]
//        result :[7,0]
//        x[1] : 1, x [7,1]
//        result :[7,0][7,1]
//        x[1] : 1, x [6,1]
//        result :[7,0][6,1][7,1]
//        x[1] : 0, x [5,0]
//        result :[5,0][7,0][6,1][7,1]
//        x[1] : 2, x [5,2]
//        result :[5,0][7,0][5,2][6,1][7,1]
//        x[1] : 4, x [4,4]
//        result :[5,0][7,0][5,2][6,1][4,4][7,1]

public class QueueReconstructionByHeight {
    private static int compare(int[] a, int[] b) {
        return a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];
    }

    public static int[][] reconstructQueue(int[][] people) {
        List<int[]> result = new ArrayList();
        Arrays.sort(people, QueueReconstructionByHeight::compare);
        for (int[] x : people) {
            result.add(x[1], x);
        }
        return result.toArray(new int[people.length][2]);
    }
}