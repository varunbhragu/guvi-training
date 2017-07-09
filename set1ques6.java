import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{

     public static void main(String []args)
     {
      int x;
       Scanner se=new Scanner(System.in);
       System.out.println("Enter the year");
       x=se.nextInt();
       if (x%4==0 && (x%100!=0 || x%400==0))
       System.out.println("Leap year");
       else 
       System.out.println("Not a leap year");
     }
}