package simpleenergy.SimpleWebAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ProfileTest {
	WebDriver driver;
	String url="https://qa.simpleenergy.in/";
 
	
	@Test
  public void f() throws InterruptedException {
		
		
		 Thread.sleep(3000);
		  	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div[1]/img")).click();
		  	
		  	//click on signIn
		  	Thread.sleep(3000);
		  	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/p[1]")).click();
			  
		  //enter the valid phone number in the input field
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("9008767489");
			
			//click on request OTP button
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			
			//enter the OTP
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div[1]/input")).sendKeys("1");
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[2]/input")).sendKeys("2");
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[3]/input")).sendKeys("3");
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[4]/input")).sendKeys("4");
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/button")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/header/div/header/div[2]/p[2]")).click();
			
//			Thread.sleep(2000);
//			Alert alert= driver.switchTo().alert();
//			
//			alert.accept();
			
			
			Thread.sleep(3000);
			driver.findElement(By.className("edit-cta")).click();
			
			Thread.sleep(2000);
			Alert alert2= driver.switchTo().alert();
			
			alert2.accept();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/form/div[1]/div[1]/div/input")).clear();
//			.sendKeys("");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/form/div[1]/div[1]/div/input")).sendKeys("Pratheek Shreya Shetty");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/form/div[2]/button")).click();
			  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome\\chromedriver-win64\\chromedriver.exe");
  	  driver = new ChromeDriver();
  	  driver.get(url);
  	String username = "qaUser";
    String password = "Simple@123";
    String urlWithCredentials = "https://" + username + ":" + password + "@qa.simpleenergy.in/";
    driver.get(urlWithCredentials);
  	  driver.manage().window().maximize();
  	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
  }

}
