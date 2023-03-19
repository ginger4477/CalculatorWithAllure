import io.qameta.allure.*;
import org.example.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNull;

public class CalculatorTest {

    @Test
    public void testIsNumberValid() {
        // test isNumber method with the value: 11
        Float expected = 11.0f;
        Float actual = Calculator.isNumber("11");
        assertEquals(expected, actual, 0.001f);     //a 0.001f pedig a lebegőpontos értékek általános hibahatárát jelöli.

    }

    @Test
    public void testIsNumberNotValid() {
        // test isNumber method with the value: "xyz"
        // Given
        String input = "xyz";

        // When
        Float result = Calculator.isNumber(input);

        // Then
        assertNull(result);
    }

    @Test
    public void testIsValidOperatorValid() {
        // test isValidOperator method with the value: "*"
        // Given
        String operator = "*";

        // When
        boolean result = Calculator.isValidOperator(operator);

        // Then
        assertTrue(result);
    }

    @Test
    public void testCalcPlus() {
        // test addition using the calc method with the values: "+", 5, 7
        // Given
        String operator = "+";
        Float a = 5.0f;
        Float b = 7.0f;

        // When
        Float result = Calculator.calc(operator, a, b);

        // Then
        assertEquals(12.0f, result, 0.0001f);
    }

    @Test
    public void testCalcMinus() {
        // test subtraction using the calc method with the values: "-", 5, 7
        // Given
        String operator = "-";
        Float a = 5.0f;
        Float b = 7.0f;

        // When
        Float result = Calculator.calc(operator, a, b);

        // Then
        assertEquals(-2.0f, result, 0.0001f);
    }

    @Test
    public void testCalcMultiply() {
        // test multiplication using the calc method with the values: "*", 5, 7
        // Given
        String operator = "*";
        Float a = 5.0f;
        Float b = 7.0f;

        // When
        Float result = Calculator.calc(operator, a, b);

        // Then
        assertEquals(35.0f, result, 0.0001f);
    }

    @Test
    public void testCalcDivision() {
        // test division using the calc method with the values: "/", 5, 7
        // Given
        String operator = "/";
        Float a = 5.0f;
        Float b = 7.0f;

        // When
        Float result = Calculator.calc(operator, a, b);

        // Then
        assertEquals(0.7142857f, result, 0.0001f);
    }

}