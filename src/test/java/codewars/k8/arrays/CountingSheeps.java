package codewars.k8.arrays;

/**
 * Counting sheep...
 * Consider an array/list of sheep where some sheep may be missing from their place.
 * We need a function that counts the number of sheep present in the array (true means present).
 *
 * For example,
 * [true,  true,  true,  false,
 *   true,  true,  true,  true ,
 *   true,  false, true,  false,
 *   true,  false, false, true ,
 *   true,  true,  true,  true ,
 *   false, false, true,  true]
 *
 * The correct answer would be 17.
 *
 * Hint: Don't forget to check for bad values like null/undefined
 */

public class CountingSheeps {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for(int i = 0; i < arrayOfSheeps.length; i++) {
            if(arrayOfSheeps[i]) count++;
        }
        return count;
    }
}

/*
int count = 0;
for (Boolean b : arrayOfSheeps) if (b) count++;
return count;

return (int) Arrays.stream(arrayOfSheeps).filter(Boolean::booleanValue).count();
 */
