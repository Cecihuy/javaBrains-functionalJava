import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Hello{
    public static void main(String[] args) {
        Function<Integer, Integer> myFunc = x -> x * 2;
        myFunc.apply(7);

        Function<Integer, String> myFunc2 = num -> "Value is " + num;
        myFunc2.apply(7);

        Consumer<String> myCons = name -> System.out.println("Hello " + name);
        myCons.accept("Koushik");

        Supplier<Double> mySupp = () -> Math.random();
        mySupp.get();

        Predicate<Integer> myPred = num -> (num % 2) == 0;
        myPred.test(7);

        //this is not part of function package.
        Runnable myRunn = () -> System.out.println();
        myRunn.run();
    }
}