package BasicPrograms;
 import java.util.*;
public class PrimeNum {
	public static void main(String x[])
	{
		int a, i, flag=0;
		
		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a==1) 
		{
		 System.out.println("1 is nor Prime nor Consonent");
		 
		}
			
		for(i=2; i<a/2;i++)
		{
			
			if(a%i==0)
			{
				flag = 1;
				break;
			}
			else
			{
				flag =0;
			}
		}
		if (flag==0)
		{
			System.out.println(a+" is a Prime number");
		}
		else
		{
			System.out.println(a+" is Consonent");
		}
	}

}
