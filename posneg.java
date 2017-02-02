import java.util.*;
import java.lang.*;
import java.io.*;

class posneg
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		  int a;
		  Scanner num=new Scanner(System.in);
		  System.out.println("enter a number:");
		  a = num.nextInt();
		  if(a>0)
		  {
		  System.out.println("" + a + " is positive");
		  }
		   else if(a<0)
		  {
		  System.out.println("" + a + " is negative");
		  }
		  else
		  {
		  	System.out.println("" + a + " is zero");
		  }
		  }
}