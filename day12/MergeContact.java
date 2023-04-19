package week4.day2_homeAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("DemoCsr");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		// From contact
		Set<String> windowHandles = driver.getWindowHandles();
		// System.out.println(windowHandles);

		for (String eachwindow : windowHandles) {
			System.out.println(eachwindow);
		}

		List<String> allLinks = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allLinks.get(1));

		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();

		driver.switchTo().window(allLinks.get(0));

		// To Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		Set<String> windowHandles1 = driver.getWindowHandles();
		// System.out.println(windowHandles);

		for (String eachwindow : windowHandles1) {
			System.out.println(eachwindow);
		}

		List<String> allLinks1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(allLinks1.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();

		driver.switchTo().window(allLinks.get(0));

		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println(title);

		driver.close();

	}

}
