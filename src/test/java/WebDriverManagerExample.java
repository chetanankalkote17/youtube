import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerExample {
	
	static WebDriver driver;
	
	@Before
	public void starting()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");	
	}
	
	@Test
	public void testing1()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
	}
	
	
	@After
	public void lastly()
	{
		driver.quit();
	}

}
