package study.chatper_01.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest { //  1)

    @Test // 2)
    public void testAdd() {
        Calculator calculator = new Calculator(); // 3)
        double result = calculator.add(10, 20); // 4)
        assertEquals(30, result, 0); // 5) delta는 부동 소수점의 결과가 오류가 있을경우 자주 쓰인다.
    }
}