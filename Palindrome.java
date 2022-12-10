import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the Number to check palindrome or not :");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int num2=num;
		int rev=0,rem;

		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(num2==rev)
			System.out.println(" This is palindrome.");
		else
			System.out.println("This isn't palindrome");
		
		
	}

}