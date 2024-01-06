import java.util.List;
import java.util.stream.Stream;

public class Hello{
    public static void main(String[] args){
        List<Integer> upToFive = Stream.iterate(1, num -> num + 3)
            .limit(5)
            .toList();
        
        System.out.println(upToFive);            
    }
}