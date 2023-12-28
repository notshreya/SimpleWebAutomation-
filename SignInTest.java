package simpleenergy.SimpleWebAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class SignInTest {
	WebDriver driver;
	String url="https://qa.simpleenergy.in/";
	

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	
      
    }
    
    @Test
    public void f() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div[1]/img")).click();
    	
    	//click on signIn
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/p[1]")).click();
    	
    	//enter an invalid phone number
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("input[name='number']")).sendKeys("900876748");
    	
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector("button.common-action-button.disabled")).click();
    	
    	// Locate the element containing the message
    	Thread.sleep(2000);
        WebElement messageElement = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[1]/small"));

        // Get the text content of the element
        String message = messageElement.getText();

        // Print the message to the console
        System.out.println("Message from the web application: " + message);
    

    	
    	//enter the valid phone number in the input field
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("9008767489");
    	
    	//click on request otp button
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector("button[type='submit']")).click();
    	
    	//to click on resend otp 
    	Thread.sleep(63000);
    	 WebElement resendButton = driver.findElement(By.cssSelector(".resend-code"));
         resendButton.click();
                  

    	//enter invalid otp and generate the message in the console
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector(".otp-inputs")).sendKeys("1");
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[2]/input")).sendKeys("1");
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[3]/input")).sendKeys("3");
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[4]/input")).sendKeys("4");
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/button")).click();
    	
    	Thread.sleep(3000);
    	WebElement messageElement2  = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[3]/div[2]")) ;
    	 // Get the text content of the element
        String message2 = messageElement2.getText();

        // Print the message to the console
        System.out.println("Message from the web application: " + message2);
    	
        //click on try again
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[3]/div[2]/span")).click();
    	
        //enter the valid otp and click on next
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector(".otp-inputs")).sendKeys("1");
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[2]/input")).sendKeys("2");
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[3]/input")).sendKeys("3");
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div[4]/input")).sendKeys("4");
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/button")).click();
    	

    	
    
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
}
