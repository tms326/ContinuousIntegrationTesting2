import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcTest {

    @Test
    void additionTest(){
        Assertions.assertEquals(Calculator.calculator("1+1"),2);
    }
    @Test
    void subtractionTest(){
        Assertions.assertEquals(Calculator.calculator("1-1"),0);
    }
    @Test
    void multiplicationTest(){
        Assertions.assertEquals(Calculator.calculator("1*1"),1);
    }
    @Test
    void DivisionTest(){
        Assertions.assertEquals(Calculator.calculator("1/1"),1);
    }
    @Test
    void failingTest(){
        Assertions.assertEquals(Calculator.calculator("2+2+6-2"),8);
    }
}
