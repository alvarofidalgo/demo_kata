package kata.crazy;


import java.util.List;


public class CrazyNumbers {


    private List<Rule> rules;

    public CrazyNumbers(List<Rule> rules){
       this.rules = rules;
    }


    public int result(int parameter) {
       return rules.stream()
               .reduce(0,
                       (sum, rule) -> sum + rule.rule().apply(parameter),
                       Integer::sum);

    }
}
