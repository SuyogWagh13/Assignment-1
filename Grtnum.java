import java.util.Scanner;
public class Grtnum {
    public static void main(String a[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 =sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) 
        {
            System.out.println(num1 + " is greater than " + num2 + " and " +num3);
        } 
        else if (num2 > num1 && num2 > num3) 
        {
            System.out.println(num2 + " is greater than " + num1 + " and " +num3);
        } 
        else if (num3 > num1 && num3 > num2) 
        {
            System.out.println(num3 + " is greater than " + num1 + " and " +num2);
        }
        else 
        {
            System.out.println("All are equal numbers.");
        }
    }
}