package kata.crazy;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CrazyNumbersTest {




    @Test
    public void whenParameterIsTenThenDivByTwo(){
        CrazyNumbers crazynumbers = new CrazyNumbers();
        assertThat(crazynumbers.result(),is(5));
    }


}
