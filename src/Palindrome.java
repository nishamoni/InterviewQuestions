import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s;
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String to reverse:");
		s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		
System.out.println( "The reversed String is:"+rev);

if(rev.equals(s)){
	System.out.println("The string is a palindrome;");
}else{
	System.out.println("The string is not a palindrome");
}
}
}


