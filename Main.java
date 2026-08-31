import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task Manager");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a task:");

        String task = scanner.nextLine();

        System.out.println("You entered: " + task);

}

}