package CIE;
import java.util.*;
public class Student {
    protected String name=new String();
    protected String usn=new String();
    protected int sem;
    public void inputstudentdetails()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the student's Name :");
        name=s.nextLine();
        System.out.println("Enter USN:");
        usn=s.nextLine();
        System.out.println("Enter semester:");
        sem=s.nextInt();
    }
    public void display()
    {
        System.out.println("Student details:");
        System.out.println("NAME:" + name);
        System.out.println("USN:"+ usn);
        System.out.println("SEM:"+ sem);
    }
}