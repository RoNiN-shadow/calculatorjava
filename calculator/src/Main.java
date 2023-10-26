import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int first;
    public static int second;
    public static int action = 0;
    public static boolean valid = false;

    public static void main(String[] args) {
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
        Check yuy = new Check();
        yuy.checking();
        }while (!valid);
    }
}
