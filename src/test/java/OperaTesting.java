import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.opera.driver", "operadriver.exe");
		
		WebDriver oprdriver=new OperaDriver();
		
		oprdriver.manage().window().maximize();
		oprdriver.manage().deleteAllCookies();
		
		//oprdriver.get("https://www.facebook.com/");
		oprdriver.get("https://demoqa.com/tool-tips/");
		
		WebElement hoverbutton=oprdriver.findElement(By.xpath("//button[contains(text(),'Hover me to see')]"));
		
		Actions act1=new Actions(oprdriver);
		
		act1.moveToElement(hoverbutton).build().perform();
		
		Thread.sleep(3000);
		
		WebElement tooltipex=oprdriver.findElement(By.xpath("//div[contains(text(),'You hovered over the Button')]"));
		
		System.out.println(tooltipex.getText());
		String s1="You hovered over the Button";
		if(s1.equals(tooltipex.getText()))
		{
			System.out.println("both text are correct");
		}
		else
		{
			System.out.println("both text are  not correct");
		}
		
		
		
		Thread.sleep(2000);
		//locators---------------------------------------------------------------------------------------------------------------
		//WebElement emailtxt=oprdriver.findElement(By.id("email"));//use of id locator
		/*WebElement emailtxt=oprdriver.findElement(By.name("email"));  //use of locator name
		
		emailtxt.sendKeys("chetanankalkote7@gmail.com");*/
		
		//WebElement passtxt=oprdriver.findElement(By.xpath("//input[@id='pass']"));  //x path use (1)
		//WebElement passtxt=oprdriver.findElement(By.xpath("//input[@id='pass' and @placeholder='Password']")); // xpath use(2)
		//WebElement passtxt=oprdriver.findElement(By.xpath("//input[contains(@type,'password')]"));  //xpath conatins use
		//passtxt.sendKeys("12345");
		
		//WebElement txtshown=oprdriver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));   //xpath contains with text()
		//WebElement txtshown=oprdriver.findElement(By.xpath("//h2[(text()='Facebook helps you connect and share with the people in your life.')]"));  //xpath with only text()
		//System.out.println(txtshown.getText());
		
		//WebElement createpge=oprdriver.findElement(By.linkText("Create a Page"));   //use of linkText locator
	//	WebElement createpge=oprdriver.findElement(By.partialLinkText("a Page"));    //use of partialLinkText locator
		//System.out.println(createpge.getText());
		//locators end-------------------------------------------------------------------------------------------------------
		
		/*String firsturl=oprdriver.getTitle();
		//navigation commands------------------------------------------------------------------------------------------------
		System.out.println("when u r on google page  "   +   firsturl);
		System.out.println(oprdriver.getCurrentUrl());
		
		
		oprdriver.navigate().to("https://www.twitter.com/");
		
		Thread.sleep(4000);
		
		System.out.println("when u r on twitter page   "  +  oprdriver.getTitle());
		
		oprdriver.navigate().back();
		
		System.out.println("u r back to google page   "  + oprdriver.getTitle());
		
		Thread.sleep(4000);
		
		System.out.println("u r back to google page   "  + oprdriver.getTitle());
		
		oprdriver.navigate().forward();
		
		Thread.sleep(4000);
		
		System.out.println("u r again on twitter page   "  +  oprdriver.getTitle());
		
		oprdriver.navigate().refresh();
		
		System.out.println("twitter page is refreshed");
		
		Thread.sleep(4000);
		
		oprdriver.navigate().to("https://www.dream11.com/");
		
		Thread.sleep(4000);
		
		System.out.println("u r on dream 11 page    "  + oprdriver.getTitle());
		
		System.out.println("finally closing opera,byeeee....");
		//navigation commands end----------------------------------------------------------------------------------------------
		
		//oprdriver.get("https://www.facebook.com");*/
		
	//	oprdriver.quit();
		
		

	}

}
