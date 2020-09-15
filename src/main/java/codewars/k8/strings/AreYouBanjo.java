package codewars.k8.strings;

/**
 * Are You Playing Banjo?
 *
 * Create a function which answers the question "Are you playing banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 *
 * The function takes a name as its only argument, and returns one of the following strings:
 *
 * name + " plays banjo"
 * name + " does not play banjo"
 * Names given are always valid strings.
 */

public class AreYouBanjo {
    public static String areYouPlayingBanjo(String name) {
        String[] nameArray = name.split("");
        String answer= "";
        if (nameArray[0].equals("R")  || nameArray[0].equals("r")) {
            answer = name + " plays banjo";
        } else {
            answer = name + " does not play banjo";
        }
        return answer;
    }
}

/*
public static String areYouPlayingBanjo(String name) {
    if( name.toUpperCase().startsWith("R") )
      return name + " plays banjo";
    else
      return name + " does not play banjo";
  }

public static String areYouPlayingBanjo(String name) {
      return (name.charAt(0) == 'r' || name.charAt(0) == 'R') ? name + " plays banjo" : name + " does not play banjo";
  }
 */