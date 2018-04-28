import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		String s;
		String rev=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String to reverse:");
		s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		
System.out.println(rev);
	}

}
