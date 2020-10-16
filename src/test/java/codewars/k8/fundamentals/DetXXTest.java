package codewars.k8.fundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class DetXXTest {

    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", DetXX.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", DetXX.chromosomeCheck("XX"));
    }
}
