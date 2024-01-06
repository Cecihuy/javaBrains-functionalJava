import java.util.List;
import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args) {
        List<String> names = List.of("Foo", "Bar", "Baz");
        Stream<String> stream = names.stream();
        stream.forEach(cons -> System.out.println(cons));
    }
}