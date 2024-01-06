import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args){
        Stream<Integer> oddNumbers = Stream.of(1,3,5,7,9);
        Stream<Integer> evenNumbers = Stream.of(0,2,4,6,8);

        Stream.concat(evenNumbers, oddNumbers)
            .forEach(System.out::println);
    }
}