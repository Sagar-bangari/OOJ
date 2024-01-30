package CIE;
import SEE.Externals;
public class Studentmain {
    public static void main(String[] args) {
        int n=1;
        Externals finalmarks[]=new Externals[n];
        for (int i = 0; i < n; i++) 
        {
            finalmarks[i]=new Externals();
            finalmarks[i].inputstudentdetails();
            System.out.println("Enter CIE marks:");
            finalmarks[i].inputcie();
            System.out.println("Enter SEE marks");
            finalmarks[i].inputsee();
        }
        System.out.println("Displaying data:");
        for(int i=0;i<n;i++)
        {
            finalmarks[i].cfmarks();
            finalmarks[i].displayfmarks();
        }
         System.out.println("Sagar Bangari - 1BM22CS231");
    }
}
