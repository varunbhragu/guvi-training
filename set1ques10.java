import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{
    

     public static void main(String []args)
    {
    int n,count=0;
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter number n");
      n=sc.nextInt();
      int d=n;
      while(n!=0)
       {
         count++;
         n=n/10;
        }
    System.out.println("The number of digits in "+d+" is " +count);

}
}