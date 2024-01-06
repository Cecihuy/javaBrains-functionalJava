public class Hello{
    public static int doMath(IntOperation op, int a, int b){
        return op.doOperation(a, b);
    }
    public static void main(String[] args) {
        IntOperation addition = (x, y) -> x + y;
        IntOperation subtract = (x, y) -> x - y;

        int print = doMath(addition, 3, 2);
        int result = doMath(subtract, 3, 2);

        System.out.println(print);
        System.out.println(result);
    }
}

interface IntOperation{
    int doOperation(int i, int j);
}