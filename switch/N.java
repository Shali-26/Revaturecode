import java.util.Scanner;
class N
{


	public static void main(String[] args) 
	{
		char vowel;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a alphabet");
		vowel = sc.next().charAt(0);
		switch(vowel){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowels");
			break;
			default:
				System.out.println("consonants");
		}
	}
}
