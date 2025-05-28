import java.util.Scanner;
public class mult 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();
        int mul = num1 * num2;
        System.out.println("Multiplication of the two numbers: "+mul);
    }
}
