import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {
    @Test
    public void FactorialTest1(){
        assertEquals(120, Factorial.calculate(5));
    }
}
