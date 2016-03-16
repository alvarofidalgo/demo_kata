package kata.crazy;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class EqualsRuleTest {

    @Test
    public void whenParameterIsTen(){
        Integer number = 10;
        Integer divisor = 2;
        Integer result = 5;
        EqualsRule equalsRule = new EqualsRule(number,divisor);
        assertThat(equalsRule.rule().apply(10), is(result));
    }

}
