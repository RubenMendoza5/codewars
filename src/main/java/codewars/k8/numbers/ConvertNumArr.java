package codewars.k8.numbers;

/**
 *Convert number to reversed array of digits
 * Given a random non-negative number, you have to return the digits of
 * this number within an array in reverse order.
 * Example:
 * 348597 => [7,9,5,8,4,3]
 */

public class ConvertNumArr {

    public static int[] digitize(long n) {
        String[] string = String.valueOf(n).split("");
        int[] number = new int[string.length];
        int count = 0;
        for(int i = string.length; i > 0; i--) {
            number[count] = Integer.parseInt(string[i-1]);
            count++;
        }
        return number;
    }
}

/*
return new StringBuilder().append(n)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
 */
