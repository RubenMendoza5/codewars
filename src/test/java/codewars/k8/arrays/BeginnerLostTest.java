package codewars.k8.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeginnerLostTest {

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, BeginnerLost.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, BeginnerLost.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, BeginnerLost.map(new int[] {1, 1, 1, 1, 1, 1}));
    }

}