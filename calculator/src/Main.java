import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int first;
    public static int second;
    public static int action = 0;

    public static void main(String[] args) {
        boolean valid = false;
        do{
            System.out.print("Choose action(1 is +, 2 is -, 3 is /, 4 is *): ");
        if (scanner.hasNextInt()){
            action = scanner.nextInt();
            scanner.nextLine();
            valid = true;
        }else{
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine();
        }
        }while (!valid);
    }
}