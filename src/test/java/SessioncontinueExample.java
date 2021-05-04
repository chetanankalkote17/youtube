import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class SessioncontinueExample {

	public static void main(String[] args) throws InterruptedException {
	OperaOptions opn=new OperaOptions();
	opn.setExperimentalOption("debuggerAddress", "localhost:7774");
	WebDriver driver=new OperaDriver(opn);
	System.out.println(driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("selenium"  +  Keys.ENTER);
	System.out.println(driver.getTitle());
	}

	
}
