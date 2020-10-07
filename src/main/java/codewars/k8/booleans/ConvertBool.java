package codewars.k8.booleans;

/**
 * Convert a Boolean to a String
 *Implement a function which convert the given boolean value into its string representation. *
 */

public class ConvertBool {
    public static String convert(boolean b){
        return b == true ? "true" : "false";
    }
}

/*
return b ? "true" : "false";

return Boolean.toString(b);
 */
