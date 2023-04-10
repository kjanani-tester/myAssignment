package week3.day1_Assignment;

public class Students {

	public void getStudentInfo(int id,String name) {
		System.out.println("The Student ID is "+id + " and the name is "+name);
	}
	
public void getStudentInfo(String email,String phno) {
		System.out.println("The Student email id "+email+ " and the phone number is "+phno);
	}
	
public void getStudentInfo(int id) {
	System.out.println("The Student id is "+id);
}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students sd=new Students();
		sd.getStudentInfo(5);
		sd.getStudentInfo(5, "Janani");
		sd.getStudentInfo("csejanani88@gmail.com", "586868587");

	}

}
