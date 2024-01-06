import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args) throws IOException {
        System.out.println("- collection API -");
        Set<String> names = Set.of("Foo", "Bar", "Baz");
        Stream<String> stream = names.stream();
        stream.forEach(cons -> System.out.println(cons));

        System.out.println("-array-");
        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers).forEach(System.out::println);
        
        System.out.println("-stream of-");
        Stream.of("mango", "banana","strawberry").forEach(System.out::println);

        System.out.println("-get data text inside file-");
        Stream<String> isiData = Files.lines(Paths.get("README.md"));
        isiData.forEach(System.out::println);

        System.out.println("-generate random value-");
        Stream.generate(new Random()::nextDouble)
            .limit(10)
            .forEach(System.out::println);

        System.out.println("-iterate-");
        Stream.iterate(3, num -> num + 2)
            .limit(5)
            .forEach(System.out::println);
    }
}