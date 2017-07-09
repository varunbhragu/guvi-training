import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{

     public static void main(String []args)
     {
      int x;
       Scanner se=new Scanner(System.in);
       x=se.nextInt();
       if (x>0)
       System.out.println("Positive");
       else 
       if (x<0)
       System.out.println("Negative");
       else
       System.out.println("Zero");
     }
}
