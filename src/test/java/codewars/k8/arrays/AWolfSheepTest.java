package codewars.k8.arrays;

import codewars.k8.arrays.AWolfSheep;
import org.junit.Test;

import static org.junit.Assert.*;

public class AWolfSheepTest {

    @Test
    public void testSomething() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", AWolfSheep.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", AWolfSheep.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", AWolfSheep.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", AWolfSheep.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", AWolfSheep.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }

}