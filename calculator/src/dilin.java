public class dilin {
    public void dilen(){
        System.out.print("Enter first number: ");
        Main.first = Main.scanner.nextInt();
        System.out.print("Enter second number: ");
        Main.second = Main.scanner.nextInt();
        double result = (double) Main.first / Main.second;
        System.out.println("Result "+result);
    }
}
