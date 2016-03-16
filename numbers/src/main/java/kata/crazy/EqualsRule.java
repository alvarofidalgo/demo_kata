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
            if (parameter.equals(numberCheck))
                return parameter / numberDivision;
            return 0;
        };
    }
}
