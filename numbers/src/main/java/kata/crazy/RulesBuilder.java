package kata.crazy;


import java.util.ArrayList;
import java.util.List;

public class RulesBuilder {

    private List<Rule> rules = new ArrayList<>();


    public RulesBuilder(){
        Integer two = 2,ten = 10, four = 4, five =5,six=6, eighteen =18;
        rules.add(new EqualsRule(ten, two));
        rules.add(new EqualsRule(eighteen,six));
        rules.add(new DivisibleRule(four, two));
        rules.add(new DivisibleRule(ten,five));
    }

    public List<Rule> getRules(){
        return rules;
    }
}
