package oop_pratical;
import java.util.Scanner;
public class Relational {
  public static void main(String[] args) {
      
      int a,b;      
Scanner sc= new Scanner(System.in);
System.out.println("type a:");
a=sc.nextInt();
System.out.println("type b:");
b=sc.nextInt();
      System.out.println("a is " + a + " and b is " + b);

      System.out.println(a == b );  

      System.out.println(a != b); 
      System.out.println(a > b);  

   System.out.println(a < b);  

  
      System.out.println(a >= b);  

      
      System.out.println(a <= b);  
    }
  }
