package codewars.k8.arrays;

import java.util.Arrays;

/**
 * A wolf in sheep's clothing
 *
 * Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep.
 * Fortunately, you are good at spotting them.
 *
 * Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:
 * [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
 *    7      6      5      4      3            2      1
 *
 * If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep".
 * Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
 *
 * Note: there will always be exactly one wolf in the array.
 *
 * warnTheSheep(["sheep", "sheep", "sheep", "wolf", "sheep"]) === "Oi! Sheep number 1! You are about to be eaten by a wolf!"
 *
 * warnTheSheep(["sheep", "sheep", "wolf"]) === "Pls go away and stop eating my sheep"
 */

public class AWolfSheep {

    public static String warnTheSheep(String[] array) {
        int index = Arrays.asList(array).indexOf("wolf");
        int position = Arrays.asList(array).size();
        if(position -1 == index) {
            return "Pls go away and stop eating my sheep";
        } else {
            return "Oi! Sheep number " + (position - index - 1) + "! You are about to be eaten by a wolf!";
        }
    }
}

/*
public static String warnTheSheep(String[] array) {
    Collections.reverse(Arrays.asList(array));
    int pos = Arrays.asList(array).indexOf("wolf");
    return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
  }


public static String warnTheSheep(String[] array)
  {
    int wolfN = java.util.Arrays.asList(array).indexOf("wolf") + 1;
    return wolfN == array.length ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + (array.length - wolfN) + "! You are about to be eaten by a wolf!";
  }
 */