package week1.day2Assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int range=8,firstNum=0,secNum=1;
		 System.out.println("The first number is "+firstNum);
		 for(int i=1;i<=range;i++) {
			 int sum=firstNum+secNum;
			  firstNum=secNum;
			  secNum = sum;
			 System.out.println("The sum is" +sum);
			 
		 }
	}

}
