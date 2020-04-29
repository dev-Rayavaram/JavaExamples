import java.util.Scanner;

public class UnitConversion {
    public static void main (String[] args){
        System.out.println("Enter number of inches in integer type");
        Scanner in = new Scanner(System.in);
        int var1 = in.nextInt();
        //number of meters for inch 0.0254
         float result =var1*0.0254;
        System.out.println("Number of meters per "+var1+" inches is "+result);

    }
}
