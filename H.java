import java.util.Scanner;
class H 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a three values");
		System.out.println("enter a values");
		int a = sc.nextInt();
		System.out.println("enter a values");
		int b = sc.nextInt();
		System.out.println("enter a values");
		int c = sc.nextInt();

		int min = Math.min(a, Math.min(b,c));
		int max = Math.max(a, Math.max(b,c));
		int n= a+b+c - min - max;
		System.out.println("greatest of three un equal numbers :" + n);
		
	}
}
