import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{
    

     public static void main(String []args)
    {
    int x,s=0;
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no. of natural no. to be added");
       x=sc.nextInt();
       int a[]=new int[x];
       for(int i=0; i<x; i++)
       {
           a[i]=sc.nextInt();
           s=s+a[i];
        }
    System.out.println("The sum of "+x+"is "+s);

}
}
