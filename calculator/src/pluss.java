public class pluss {
    public void dodat(){
        System.out.print("Enter first number: ");
        Main.first = Main.scanner.nextInt();
        System.out.print("Enter second number: ");
        Main.second = Main.scanner.nextInt();
        int result = Main.first + Main.second;
        System.out.println("Result "+result);
    }
}
