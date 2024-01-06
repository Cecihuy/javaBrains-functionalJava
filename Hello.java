import java.time.LocalDateTime;

public class Hello{
    public static void runner(Task task){
        System.out.println("Start : " + LocalDateTime.now());
        task.run();
        System.out.println("End : " + LocalDateTime.now());
    }
    public static void main(String[] args) {
        Task task = new printHello();
        Hello.runner(task);
    }    
}

interface Task{
    void run();
}

class printHello implements Task{
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}