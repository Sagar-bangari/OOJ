import java.util.Scanner;

class Books{
      String name;
      String author;
      int price;
      int numPages;

      Books(String name,String author,int price, int numPages){
         this.name = name;
         this.author = author;
         this.price = price;
         this.numPages = numPages;

      }

      public String toString(){
         String name,author,price,numPages;
         name = "Book name:"+this.name +"\n";
         author = "Author name:" + this.author + "\n";
         price = "Price:" + this.price +"\n";
         numPages = "NumPages:" +this.numPages +"\n";
         return name + author + price + numPages;
      }

      public void sedata(String name, String author , int price , int numPages){
         this.name = name;
         this.author = author;
         this.price = price;
         this.numPages = numPages;
      }

      public String getdata(){
          String name,author,price,numPages;
         name = "Book name:"+this.name +"\n";
         author = "Author name:" + this.author + "\n";
         price = "Price:" + this.price +"\n";
         numPages = "NumPages:" +this.numPages +"\n";
         return name + author + price + numPages;
      } 

}

class Main{
      public static void main(String args[]){
         Scanner s = new Scanner(System.in);
         int n;
         String name;
         String author;
         int price;
         int numPages;
         System.out.println("Enter the number of books:");
         n = s.nextInt();
         Books b[];
         b = new Books[n];
         System.out.println("Enter the book details:");

         for(int i = 0 ; i < n ; i++){
            name = s.next();
            author = s.next();
            price = s.nextInt();
            numPages = s.nextInt();
            b[i]=new Books(name,author,price,numPages);

         }

         for(int i = 0 ; i < n ; i++){
            System.out.println("Book no"+(i+1)+"details");
            System.out.println(b[i].getdata());
         }

         for(int i = 0 ; i < n ; i++){
            System.out.println("Book no"+(i+1)+"details");
            System.out.println(b[i].toString());
         }

         
         System.out.println("Sagar Bangari - 1BM22CS231");
      }
}