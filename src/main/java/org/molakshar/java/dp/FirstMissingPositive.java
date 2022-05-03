package org.molakshar.java.dp;

/**
 * This is shameless copy from https://leetcode.com/problems/first-missing-positive/
 */
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        // Initialize min.
        int min = 1;
        boolean containsMin = false;
        do {
            // Presume that min isn't contained in the array.
            containsMin = false;
            // We check this.
            for (int i = 0; i < nums.length; i++) {
                /*
                    If min is actually contained, update it by min++.
                    This way we find the largest min by iterating FORWARD.
                */
                if (nums[i] == min) {
                    containsMin = true;
                    min++;
                }
            }
            // Presume that the new min isn't contained
            containsMin = false;
            /*
                Since the array isn't sorted, the new min
                might be contained on a position prior to the old min.
                We check this.
            */
            for (int i = nums.length - 1; i >= 0; i--) {
               /*
                    If min is actually contained, update it by min++.
                    This way we find the largest min by iterating BACKWARD.
                */
                if (nums[i] == min) {
                    containsMin = true;
                    min++;
                }
            }
            // Eventually min won't be found neither by iterating forward, nor backward.
        } while(containsMin);
        return min;
    }
}
