import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhuva\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("divpaxinfo")).click();
		
		//Thread.sleep(2000L);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			driver.findElement(By.id("hrefIncChd")).click();
			i++;
			
		}		
		
		driver.findElement(By.id("btnclosepaxoption"));
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		System.out.println(driver.findElement(By.id("hrefIncChd")).getText());
		
		driver.quit();
		
	}

}
