import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args){
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.filter(num -> num %2 == 0).limit(2).forEach(System.out::println);
    }
}