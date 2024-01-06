import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class Hello{
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> myFunc = (num1, num2) -> num1 * num2;
        myFunc.apply(7,9);

        BiFunction<Integer, Integer, String> myFunc2 = (num1, num2) -> "Value is " + (num1 + num2);
        myFunc2.apply(7,9);

        BiConsumer<Integer, String> myCons = (num, name) -> System.out.println("Hello " + num + " " + name);
        myCons.accept(1, "Koushik");

        //there is no BiSupplier
        Supplier<Double> mySupp = () -> Math.random();
        mySupp.get();

        BiPredicate<Integer, Integer> myPred = (num1, num2) -> (num1 % 2) == num2;
        myPred.test(7, 9);
    }
}