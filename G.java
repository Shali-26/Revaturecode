import java.util.Scanner;
class G
{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		if(a < 90 && a>=100){
			System.out.println("A grade");
        }else if(a < 40 && a>= 20){
			System.out.println("B grade");
        }else{
			System.out.println("invalid");
        }
	}
}