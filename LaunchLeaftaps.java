package week2.day2_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchLeaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestQ PVT LTD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99543247");
		driver.findElement(By.name("submitButton")).click();
		
		//driver.close();
		

	}

}
