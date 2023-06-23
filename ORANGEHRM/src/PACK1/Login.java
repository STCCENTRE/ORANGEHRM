package PACK1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	  public void f()  {
		
		  System.out.println("hellooo...web page launching with chrome");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Blessy\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("http://localhost/orangehrm/web/index.php/auth/login");
		      driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     driver.findElement(By.name("username")).sendKeys("Admin");
		     driver.findElement(By.name("password")).sendKeys("Stctvm@123");
		    
		     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	 
		     driver.findElement(By.linkText("PIM")).click();
		    driver.findElement(By.linkText("Add Employee")).click();
	         driver.findElement(By.name("firstName")).sendKeys("Blessy");
		     driver.findElement(By.name("middleName")).sendKeys("B");
		     driver.findElement(By.name("lastName")).sendKeys("Biju");
		     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div")).click();
		     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
		     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("BlessyBiju");	
			    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label/span")).click();
			    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("Blessy@2023");
			    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Blessy@2023");
			   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
			   System.out.println("Succesfully Saved");
			   
	}

	}	  
		
			 
	  

