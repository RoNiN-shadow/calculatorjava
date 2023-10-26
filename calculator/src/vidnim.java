public class vidnim {
    public void vidnimm(){
        System.out.print("Enter first number: ");
        Main.first = Main.scanner.nextInt();
        System.out.print("Enter second number: ");
        Main.second = Main.scanner.nextInt();
        if (Main.second > Main.first){
            int resultmin = Main.second - Main.first;
            resultmin = -resultmin;
            System.out.println("Result"+ resultmin);
        }else{
            int result = Main.first - Main.second;
            System.out.println("Result "+result);
        }
    }
}
