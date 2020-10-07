package codewars.k8.basiclanguage;

import org.junit.Test;

import static org.junit.Assert.*;

public class CenturyYearTest {
    @Test
    public void FixedTests() {
        assertEquals(18, CenturyYear.century(1705));
        assertEquals(19, CenturyYear.century(1900));
        assertEquals(17, CenturyYear.century(1601));
        assertEquals(20, CenturyYear.century(2000));
        assertEquals(1,  CenturyYear.century(89));
    }

}