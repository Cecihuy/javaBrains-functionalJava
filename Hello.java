import java.util.function.Function;

public class Hello{
    public static void main(String[] args) {
        Function<Integer, Integer> incrementIt = x -> x + 1;
        Function<Integer, Integer> doubleIt = x -> x * 2;

        int i = 7;
        Function<Integer, Integer> combine = incrementIt
                                        .andThen(doubleIt)
                                        .andThen(incrementIt)
                                        .andThen(doubleIt);

        System.out.println(combine.apply(i));
        
        System.out.println("spacer"); 
               
        Function<String, String> trimLeading = String::stripLeading;
        // Function<String, String> trimEnding = String::stripTrailing;
        // Function<String, String> upperCase = String::toUpperCase;

        String name = "   theresSpaceBetweenUs   ";

        String processedName = trimLeading
                                    .andThen(String::stripTrailing)
                                    .andThen(String::toUpperCase)
                                    .apply(name);
        
        System.out.println(processedName);
    }
}