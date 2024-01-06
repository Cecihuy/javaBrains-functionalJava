import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Hello{
    public static void main(String[] args) {
        UnaryOperator<Integer> myFunc = num -> num * 9;
        myFunc.apply(7);

        BinaryOperator<String> myFunc2 = (num1, num2) -> "Value is " + num1 + num2;
        myFunc2.apply("Java", "Koushik");
    }
}