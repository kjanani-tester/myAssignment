package week3.day1_Assignment;

public class AxisBank extends BankInfo {
	
public void deposit(int amount,int year) {
		
		System.out.println("The deposit amount is "+amount +" and the year is " +year);
		
	}

public static void main(String[] args)
{
	AxisBank ab=new AxisBank();
	ab.deposit(50000, 5);
	ab.saving(4);
	ab.fixed(6.5);
}

}
