import java.time.LocalDateTime;

public class Hello{
    public static void runner(Task task){
        System.out.println("Start : " + LocalDateTime.now());
        task.run();
        System.out.println("End : " + LocalDateTime.now());
    }
    public static void main(String[] args) {
        Task task = () -> System.out.println("Hello world");
        Hello.runner(task);
        
        // we can rewrite in one line        
        Hello.runner(() -> System.out.println("Hello world"));
    }    
}

interface Task{
    void run();
}