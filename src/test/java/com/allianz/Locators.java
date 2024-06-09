import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhuva\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sagar");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")));
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("saga11");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sagar@122");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sagar112@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9889343440");
        driver.findElement(By.className("go-to-login-btn")).click();
        Thread.sleep(1000);        
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[cont ains(@class,'submit')]")).click();
        
        
        //driver.close();
	    //driver.quit();
	
	}

}
