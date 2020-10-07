package codewars.k8.functional;

import java.util.Arrays;

/**
 * Calculate average
 * Write function avg which calculates average of numbers in given list.
 */

public class CalcAvg {
    public static double find_average(int[] array){
//        double sum = 0.0;
//        for(int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return sum / array.length;
        return Arrays.stream(array).average().getAsDouble();
    }
}

/*
return Arrays.stream(array).average().orElse(0);
 */
