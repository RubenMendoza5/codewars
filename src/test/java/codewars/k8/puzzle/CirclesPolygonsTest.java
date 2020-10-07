package codewars.k8.puzzle;

import org.junit.Test;

import static org.junit.Assert.*;

public class CirclesPolygonsTest {

    @Test
    public void test1(){
        //Square with sides of 5 units
        CirclesPolygons poly=new CirclesPolygons(4, 5);
        assertEquals("5.000", String.format("%.3f", poly.circleDiameter()));
    }

    @Test
    public void test2() {
        //Octogon with sides of 9 units
        CirclesPolygons poly=new CirclesPolygons(8, 9);
        assertEquals("21.728", String.format("%.3f", poly.circleDiameter()));
    }

    @Test
    public void test3() {
        //Triangle with sides of 4 units
        CirclesPolygons poly=new CirclesPolygons(3, 4);
        assertEquals("2.309", String.format("%.3f", poly.circleDiameter()));
    }
}
