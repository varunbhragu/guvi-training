import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{

     public static void main(String []args)
     {
      int x,y,z;
       Scanner se=new Scanner(System.in);
       System.out.println("Enter the first number");
       x=se.nextInt();
        System.out.println("Enter the second number");
       y=se.nextInt();
        System.out.println("Enter the third number");
       z=se.nextInt();
       if (x>y && x>z)
       System.out.println("x is the greatest number");
       if (y>x && y>z)
       System.out.println("y is the greatest number");
       else 
       System.out.println("z is the greatest number");
     }
}