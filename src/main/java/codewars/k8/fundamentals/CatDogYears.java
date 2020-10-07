package codewars.k8.fundamentals;

/**
 * Cat years, Dog years
 *
 * I have a cat and a dog.
 * I got them at the same time as kitten/puppy. That was humanYears years ago.
 * Return their respective ages now as [humanYears,catYears,dogYears]
 *
 * NOTES:
 *     humanYears >= 1
 *     humanYears are whole numbers only
 *
 * Cat Years
 *     15 cat years for first year
 *     +9 cat years for second year
 *     +4 cat years for each year after that
 *
 * Dog Years
 *     15 dog years for first year
 *     +9 dog years for second year
 *     +5 dog years for each year after that
 */
public class CatDogYears {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 1;
        int dogYears = 1;
        catYears = humanYears >= 3 ? (15 + 9 + (humanYears-2)*4) : humanYears >= 2 ? (15 + 9) : 15;
        dogYears = humanYears >= 3 ? (15 + 9 + (humanYears-2)*5) : humanYears >= 2 ? (15 + 9) : 15;
        return new int[]{humanYears,catYears,dogYears};
    }
}

/*
return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
 */