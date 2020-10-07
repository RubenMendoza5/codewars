package codewars.k8.oop;

import java.util.Random;

/**
 * Color Ghost *
 * Create a class Ghost *
 * Ghost objects are instantiated without any arguments. *
 * Ghost objects are given a random color attribute of white" or "yellow" or "purple" or "red" when instantiated *
 * Ghost ghost = new Ghost();
 * ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 */

public class ColorGhost {

    public String getColor() {
        String[] stringColor = {"white", "red", "purple", "yellow"};
        Random random = new Random();
        return stringColor[random.nextInt(stringColor.length)];
    }
}

/*
static String getColor() {
    return of("white", "yellow", "purple", "red").get(new Random().nextInt(4));
  }
 */