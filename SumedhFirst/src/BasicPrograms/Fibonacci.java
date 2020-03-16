package BasicPrograms;
import java.io.*;
import java.util.*;
public class Fibonacci {
	
	public static void main (String x[])
	{
		// 0 0 1 1 2 3 5 6 8..
	  int i=0, temp, a , b;
	  
	  a = 0;
	  b= 1;
	  System.out.print(""+a+","+b);
	  for(i=1;i<8;i++)
	  {
		 temp= a+b;
		 a = b;
		 b= temp;
		 System.out.print(","+b);
	  }
	}

}
