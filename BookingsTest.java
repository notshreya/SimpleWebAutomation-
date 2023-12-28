package simpleenergy.SimpleWebAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class BookingsTest {
	WebDriver driver;
	String url="https://qa.simpleenergy.in/";
  @Test
  public void f() throws InterruptedException {
	  
	  Thread.sleep(2000);
  	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div[1]/img")).click();
  	
  	//click on signIn
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/p[1]")).click();
	  
  //enter the valid phone number in the input field
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("9008767489");
	
	//click on request OTP button
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	//enter the OTP
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div[1]/input")).sendKeys("1");
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[2]/input")).sendKeys("2");
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[3]/input")).sendKeys("3");
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[4]/input")).sendKeys("4");
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/button")).click();
	  
	  //click on the arrow button
	
	 Thread.sleep(2000);
	 driver.findElement(By.className("arrow")).click();
	  
	// Switching to Alert        
     Alert alert = driver.switchTo().alert();		
     		
     // Capturing alert message.    
     String alertMessage= driver.switchTo().alert().getText();		
     		
     // Displaying alert message		
     System.out.println(alertMessage);	
//     Thread.sleep(1000);
     		
     // Accepting alert		
     alert.accept();	
     
     //click on modify order and then click on change
     	
     Thread.sleep(2000);   
     //Locate the outer div with the class name "options-container"
     	
     		WebElement optionsContainer = driver.findElement(By.className("options-container"));

     // Locate the first div with the class name "option" within the optionsContainer
     	
     		WebElement firstOption = optionsContainer.findElement(By.className("option"));
 
     // Click on the first option
     			
     		firstOption.click();
     		
     		//To change the color
     		Thread.sleep(2000);
     		driver.findElement(By.className("color-change-btn-container")).click();
     		
     		Thread.sleep(6000);
     		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[4]/button[1]")).click();
     		
     		Thread.sleep(60000);
     		driver.findElement(By.className("preBookProceedbtn")).click();
     		
     		Thread.sleep(2000);
     		driver.findElement(By.className("btns-wrapper")).click();
     		
     		//to change the location
//     		Thread.sleep(5000);
//     		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/div[2]/form/div[1]/div/input")).sendKeys("");
//     		
     		Thread.sleep(3000);
     		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/div[2]/form/div[1]/div/input")).sendKeys("560064");
     		
//     		Thread.sleep(3000);
//     		WebElement dropdownElement = driver.findElement(By.className("Dropdown-arrow"));
//     		dropdownElement.click();
//     		Select dropdown = new Select(dropdownElement);

            // Select an option by visible text
            //dropdown.selectByIndex(6);
     		
  
     
     	
     
     //click on get receipt and download it
//    	Thread.sleep(4000);
//     new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("options-container")));
//     	WebElement optionsContainer = driver.findElement(By.className("options-container"));
//     	
//     	WebElement secondOption = optionsContainer.findElements(By.className("option")).get(1);
//     	
//     	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", secondOption);
//
//     	secondOption.click();
//
//
//     	Thread.sleep(3000);
//     	WebElement downloadButton = driver.findElement(By.cssSelector("button.common-action-button.enabled"));
//     	downloadButton.click();
//     	
//     	Thread.sleep(4000);
//     	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/button[2]")).click();
//     	
//    	Thread.sleep(3000);
//    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[3]/div[3]/div[3]")).click();
//    	
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[4]/div/textarea")).sendKeys("Hello");
//    	
//    	Thread.sleep(1000);
//    	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[5]/button")).click();
//
//     
     	
     
     
     
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
