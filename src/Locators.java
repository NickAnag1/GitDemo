import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver = new ChromeDriver ();
		
		//WebDriver driver = new FirefoxDriver ();

		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.id("email")).sendKeys("NikoS@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("158793");
		//driver.findElement(By.className("btn-primary button p-v-2-xs p-h-5-xs m-v-3-xs col-12-xs")).click();
		//driver.findElement(By.tagName("submit")).click();
		//driver.findElement(By.cssSelector("span.text-with-icon")).getText();
		//System.out.println(driver.findElement(By.cssSelector("inline-error")).getText());
		driver.findElement(By.linkText("Forgot Password")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//input[@class='form-input p-v-1-xs p-l-2-xs p-r-4-xs col-12-xs bodyMain error']")).sendKeys("nik@perit.com");
		//input[@required autofocus='autofocus']
		//driver.findElement(By.cssSelector("input[autocomplete]='email']")).sendKeys("pao@gmail.com");
		//driver.findElement(By.xpath("//input[@id='email'][1]")).sendKeys("pao@gmail.com");
		//driver.findElement(By.xpath("//form/div/input[1]")).sendKeys("NikoS@gmail.com");
		driver.findElement(By.cssSelector(".form-input p-v-1-xs p-l-2-xs p-r-4-xs col-12-xs bodyMain error")).sendKeys("NikoS@gmail.com");
		//driver.findElement(By.cssSelector(".btn-primary button p-v-2-xs p-h-5-xs m-v-3-xs col-5-xs")).click();
		
	}

}
