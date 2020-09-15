package codewars.k8.strings;

/**
 * Abbreviate a Two Word Name
 *
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 *
 * The output should be two capital letters with a dot separating them.
 *
 * It should look like this:
 * Sam Harris => S.H
 * Patrick Feeney => P.F
 */

public class Abbreviate2WordName {
    public static String abbrevName(String name) {
        String[] arrayName = name.split(" ");
        return arrayName[0].toUpperCase().charAt(0) + "." + arrayName[1].toUpperCase().charAt(0);
    }
}

/*
public static String abbrevName(String name) {
    String[] names = name.split(" ");
    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
  }

public static String abbrevName(String name) {
    return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
  }
 */