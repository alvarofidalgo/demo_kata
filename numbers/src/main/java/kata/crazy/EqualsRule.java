package kata.crazy;

import java.util.function.Function;


public class EqualsRule implements Rule {

    private Integer numberCheck;
    private Integer numberDivision;

    public EqualsRule(Integer numberCheck, Integer numberDivision){
        this.numberCheck = numberCheck;
        this.numberDivision = numberDivision;
    }

    public Function<Integer,Integer> rule() {
       return (parameter) -> {
            Integer result = 0;
            if (parameter.equals(numberCheck))
                result = parameter / numberDivision;
            return result;
        };
    }
}
