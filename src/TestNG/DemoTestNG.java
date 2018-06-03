package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class DemoTestNG {
	
	String appUrl = "https://accounts.google.com";
	public WebDriver driver;
	
	DemoTestNG(){
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chrome\\Chromedriver.exe");
		driver = new ChromeDriver();	
		
	}
  
  @Test
  public void TestZipRecruiterLogin() {
	  driver.get("https://www.ziprecruiter.com/");
	  
	// maximize the browser window
      driver.manage().window().maximize();
      
      String expectedTitle = "Job Search - Millions of Jobs Hiring Near You | ZipRecruiter";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(expectedTitle,actualTitle);
      driver.findElement(By.id("loginTab")).click();
		if(driver.findElement(By.className("login_panel_body")).getText().contains("Account Sign In"))
		{
			System.out.println("Successfully opened SignIn page");
					
		}
      driver.findElement(By.name("email")).sendKeys("srilatha.anuguthala@gmail.com");
      driver.findElement(By.name("password")).sendKeys("RosesAreRed");
      driver.findElement(By.className("submit")).click();
      driver.close();
     
      
  }
}
