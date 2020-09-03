package codewars.k8;

import org.junit.Test;

import static org.junit.Assert.*;

public class DalmatiansSquashTheBugsTest {

    @Test
    public void basicTests() {
        assertEquals("More than a handful!",DalmatiansSquashTheBugs.howManyDalmatians(26));
        assertEquals("Hardly any" ,DalmatiansSquashTheBugs.howManyDalmatians(8));
        assertEquals("More than a handful!" ,DalmatiansSquashTheBugs.howManyDalmatians(14));
        assertEquals("Woah that's a lot of dogs!" ,DalmatiansSquashTheBugs.howManyDalmatians(80));
        assertEquals("Woah that's a lot of dogs!" ,DalmatiansSquashTheBugs.howManyDalmatians(100));
        assertEquals("101 DALMATIANS!!!" ,DalmatiansSquashTheBugs.howManyDalmatians(101));
    }
}
