import java.util.Scanner;

class InputScanner{
    Scanner s;
    InputScanner(){
        s = new Scanner(System.in);
    }
}

abstract class Shape extends InputScanner {
    int a;
    int b;
    abstract void display();
    
}

class Rectangle extends Shape {
    Rectangle(){
        System.out.println("Enter the dimensions of Rectangle (length and breadth):");
        a = s.nextInt();
        b = s.nextInt();
    }
    void display(){
        System.out.println("Area of Rectangle =" + a*b);
    }
}
class Triangle extends Shape {
    Triangle(){
        System.out.println("Enter the dimensions of Triangle (base and height):");
        a = s.nextInt();
        b = s.nextInt();
    }
    void display(){
        System.out.println("Area of Triangle =" + a*b/2);
    }
}
class Circle extends Shape {
    Circle(){
        System.out.println("Enter the dimension of Circle (radius):");
        a = s.nextInt();
    }
    void display(){
        System.out.println("Area of Triangle =" + 3.1419*a*a);
    }
}

class abstractClass_Main {
    public static void main (String args[]){
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        r.display();
        t.display();
        c.display();
        System.out.println("Sagar Bangari - 1BM22CS231");
    }
    
}
