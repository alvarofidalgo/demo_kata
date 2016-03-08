package kata.crazy;

import java.util.function.Function;


public class DivisionRule {

    private Integer numberCheck;
    private Integer numberDivision;

    public DivisionRule(Integer numberCheck, Integer numberdivision){
        this.numberCheck = numberCheck;
        this.numberDivision = numberdivision;
    }

    public Function<Integer,Integer> rule  =(parameter) -> {
        if (parameter==numberCheck)
           return parameter/numberDivision;
        return 0;
    };
}
