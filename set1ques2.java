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
       if (x%2==0)
       System.out.println("Even");
       else 
       System.out.println("Odd");
     }
}
