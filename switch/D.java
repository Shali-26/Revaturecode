import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int y,r;
		System.out.println("enter a y values and r values");
		y = sc.nextInt();
		r = y % 4 == 0 || y % 100 != 0 || y % 400 == 0 ? 1 : 0;
		switch(r){
			case 1:
				System.out.println("Leap year");
			break;
			case 2:
				System.out.println("Not a Leap Year");
			break;
			default:
				System.out.println("invalid");
	}
}
}