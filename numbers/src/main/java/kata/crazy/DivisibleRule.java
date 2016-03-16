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
            if (parameter%divisibleNumber==0)
                return parameter/divisor;
            return 0;
        };
    }
}
