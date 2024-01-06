public class Hello{
    public static void main(String[] args) {
        MathOperation increment = x -> x + 2;
        int result = increment.operation(3);
        System.out.println("result = " + result);

        OtherOperation multiply = y -> y * 2;
        int number = multiply.operation(3);
        System.out.println("number = " + number);

        //different interface assignment doesn't work even same method signature
        multiply = increment;
        System.out.println("assign = " + multiply.operation(3));
    }   
}

interface MathOperation{
    int operation(int i);
}

interface OtherOperation{
    int operation(int i);
}