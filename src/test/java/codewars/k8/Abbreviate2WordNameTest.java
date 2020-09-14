package codewars.k8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Abbreviate2WordNameTest {

    @Test
    public void testFixed() {
        assertEquals("S.H", Abbreviate2WordName.abbrevName("Sam Harris"));
        assertEquals("P.F", Abbreviate2WordName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", Abbreviate2WordName.abbrevName("Evan Cole"));
        assertEquals("P.F", Abbreviate2WordName.abbrevName("P Favuzzi"));
        assertEquals("D.M", Abbreviate2WordName.abbrevName("David Mendieta"));
    }

}