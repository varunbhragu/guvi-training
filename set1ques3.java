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
       if (x=='A' || x=='E' || x=='I' ||  x=='O'|| x=='U' || x=='a' || x=='e' || x=='i' ||  x=='o'|| x=='u')
       System.out.println("Vowel");
       else 
       System.out.println("Consonant");
     }
}
