package PACK1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Desktop\\Selenum Web Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	
	driver.get("http://localhost/orangehrm");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("Stc@1234");
	
	driver.findElement(By.cssSelector(".oxd-button")).click();
	driver.findElement(By.cssSelector("li.oxd-main-menu-item-wrapper:nth-child(2) > a:nth-child(1)")).click();
	
	driver.findElement(By.cssSelector("li.oxd-topbar-body-nav-tab:nth-child(3) > a:nth-child(1)")).click();
	
	driver.findElement(By.name("firstName")).sendKeys("Ann");
	driver.findElement(By.name("lastName")).sendKeys("Panackal");
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	
	

}
