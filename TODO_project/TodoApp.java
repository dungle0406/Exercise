import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
        } else {
            String command = args[0];
            switch (command) {
                case "-l":
                    listTasks();
                    break;
                case "-a":
                    if (args.length > 1) {
                        String taskDescription = args[1];
                        addTask(taskDescription);
                    } else {
                        addTaskErrorHandling();
                    }
                    break;
                case "-r":
                    if (args.length > 1) {
                        try {
                            int taskIndex = Integer.parseInt(args[1]);
                            removeTask(taskIndex);
                        } catch (NumberFormatException e) {
                            removeTaskErrorHandling("index is not a number");
                        }
                    } else {
                        removeTaskErrorHandling("no index provided");
                    }
                    break;
                case "-c":
                    if (args.length > 1) {
                        try {
                            int taskIndex = Integer.parseInt(args[1]);
                            checkTask(taskIndex);
                        } catch (NumberFormatException e) {
                            checkTaskErrorHandling("index is not a number");
                        }
                    } else {
                        checkTaskErrorHandling("no index provided");
                    }
                    break;
                default:
                    argumentErrorHandling();
            }
        }
    }

    public static void printUsage() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Command line arguments:");
        System.out.println("    -l   Lists all the tasks");
        System.out.println("    -a   Adds a new task");
        System.out.println("    -r   Removes an task");
        System.out.println("    -c   Completes an task");
    }

    private static void listTasks() {
        List<String> tasks = readTasks();
        if (tasks.isEmpty()) {
            emptyList();
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                String task = tasks.get(i);
                if (task.startsWith("[x] ")) {
                    System.out.println((i + 1) + " - " + tasks.get(i));
                } else {
                    System.out.println((i + 1) + " - " + tasks.get(i));
                }
            }
        }
    }

    private static void emptyList() {
        System.out.println("No todos for today! :)");
    }

    private static void addTask(String newTask) {
        List<String> tasks = readTasks();
        tasks.add("[ ] " + newTask);
        writeTasks(tasks);
    }

    private static void addTaskErrorHandling() {
        System.out.println("Unable to add: no task provided");
    }

    private static void removeTask(int taskIndex) {
        List<String> tasks = readTasks();
        if (taskIndex < 1 || taskIndex > tasks.size()) {
            removeTaskErrorHandling("index is out of bond");
        } else {
            tasks.remove(taskIndex - 1);
            writeTasks(tasks);
        }
    }

    private static void removeTaskErrorHandling(String message) {
        System.out.println("Unable to remove: " + message);
    }

    private static void argumentErrorHandling() {
        System.out.println("Unsupported argument");
        printUsage();
    }

    private static void checkTask(int taskIndex) {
        List<String> tasks = readTasks();
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            String task = tasks.get(taskIndex - 1);
            if (task.startsWith("[ ] ")) {
                task = "[x] " + task.substring(4);
                tasks.set(taskIndex - 1, task);
                writeTasks(tasks);
            } else if (task.startsWith("[x] ")) {
                checkTaskErrorHandling("task is already done");
            }
        } else {
            checkTaskErrorHandling("index is out of bound");
        }
    }


    private static void checkTaskErrorHandling(String message) {
        System.out.println("Unable to check: " + message);
    }

    private static List<String> readTasks() {
        List<String> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    private static void writeTasks(List<String> tasks) {
        try (BufferedWriter writeBuffer = new BufferedWriter(new FileWriter("tasks.txt"))) {
            for (String task : tasks) {
                writeBuffer.write(task);
                writeBuffer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
