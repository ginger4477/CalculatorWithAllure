import io.qameta.allure.*;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


@Epic("Epic1")
public class CalculatorTest {

    @Test
    @Story("User story1")
    @Description("Discription related to testAdd test")
    @Severity(SeverityLevel.NORMAL)
    public void testAdd() {
        Calculator calculator = createCalc();
        Assertions.assertEquals(5, calculator.Add(2, 3));
    }


    @Step("Calculator initialization")
    private Calculator createCalc() {
        return new Calculator();
    }


    @Test
    @Story("User story2")
    public void testAddWithNegativeNumbers() {
        Calculator calculator = createCalc();
        Assertions.assertEquals(-5, calculator.Add(-2, -3));
    }



}
