package ToDoListApp.java;
import java.util.ArrayList;
import java.util.Scanner;
import Models.Task;
public class ToDoListApp {
    private static ArrayList<Task> taskList = new ArrayList<>();
    private static int nextId = 1; // Unique ID for each task

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskAsCompleted(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }

    // 1. Add Task
    private static void addTask(Scanner scanner) {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task newTask = new Task(nextId++, description);
        taskList.add(newTask);
        System.out.println("Task added successfully.");
    }

    // 2. View Tasks
    private static void viewTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (Task task : taskList) {
                System.out.println(task);
            }
        }
    }

    // 3. Mark Task as Completed
    private static void markTaskAsCompleted(Scanner scanner) {
        System.out.print("Enter the task ID to mark as completed: ");
        int taskId = scanner.nextInt();
        Task task = findTaskById(taskId);

        if (task != null) {
            task.setCompleted(true);
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Task not found.");
        }
    }

    // 4. Delete Task
    private static void deleteTask(Scanner scanner) {
        System.out.print("Enter the task ID to delete: ");
        int taskId = scanner.nextInt();
        Task task = findTaskById(taskId);

        if (task != null) {
            taskList.remove(task);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }

    // Helper method to find a task by its ID
    private static Task findTaskById(int id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null; // Return null if no task found
    }
}


