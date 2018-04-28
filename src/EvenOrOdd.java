import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Even or Odd:"+" ");
		n=sc.nextInt();
		if(n%2==0){
			System.out.println("The Given number is Even");
		}else{
			System.out.println("The Given Number is Odd");
		}
			
	}

}
