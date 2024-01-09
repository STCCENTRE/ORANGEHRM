package LOGIN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		Thread.sleep(5000);
		
		//ADDING EMPLOYEE
		driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewPimModule']")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		//add details
		
		driver.findElement(By.name("firstName")).sendKeys("Arun");
		driver.findElement(By.name("middleName")).sendKeys("sree");
		driver.findElement(By.name("lastName")).sendKeys("lal");



		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("100");
	
		
	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("oxd-form-loader")));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
