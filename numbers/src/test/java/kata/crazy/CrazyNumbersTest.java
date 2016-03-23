package kata.crazy;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CrazyNumbersTest {


    private CrazyNumbers crazynumbers;

    @Before
    public void setUp(){
        crazynumbers = new CrazyNumbers(new RulesBuilder().getRules());
    }

    @Test
    public void whenParameterIsTenThenDivByTwoSumWithDivByTwo(){
        int number = 10;
        int expected = 7;
        assertThat(crazynumbers.result(number),is(expected));
    }

    @Test
    public void whenParameterIsEightTeenThenDivBySix(){
        int number = 18;
        int expected = 3;
        assertThat(crazynumbers.result(number),is(expected));
    }

    @Test
    public void whenParameterIsFourMultipleThenResultShouldBeNumberDivByTwo(){
       int number = 4;
       int expected = 2;
       assertThat(crazynumbers.result(number),is(expected));
    }

    @Test
    public void whenParameterIsTenMultipleThenResultShouldBeNumberDivFive(){
        int number = 30;
        int expected = 6;
        assertThat(crazynumbers.result(number),is(expected));
    }
}
