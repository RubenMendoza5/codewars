package codewars.k8.fundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllStar18Test {

    @Test
    public void testSomething() {
        assertEquals(1, AllStar18.strCount("Hello", 'o'));
        assertEquals(2, AllStar18.strCount("Hello", 'l'));
        assertEquals(0, AllStar18.strCount("",'z'));
    }
}
