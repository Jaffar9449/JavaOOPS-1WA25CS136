import java.util.*;
class Book{
   int bookID;
   String title;
   String author;
   double price;
   static int count = 0;
   Book(int id, String t, String a, double p){
      bookID = id;
      title = t;
      author = a;
      price = p;
      count++;
   }
   void display(){
      System.out.println("BookID: "+bookID);
      System.out.println("Title: "+title);
      System.out.println("Author: "+author);
      System.out.println("Price: "+price);
   }
   void search(String t){
      if(title.equalsIgnoreCase(t))
         System.out.println("Book found: "+title);
      else
         System.out.println("Book not found");
   }
   Book costlier(Book b){
      if(price>b.price)
         return this;
      else
         return b;
   }
}

public class Lab{
   public static void main(String[] args){
      Book b1 = new Book(101,"Java","James",500);
      Book b2 = new Book(102,"Python","guido",400);
      Book b3 = new Book(103,"Data Structures","Mark Allen",650.00);
      
      b1.display();
      System.out.println();
      
      b2.display();
      System.out.println();
      
      b3.display();
      System.out.println();
      
      
      
      b2.search("Python");
      System.out.println();
      
      
      Book expensive = b1.costlier(b3);
      
      System.out.println("\nCostlier Book:");
      expensive.display();
      
      System.out.println("\nTotal Books created: "+Book.count);
   }
}
