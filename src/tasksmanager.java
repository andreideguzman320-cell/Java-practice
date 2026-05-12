import java.util.*;

public class tasksmanager {

    static Scanner scanner = new Scanner(System.in);
    static String[] tasks;
    public static void main(String[] args) {

        int choice;
        boolean condition = true;

        while(condition){
            System.out.print("1: Add task\n2: View tasks\n3: Remove task\n4: Exit\n");
            System.out.println("Enter your Choice: ");
            choice=scanner.nextInt();

            switch(choice){
                case 1->addTask();
                case 2-> viewTask(tasks);
                case 3 -> {
                    if (tasks == null || tasks.length == 0) {
                        System.out.println("No tasks to remove.");
                    } else {
                        viewTask(tasks);
                        System.out.print("Enter task number to remove: ");
                        int index = scanner.nextInt() - 1;
                        if (index < 0 || index >= tasks.length) {
                            System.out.println("Invalid task number.");
                        } else {
                            tasks = removeTask(tasks, index);
                            System.out.println("Task removed.");
                        }
                    }
                }
                case 4 ->condition=false;
                default-> System.out.println("Invalid input");
            }
        }


    }
    static void  addTask(){
        int taskCount;

        System.out.print("how many tasks do you want to add?");
        taskCount=scanner.nextInt();
        scanner.nextLine();

        tasks=  new  String[taskCount];

        for(int i = 0; i<tasks.length; i++){
            System.out.print("Enter the task you want to add: ");
            tasks[i]=scanner.nextLine();
        }
    }
    static void  viewTask(String[]tasks){
        if ( tasks == null|| tasks.length==0){
            System.out.println("No tasks found.");
            return;
        }
        int i=1;
        for (String task:tasks){
            System.out.println(i++ +". " + task+ "\n");
        }

    }
    static String[] removeTask(String[] tasks, int indexToRemove) {

        String[] newTasks = new String[tasks.length - 1];
        int j = 0;

        for (int i = 0; i < tasks.length; i++) {
            if (i == indexToRemove) continue;

            newTasks[j++] = tasks[i];
        }

        return newTasks;
    }
}