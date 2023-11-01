import entities.Task;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Task tasker = new Task(1, "adicionar chocolate");

        System.out.println(tasker);
        tasker.toggleComplete();
        System.out.println(tasker);
    }
}