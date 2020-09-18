package codewars.k8.mathematics;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class BasicMathOpsTest {
    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(BasicMathOps.basicMath("+", 4, 7), is(11));
        assertThat(BasicMathOps.basicMath("-", 15, 18), is(-3));
        assertThat(BasicMathOps.basicMath("*", 5, 5), is(25));
        assertThat(BasicMathOps.basicMath("/", 49, 7), is(7));
    }
}