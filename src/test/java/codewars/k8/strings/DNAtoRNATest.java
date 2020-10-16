package codewars.k8.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class DNAtoRNATest {

    @Test
    public void testDna() throws Exception {
        DNAtoRNA b = new DNAtoRNA();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        DNAtoRNA b = new DNAtoRNA();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }

}