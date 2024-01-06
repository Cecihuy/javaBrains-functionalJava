import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args){
        Stream<String> names = Stream.of("apple", "banana", "mango", "strawberry");
        names.limit(2)
            .map(String::toUpperCase)            
            .forEach(System.out::println);
    }
}