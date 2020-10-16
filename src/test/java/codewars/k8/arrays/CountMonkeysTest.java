package codewars.k8.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountMonkeysTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1,2,3,4,5},CountMonkeys.monkeyCount(5));
        assertArrayEquals(new int[]{1,2,3},CountMonkeys.monkeyCount(3));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9},CountMonkeys.monkeyCount(9));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10},CountMonkeys.monkeyCount(10));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},CountMonkeys.monkeyCount(20));
    }
}
