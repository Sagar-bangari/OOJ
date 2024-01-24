package CIE;
import java.util.*;
public class Internals extends Student{
    protected int marks[]=new int[5];
    public void inputcie()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Marks of 5 subjects in CIE:");
        for(int i=0;i<5;i++)
        {   
            System.out.print("Subject " + (i+1) + " marks:");
            marks[i]=s.nextInt();
        }
    }
}
