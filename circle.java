import java.util.Scanner;
public class circle 
{
    public static void main(String args[])
    {
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        int r = sc.nextInt();

        double area = pi * r * r;
        double circumference = 2 * pi * r;

        System.out.println("Area of a circle is: "+area);
        System.out.println("Circumference of a circle is: "+circumference);
    }
}
