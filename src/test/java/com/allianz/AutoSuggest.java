import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhuva\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();   
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");   
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		
		
		
		
		
		
	}

}
