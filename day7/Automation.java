package week3.day2_homeAssignment;

public class Automation extends MultipleLanguage{

	public void java() {
		System.out.println("Learning Java");
	}

	public void selenium() {
		System.out.println("Learning Selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("Learning ruby");
		
	}
	
	public static void main(String[] args) {
		Automation at=new Automation();
		at.java();
		at.selenium();
		at.ruby();
		at.python();
		
	}

}
