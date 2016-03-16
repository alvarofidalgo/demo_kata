package kata.crazy;


import java.util.ArrayList;
import java.util.List;

public class RulesBuilder {

    private List<Rule> rules = new ArrayList<>();

    public RulesBuilder(){
        rules.add(new EqualsRule(10,2));
        rules.add(new EqualsRule(18,6));
        rules.add(new DivisibleRule(4,2));
        rules.add(new DivisibleRule(10,5));
    }

    public List<Rule> getRules(){
        return rules;
    }
}
