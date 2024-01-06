import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Hello{
    public static void main(String[] args) {
        Function<Person, String> pullName = Person::getName;    //"before is" p -> p.getName()

        Person person1 = new Person("Foo", 25);
        Person person2 = new Person("Bar", 45);

        BiPredicate<Person, Person> checkEqual = Person::equals;    //"before is" (p1, p2) -> p1.equals(p2) "also" Object::equals

        Function<List<String>, Integer> checkSize = List::size;    //"before is" list -> list.size()

        Function<List<String>, Collection<String>> dedupe = HashSet::new;   //"before is" list -> new HashSet<>(list)
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}