package kata.crazy;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CrazyNumbersTest {


    private CrazyNumbers crazynumbers;

    @Before
    public void setUp(){
        crazynumbers = new CrazyNumbers();
    }

    @Test
    public void whenParameterIsTenThenDivByTwo(){
        assertThat(crazynumbers.result(10),is(5));
    }

    @Test
    public void whenParameterIsEigthTeenThenDivBySix(){
        assertThat(crazynumbers.result(18),is(3));
    }


}
