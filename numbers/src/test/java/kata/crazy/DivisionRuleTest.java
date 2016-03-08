package kata.crazy;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class DivisionRuleTest {

    @Test
    public void whenParameterIsTen(){
        Integer number = 10;
        Integer divisor = 2;
        Integer result = 5;
        DivisionRule divisionRule = new DivisionRule(number,divisor);
        assertThat(divisionRule.rule.apply(10), is(result));
    }

}
