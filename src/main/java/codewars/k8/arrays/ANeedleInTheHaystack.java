package codewars.k8.arrays;

/**
 * Can you find the needle in the haystack?
 *
 * Write a function findNeedle() that takes an array full of junk but containing one "needle"
 *
 * After your function finds the needle it should return a message (as a string) that says:
 *
 * "found the needle at position " plus the index it found the needle, so:
 *
 * findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
 * should return "found the needle at position 5"
 */

public class ANeedleInTheHaystack {

    public static String findNeedle(Object[] haystack) {
        int position = 0;
        for (int count = 0; count < haystack.length; count++) {
            if (haystack[count] == "needle") {
                position = count;
            }
        }
        return "found the needle at position " + position;
    }
}

/*
public static String findNeedle(Object[] haystack) {
    return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
  }
 */
/*
public static String findNeedle(Object[] haystack) {
    return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
  }
 */
