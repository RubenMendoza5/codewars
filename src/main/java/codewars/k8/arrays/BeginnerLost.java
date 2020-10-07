package codewars.k8.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *Beginner - Lost Without a Map
 *
 * Given an array of integers, return a new array with each value doubled.
 *
 * For example:
 *
 * [1, 2, 3] --> [2, 4, 6]
 *
 * For the beginner, try to use the map method - it comes in very handy
 * quite a lot so is a good one to know.
 */

public class BeginnerLost {
    public static int[] map(int[] arr) {
        for(int n = 0; n < arr.length; n++) {
            arr[n] = arr[n] * 2;
        }
        return arr;
    }
}

/*
 return Arrays.stream(arr).map(x -> x*2).toArray();
 */