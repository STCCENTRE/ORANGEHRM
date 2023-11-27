package PACK1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Vishnu {

	//public static void main(String[] args) {
		@Test
		public void news() throws Exception{
			System.setProperty("webdriver.gecko.driver","D:\\STC\\Selenium Webdriver\\geck\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/orangehrm/orangehrm-5.5/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.findElement(By.xpath("html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
		driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("Employee");
		driver.findElement(By.cssSelector("input[name=middleName]")).sendKeys("One");
		driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("One");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("Employee");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("Employee@12345");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Employee@12345");
		//driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		driver.quit();
	

	}

}
