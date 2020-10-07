package codewars.k8.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertStrToArrTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, ConvertStrToArr.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, ConvertStrToArr.stringToArray("I love arrays they are my favorite"));
    }

}