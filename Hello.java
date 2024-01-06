import java.util.List;
import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args){
        Stream<Student> studenStream = Stream.of(
            new Student(1, "Foo"),
            new Student(2, "Bar"),
            new Student(3, "A")
        );
        List<String> studentNames = studenStream
            .filter(s -> s.getName().length() > 2)
            .map(s -> s.getName())
            .toList();
        System.out.println("Student Names = " + studentNames);
    }
}
class Student{
    int id;
    String name;   

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}