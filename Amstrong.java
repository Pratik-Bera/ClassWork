import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args) {
		System.out.println("Enter the Number to check Amstrong or not :");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int num2=num;
		double ams=0;

		while(num!=0) {
			ams=ams+(Math.pow((num%10),3));
			num=num/10;
			
		}
		
		if(num2==ams)
			System.out.println(" This is Amstrong Number.");
		else
			System.out.println("This isn't Amstrong");
		
		
	}

}