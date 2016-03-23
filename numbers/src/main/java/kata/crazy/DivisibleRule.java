package kata.crazy;


import java.util.function.Function;

public class DivisibleRule implements Rule {

    private int divisibleNumber;
    private int divisor;

    public DivisibleRule(int divisibleNumber,int divisor){
         this.divisibleNumber = divisibleNumber;
         this.divisor =   divisor;
    }

    @Override
    public Function<Integer, Integer> rule() {
        return (parameter) -> {
            Integer result = 0;
            if (parameter%divisibleNumber==0)
                result = parameter/divisor;
            return result;
        };
    }
}
