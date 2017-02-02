import java.util.*;
import java.lang.*;
import java.io.*;

class oddeven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		  int a;
		  Scanner num=new Scanner(System.in);
		  System.out.println("enter a number:");
		  a = num.nextInt();
		  if(a%2==0)
		  {
		  	System.out.println(""+ a +" is even");
		  }
		  else
		  {
		  	System.out.println(""+ a +" is odd");
		  }
		  }
}