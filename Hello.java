public class Hello{
    public static void main(String[] args) {
        MathOperation increment = x -> x + 2;
        int result = increment.operation(3);
        System.out.println("result = " + result);

        MathOperation multiply = y -> y * 2;
        int number = multiply.operation(3);
        System.out.println("number = " + number);

        //polymorphism possible here
        multiply = increment;
        System.out.println("assign = " + multiply.operation(3));
    }   
}

interface MathOperation{
    int operation(int i);
}