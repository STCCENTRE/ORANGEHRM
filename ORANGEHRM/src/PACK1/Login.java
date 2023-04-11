package PACK1;

public class Login {
	WebDriver driver;

	@Test
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


}
}
