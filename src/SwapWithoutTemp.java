
public class SwapWithoutTemp {

	public static void main(String[] args) {
		int number1=10;
		int number2=20;
		System.out.println("Before Swapping:");
		System.out.println("value of number 1:"+number1);
		System.out.println("Value of number 2:"+number2);
		
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		System.out.println("After Swapping:");
		System.out.println("value of number 1:"+number1);
		System.out.println("Value of number 2:"+number2);


	}

}
