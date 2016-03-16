package kata.crazy;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DivisionRuleTest {

    int divisibleNumber = 4;
    int divisor = 2;
    private DivisibleRule divisible = new DivisibleRule(divisibleNumber,divisor);


    @Test
    public void whenNumberIsMultipleFourDivideByTwo(){
        int number = 4;
        int expected=2;
        assertThat(divisible.rule().apply(number),is(expected));

    }



}
