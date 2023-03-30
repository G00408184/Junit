package ie.atu.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;
    @Test
    public void testAdd(){
        myCalc = new Calculator();
        assertEquals(40, myCalc.add(20,20));
    }
}
