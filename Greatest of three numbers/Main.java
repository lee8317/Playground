import java.util.Scanner;
class Main {
   public static void main(String args[])
   {
	   int temp;
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int m=sc.nextInt();
	   int o=sc.nextInt();
	   if(n>m)
	   {
		   temp=n;
	   }
	   else
	   {
		   temp=m;
	   }
	   if(temp>o)
	   {
		   System.out.println(temp);
	   }
	   else
	   {
		   temp=o;
		   System.out.println(temp);
	   }
	  
   }
}
