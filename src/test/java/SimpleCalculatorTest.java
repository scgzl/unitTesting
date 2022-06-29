
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
     void twoPlusTwoShouldEqualFour(){
        SimpleCalculator calculator = new SimpleCalculator();
       assertEquals(4,calculator.add(2,2));

    }

    @Test
    void threePlusSevenShouldEqualTen(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10,calculator.add(3,7));
    }
}