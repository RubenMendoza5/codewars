package codewars.k8.puzzle;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOddTest {
    @Test
    public void fixedTests() {
        assertEquals(7, CountOdd.oddCount(15));
        assertEquals(7511, CountOdd.oddCount(15023));
    }

}