package week1.day2Assignment;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = -40;
		if(number<0)
		{
			System.out.println("The given number is negative " +number);
			int x=number*-1;
			System.out.println("The converted positive number is " +x);
			
		}
		else
		{
			System.out.println("The Given number is not negative");
		}
		
		
		
	}

}
