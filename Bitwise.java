package oop_pratical;
import java.util.Scanner;
public class Bitwise {
public static void main(String args[]) {
  int a,b,c;
  Scanner sc= new Scanner(System.in);
  System.out.println("type a:");
  a=sc.nextInt();
  System.out.println("type b");
   b=sc.nextInt();
  
   c = a & b;
   System.out.println("a&b=" +c);
   
   c=a|b;
   System.out.println("a|b=" +c);
   
   c = a ^ b;        
   System.out.println("a ^ b = " + c );

   c = ~a;          
   System.out.println("~a = " + c );
   
   c = a << 2;       
   System.out.println("a << 2 = " + c );

   c = a >> 2;     
   System.out.println("a >> 2  = " + c );

   c = a >>> 2;      
   System.out.println("a >>> 2 = " + c );



}
}
