package codewars.k8.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertNumArrTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ConvertNumArr.digitize(35231));
    }

}