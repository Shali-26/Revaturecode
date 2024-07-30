import java.util.Scanner;
class U 
{
	public static void main(String[] args) 
	{
		int a,b,inc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		a=sc.nextInt();
		System.out.println("Enter values");
		b= sc.nextInt();
		System.out.println("Enter values");
		inc=sc.nextInt();

		
		for(int l = a; l<= b; l += inc){
			System.out.println(l);

	}
}
}