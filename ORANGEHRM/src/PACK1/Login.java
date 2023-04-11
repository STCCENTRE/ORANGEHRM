package PACK1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	WebDriver driver;

	@org.testng.annotations.Test
	public void Test()throws InterruptedException{


	System.out.println("Launching Orange HRM");
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Ajeesh\\Downloads\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://localhost/orangehrm/orangehrm-5.3/web/index.php/auth/login");

	driver.findElement(By.name("username")).sendKeys("Admin");//username
	driver.findElement(By.name("password")).sendKeys("Stc@1234");//password
	driver.findElement(By.xpath("//button[@type='submit']")).click();//login

	driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item' ])[2]")).click();//PIM
	driver.findElement(By.cssSelector("li.oxd-topbar-body-nav-tab:nth-child(3)")).click();//add employee

	driver.findElement(By.name("firstName")).sendKeys("Meenu");//employee firstname
	driver.findElement(By.name("middleName")).sendKeys("A");//employee middlename
	driver.findElement(By.name("lastName")).sendKeys("A");//employee lastname
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();//save

}
}
