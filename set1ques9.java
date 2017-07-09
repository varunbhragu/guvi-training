import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld
{
    

     public static void main(String []args)
    {
    int x,s=0;
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of x");
       x=sc.nextInt();
       for(int i=0; i<=x; i++)
       {
          s=s+i;
        }
    System.out.println("The sum of "+x+" is "+s);

}
}
