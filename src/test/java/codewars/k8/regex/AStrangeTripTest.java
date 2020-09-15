package codewars.k8.regex;

import codewars.k8.regex.AStrangeTrip;
import org.junit.Test;

import static org.junit.Assert.*;

public class AStrangeTripTest {

    @Test
    public void testBasicTrue() {
        String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
        System.out.println(n);
        assertTrue(AStrangeTrip.isLockNessMonster(n));
    }
    @Test
    public void testBasicFalse() {
        String n = "Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.";
        System.out.println(n);
        assertFalse(AStrangeTrip.isLockNessMonster(n));
    }
}