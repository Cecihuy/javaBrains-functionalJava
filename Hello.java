import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
/*
 * compiler can figure out what input arg is
 */
public class Hello{
    public static void main(String[] args) {
        //lambda without method reference
        Supplier<Double> mySupp = () -> Math.random();                
        //with method reference
        Supplier<Double> mySuppReff = Math::random;

        //lambda without method reference
        Consumer<String> myCons = name -> System.out.println(name);
        //with method reference
        Consumer<String> myConsReff = System.out::println;

        //lambda without method reference
        UnaryOperator<String> myUnaryOp = str -> str.trim();
        //with method reference
        UnaryOperator<String> myUnaryOpReff = String::trim;

        //lambda without method reference
        BiPredicate<String, String> myBinaryPred = (a, b) -> a.equalsIgnoreCase(b);
        //with method reference
        BiPredicate<String, String> myBinaryPredReff = String::equalsIgnoreCase;
    }
}