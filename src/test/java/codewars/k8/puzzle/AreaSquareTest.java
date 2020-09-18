package codewars.k8.puzzle;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreaSquareTest {
    private static final double DELTA = 1e-15;
    @Test
    public void basicTests() {
        assertEquals(1.62, AreaSquare.squareArea(2),DELTA);
        assertEquals(0, AreaSquare.squareArea(0),DELTA);
        assertEquals(80, AreaSquare.squareArea(14.05),DELTA);
    }
}
