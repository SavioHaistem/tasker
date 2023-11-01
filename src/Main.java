import entities.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Task> taskList = new ArrayList<Task>();

        Integer newTaskId = taskList.size() + 1;
        System.out.print("Digite a sua tarefa: ");
        String taskDescription = scan.nextLine();

        Task task = new Task(newTaskId,taskDescription);
        taskList.add(task);

        System.out.println(task + "  [ adicionado ]");
    }
}