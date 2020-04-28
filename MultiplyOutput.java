import java.util.Scanner;

public class MultiplyOutput {
    public static void main(String[] args){
        System.out.println("Enter First integer");
        Scanner in = new Scanner(System.in);
        int var1 = in.nextInt();
        System.out.println("Enter Second integer");
        int var2 =  in.nextInt();
        int result =var1*var2;
        System.out.print(result);
     }
}
