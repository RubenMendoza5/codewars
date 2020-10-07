package codewars.k8.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeConciseTest {

    @Test
    public void basicTests() {
        assertEquals("You're a(n) kid", BeConcise.describeAge(9));
        assertEquals("You're a(n) kid", BeConcise.describeAge(10));
        assertEquals("You're a(n) kid", BeConcise.describeAge(11));
        assertEquals("You're a(n) kid", BeConcise.describeAge(12));
        assertEquals("You're a(n) teenager", BeConcise.describeAge(13));
        assertEquals("You're a(n) teenager", BeConcise.describeAge(14));
        assertEquals("You're a(n) teenager", BeConcise.describeAge(15));
        assertEquals("You're a(n) teenager", BeConcise.describeAge(16));
        assertEquals("You're a(n) teenager", BeConcise.describeAge(17));
        assertEquals("You're a(n) adult", BeConcise.describeAge(18));
        assertEquals("You're a(n) adult", BeConcise.describeAge(19));
        assertEquals("You're a(n) adult", BeConcise.describeAge(63));
        assertEquals("You're a(n) adult", BeConcise.describeAge(64));
        assertEquals("You're a(n) elderly", BeConcise.describeAge(65));
        assertEquals("You're a(n) elderly", BeConcise.describeAge(66));
        assertEquals("You're a(n) elderly", BeConcise.describeAge(100));
    }
}
