import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args){
        Stream<Integer> numbers = Stream.of(1,2,9,8,3,4,5,6,7,8,9,10);
        numbers.distinct()
            .sorted()
            .forEach(System.out::println);
    }
}