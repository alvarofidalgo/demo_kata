package kata.crazy;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class CrazyNumbers {


    private List<Function<Integer,Integer>> rules = new ArrayList<>();

    public CrazyNumbers(){
        rules.add(new DivisionRule(10,2).rule);
        rules.add(new DivisionRule(18,6).rule);
    }


    public int result(int parameter) {
       return rules.stream()
               .reduce(0,
                       (sum, rule) -> rule.apply(parameter),
                       Integer::sum);

    }

}
