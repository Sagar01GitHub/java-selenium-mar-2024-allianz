import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class selintroduction {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		//Invoking Browser
		//ChromeDriver driver---ChromeDriver -->Methods
		//WebDriver methods + class methods
		//chromedriver.exe --> Chrome browser		
	    //steps to invoke chrome driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhuva\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
		 
		driver.switchTo().newWindow(WindowType.TAB); //shift to next tab
	
		driver.get("https://google.com/");		
		System.out.println(driver.getTitle());  //to get title of the page
		System.out.println(driver.getCurrentUrl()); // to get the url of the page
		
	   driver.close(); //to close the current open window.
	   driver.quit();  //to close the all windows associated with it.
		

	}

}
