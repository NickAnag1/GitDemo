import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");

		driver.findElement(By.id("email")).sendKeys("anagnonick@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("P%paridis13");
		
		//driver.findElement(By.name("commit")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.tagName("input")).click();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "Log on");
		

	}

}
