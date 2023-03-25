import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator casio = new Calculator();

@Test
    public void testSum() {
    Assert.assertEquals(casio.sum(10, 50),60);

    //System.out.println(casio.sum(5, 5));
    //int sumNumber = casio.sum(5, 5);
    //System.out.println(sumNumber);
}
@Test
    public void testMinus() {
    Assert.assertEquals(casio.minus(50, 10), 40);
    }
@Test
    public void testMultiply() {
    Assert.assertEquals(casio.multiply(10, 50), 500);
    }
@Test
    public void testDivide() {
    Assert.assertEquals(casio.divide(50, 10),5);
    }
}
