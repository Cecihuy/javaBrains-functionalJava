import java.util.function.Function;

public class Hello{
    public static Function<Integer, Integer> counter(){
        int count = 0;      //2. count become effectively final
        Function<Integer, Integer> increment = x -> count + 1;      //1. you use count here inside lambda
        count = 7;      //3. you can't change value of count because the value is locked by lambda
        return increment;
    }
    public static void main(String[] args) {
        Function<Integer, Integer> cntr = Hello.counter();
        System.out.println(cntr.apply(0));
    }
}