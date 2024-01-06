import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Hello{
    public static void main(String[] args) {
        Consumer<String> logMessage = msg -> System.out.println(msg + " : " + LocalDateTime.now());     //4. store value here
        Runnable logStart = () -> logMessage.accept("Start");       //3. we run Consumer method
        Runnable logEnd = () -> logMessage.accept("End");

        BiConsumer<UnaryOperator<Integer>, Integer> logger = (operation, number) -> {
            logStart.run();                 //2. we run Runnable method
            operation.apply(number);        //5. we run Function method. sout here to see the different. continue the flow
            logEnd.run();
            
        };        
        logger.accept(x -> x + 1, 20);      //1. we run BiConsumer method;
        System.out.println("separator");
        logger.accept(x -> x * 100, 43);
    }
}