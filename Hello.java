import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args){
        Stream<String> names = Stream.of("apple", "banana", "mango", "strawberry");
        names.map(String::toUpperCase)
            .peek(str -> System.out.println("Peek result : " + str))
            .filter(name -> name.length() < 6)
            .forEach(System.out::println);
    }
}