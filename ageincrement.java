import java.util.Scanner;
public class ageincrement 
{
    public static void main(String a[])
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        System.out.println("Original age: "+age);
        age += 1;
        System.out.println("Incremented age: "+age);
    }
}
