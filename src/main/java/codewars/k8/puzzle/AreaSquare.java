package codewars.k8.puzzle;

import java.text.DecimalFormat;

/**
 * Area of a Square
 *
 * Complete the function that calculates the area of the red square,
 * when the length of the circular arc A is given as the input.
 * Return the result rounded to two decimals.
 *
 * Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)
 */

public class AreaSquare {


    public static double squareArea(double A){
        return Math.round((Math.pow((A * 180)/(90 * Math.PI), 2)) * 100.0) / 100.0;
    }
}
