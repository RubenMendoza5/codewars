package codewars.k8.algoritms;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoBonusTest {
    @Test
    public void basicTests() {
        boolean wellConfigured=unicodeTest();
        assertEquals((wellConfigured?"£":"\u00A3")+"100000",DoBonus.bonusTime(10000, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"250000",DoBonus.bonusTime(25000, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"10000",DoBonus.bonusTime(10000, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"60000",DoBonus.bonusTime(60000, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"20",DoBonus.bonusTime(2, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"78",DoBonus.bonusTime(78, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"678900",DoBonus.bonusTime(67890, true));
    }

    public boolean unicodeTest(){
        System.out.println("\u00A3 == £:"+"\u00A3".equalsIgnoreCase("£"));
        System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
        return "\u00A3".equalsIgnoreCase("£");
    }
}