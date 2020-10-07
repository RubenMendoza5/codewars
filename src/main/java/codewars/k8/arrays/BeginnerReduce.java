package codewars.k8.arrays;

/**
 * Beginner - Reduce but Grow
 *
 * Given a non-empty array of integers, return the result of multiplying
 * the values together in order. Example:
 * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */
public class BeginnerReduce {

    public static int grow(int[] x){
        int mul = 1;
        for(int n = 0; n < x.length; n++) {
            mul = x[n] * mul;
        }
        return mul;
    }
}

/*
public static int grow(int[] x){
    int result = 1;
    for (int a : x) {
      result *= a;
    }
    return result;
  }

return IntStream.of(x).reduce(1, (a, b) -> a * b);
 */