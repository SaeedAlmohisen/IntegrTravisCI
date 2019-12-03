import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void test1() {
        assertEquals(2, Calculator.add(5, 6));
    }

    @Test
    void test2(){
        assertEquals(11, Calculator.add(5, 6));
    }
}