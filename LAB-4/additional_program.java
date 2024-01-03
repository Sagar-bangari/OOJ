import java.util.*;
class Students{
	String USN;
	String Name;
	double a,b,c;
	double avg;
	
	void getDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the USN:");
		USN = sc.next();
		System.out.println("Enter the Name of student:");
		Name= sc.next();
		System.out.println("Enter all three subject marks");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c =sc.nextDouble();
	}
	void avgmarks(){
		if(a >= b && c >= b){
			avg = ((a+c)/2);
		}
		else if(a >= c && b >= c){
			avg = ((a+b)/2);
		}
		else{
			avg = ((b+c)/2);
		}
	}
	void display(){
		System.out.println("USN : "+ USN);
		System.out.println("NAME : "+ Name);
		System.out.println("Avg marks : "+ avg);
	}
	protected void finalize(){
	        System.out.println("finalize() method called");
    	}    
}


public class additional_program{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		Students s[]  = new Students[n];
		
		for(int i = 0;i<n;i++){
			s[i] = new Students();
			s[i].getDetails();
            
		}
        	for(int i = 0;i<n;i++){
             System.out.println();
            s[i].avgmarks();
			s[i].display();
		}
		   
        System.out.println("\nSagar Bangari - 1BM22CS231");
	}
}
