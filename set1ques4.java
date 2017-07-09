import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{

     public static void main(String []args)
     {
      char x;
       Scanner se=new Scanner(System.in);
       x=se.next().charAt(0);
       if (x>='A'&&x<='Z' || x=='a'&&x<='z')
       System.out.println("Alphabet");
       else 
       System.out.println("Not an alphabet");
     }
}