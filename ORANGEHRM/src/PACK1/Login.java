package PACK1;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class branchjerin {
	@Test
	public void facebooktest() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Poby\\Downloads\\selenium\\New folder\\firefox\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("Jerin");
	driver.findElement(By.name("pass")).sendKeys("password3456");
	driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();

	}	
}