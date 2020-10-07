package codewars.k8.fundamentals;

import org.junit.Test;

import java.time.Clock;

import static org.junit.Assert.*;

public class Beginner2ClockTest {

    @Test
    public void test1(){
        assertEquals(61000, Beginner2Clock.Past(0,1,1));
    }
}
