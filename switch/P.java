import java.util.Scanner;
class P
{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		int a =  sc.nextInt();
		System.out.println("enter values");
		int b= sc.nextInt();
		System.out.println("enter values");
        int c = sc.nextInt();
		

		int max;
		
		
		switch(1){
			
			
			default:
				max = Math.max(a, Math.max(b,c));
				break;

		}
		System.out.println("greatest of three numbers : " + max);

	}

}