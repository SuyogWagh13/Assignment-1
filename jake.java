//write a program to take user ID as input and print jake's name and age if the ID matches.

import java.util.Scanner;
public class jake
{
    public static void main(String a[])
    {
        String name = "Jake smith";
        int age = 21, UserID1 = 30;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the User's ID: ");
        int UserID2 = sc.nextInt();

        if(UserID1 == UserID2)
        {
            System.out.println("User's Name: "+name+"\nUser's Age: "+age);
        }
        else
            System.out.println("User's ID does not match.");
    }
}