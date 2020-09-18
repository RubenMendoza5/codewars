package codewars.k8.classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicSubclassTest {

    @Test
    public void makingAdam(){
        BasicSubclass.Human[] paradise = BasicSubclass.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof BasicSubclass.Man);
    }

}