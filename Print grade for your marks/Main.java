import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=85)
		{
			System.out.println("A");
		}
		else if(n>=75)
		{
			System.out.println("B");
		}
		else if(n>=65)
		{
			System.out.println("C");
		}
		else if(n>=55)
		{
			System.out.println("D");
		}
		else if(n>=45)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
