package codewars.k8.fundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreaPerimeterTest {

    @Test
    public void basicTests() {
        assertEquals(16, AreaPerimeter.areaOrPerimeter(4, 4));
        assertEquals(32, AreaPerimeter.areaOrPerimeter(6, 10));
    }
}
