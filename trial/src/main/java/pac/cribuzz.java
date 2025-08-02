package pac;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class cribuzz{

	@Test
public void buzz()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act1= new Actions(driver);
		WebElement elec = driver.findElement(By.xpath("//a[.='Rankings']"));
		act1.moveToElement(elec).click();
		Actions act= new Actions(driver);
		act.scrollByAmount(0, 100);
		driver.findElement(By.xpath("//a[@id='batsmen-odis-tab']")).click();
	}
}
