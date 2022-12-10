import java.util.Scanner;
public class Strong {
	public static void main(String[] args) {
		System.out.println("Enter the Number to check Srong or not :");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int num2=num;
		double stro=0;

		while(num!=0) {
			stro=stro+(Fact.factorial(num%10));
			num=num/10;
			
		}
		
		if(num2==stro)
			System.out.println(" This is Strong Number.");
		else
			System.out.println("This isn't Strong Number.");
		
		
	}

}

class Fact{
	public static int factorial(int a) {
		int num=1;
		while(a>0) {
			num=num*a;
			a--;
		}
	return num;
	}
}