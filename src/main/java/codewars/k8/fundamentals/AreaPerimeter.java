package codewars.k8.fundamentals;

/**
 * Area or Perimeter
 *
 * You are given the length and width of a 4-sided polygon.
 * The polygon can either be a rectangle or a square.
 * If it is a square, return its area. If it is a rectangle,
 * return its perimeter.
 *
 * area_or_perimeter(6, 10) --> 32
 * area_or_perimeter(4, 4) --> 16
 *
 *     Note: for the purposes of this kata you will assume that it is a square
 *     if its length and width are equal, otherwise it is a rectangle.
 */

public class AreaPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        int calculation;
        if(l == w) {
            calculation = l * w;
        } else {
            calculation = l + l + w + w;
        }
        return calculation;
    }
}

/*
public static int areaOrPerimeter (int a, int b) {
        return a == b ? a * b : 2 * ( a + b );
    }
 */