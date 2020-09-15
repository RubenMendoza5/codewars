package codewars.k8.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreYouBanjoTest {

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", AreYouBanjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", AreYouBanjo.areYouPlayingBanjo("Rikke"));
    }
}
