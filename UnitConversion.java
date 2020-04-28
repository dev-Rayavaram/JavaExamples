import java.util.Scanner;

public class UnitConversion {
    public static void main (String[] args){
        System.out.println("Enter first input of float type");
        Scanner in = new Scanner(System.in);
        float var1 = in.nextFloat();
        System.out.println("Enter second input of integer type");
        int var2 =  in.nextInt();
        float result =var1*var2;
        System.out.print(result);

    }
}
