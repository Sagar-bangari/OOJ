class BMS extends Thread
{
public void run()
{
for(int i=1; i<=20; i++){
	try{
		
		System.out.println("BMS College of Engineering" + i);
		Thread.sleep(10000);
	}
	catch(InterruptedException e){
		System.out.println("thread error");
	}
}
}
}

class CS extends Thread
{
public void run()
{
for(int i=1; i<=20; i++){
	try{
		
		System.out.println("Computer Science " + i);
		Thread.sleep(2000);
	}
	catch(InterruptedException e){
		System.out.println("thread error");
	}
}
}
}

public class Main_thread {
public static void main(String args[])
{
BMS a= new BMS();
a.start();

CS b = new CS();
b.start();
System.out.println("Sagar Bangari - 1BM22CS231");
}
}
