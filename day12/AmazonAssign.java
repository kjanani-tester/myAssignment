package week4.day2_homeAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAssign {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//div[text()='oneplus 9 pro']")).click();
		String firstResult = driver.findElement(By.xpath("//span[@class='a-price-symbol']/following-sibling::span")).getText();
		System.out.println(firstResult);

		String rating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println(rating);
		driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-underline-text')]//span)[2]")).click();
		//driver.findElement(By.xpath("//span[text()='(Renewed) ']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		// System.out.println(windowHandles);

		for (String eachwindow : windowHandles) {
			System.out.println(eachwindow);
		}

		List<String> allLinks = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allLinks.get(1));
		File src = driver.getScreenshotAs(OutputType.FILE);

		// Create path to store
		File dst = new File("./snaps/amazon.png");

		// File utils
		FileUtils.copyFile(src, dst);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		//String CartCount=driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-price')]//span[1]")).getText();
		String CartCount = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println(CartCount);
		if(firstResult.equals(CartCount))
		{
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
		driver.close();

	}

}
