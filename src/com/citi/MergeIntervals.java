package com.citi;

import java.util.*;

public class MergeIntervals {

	public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

            // If result is empty OR no overlap
            if (result.isEmpty() || interval[0] > result.get(result.size() - 1)[1]) {
                result.add(interval);
            } 
            else {
                // Merge intervals
                result.get(result.size() - 1)[1] = Math.max(
                        result.get(result.size() - 1)[1],
                        interval[1]
                );
            }
        }

        // Convert List<int[]> to int[][]
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals sol = new MergeIntervals();

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {2,4},
            {8, 10},
            {15, 18}
        };

        int[][] merged = sol.merge(intervals);

        // Print result
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}