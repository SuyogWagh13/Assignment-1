import java.util.Scanner;
public class sub 
{
    public static void main(String args[])
    {
        int substraction = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();

        if(num1 > num2)
            substraction = num1 - num2;
        else if(num2 > num1)
            substraction = num2 - num1;
        System.out.println("Substraction of the two numbers: "+substraction);
    }
}
