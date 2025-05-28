//2.	Write a program to take Name and Age as input and print them.

public class Student 
{
    String name;
    int age;
    Student(String n, int a) 
    {
        name = n;
        age = a;
    }
    void display() 
    {
        System.out.print("Name: " + name);
        System.out.print("\nAge: " + age);
    }
    public static void main(String[] args) 
    {
        Student s1 = new Student("Suyog", 24);
        Student s2 = new Student("Aniket", 22);

        System.out.println("Student 1:");
        s1.display();

        System.out.println("\nStudent 2:");
        s2.display();
    }
}
