package study.chatper_01.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 20);
        assertEquals(30, result, 0); // delta는 부동 소수점의 결과가 오류가 있을경우 자주 쓰인다.
    }
}