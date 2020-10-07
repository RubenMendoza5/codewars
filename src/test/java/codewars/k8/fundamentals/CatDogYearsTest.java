package codewars.k8.fundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatDogYearsTest {
    @Test
    public void one() {
        assertArrayEquals(new int[]{1,15,15}, CatDogYears.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,24,24},CatDogYears.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,56,64}, CatDogYears.humanYearsCatYearsDogYears(10));
    }

}