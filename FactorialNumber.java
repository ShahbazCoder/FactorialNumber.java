import java.util.*;

class Assignment1
{
	public static void main(String args[])
	{
		int i, f=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial: "+f);
	}
}