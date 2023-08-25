package PACK1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void launch_app()
	{
     System.setProperty("webdriver.gecko.driver","C:\\Users\\priya\\OneDrive\\Desktop\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	 
	

}
	
