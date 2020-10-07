package codewars.k8.fundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class Beginner4CockroachTest {
    @Test
    public void basicTests() throws Exception{
        Beginner4Cockroach cockroach = new Beginner4Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }

}