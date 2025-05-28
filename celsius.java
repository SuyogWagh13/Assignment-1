import java.util.Scanner;
public class celsius 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double Fahrenheit = sc.nextInt();
        double celsius = (Fahrenheit - 32) * 5/9;
        System.out.println("Degree Celsius: "+celsius);
    }
}
