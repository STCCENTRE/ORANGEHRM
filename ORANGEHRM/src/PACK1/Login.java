package PACK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Adminlocal\\Desktop\\SELENIUM\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://localhost/orangehrm/web/index.php/auth/login");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Stc@1234");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		driver.findElement(By.cssSelector(".orangehrm-firstname")).sendKeys("Joseph");
		driver.findElement(By.cssSelector(".orangehrm-lastname")).sendKeys("Devasia");
		driver.findElement(By.cssSelector("button.oxd-button:nth-child(3)")).click();
		driver.quit();
	}
}
