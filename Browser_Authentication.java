package simpleenergy.SimpleWebAutomation;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver-win64\\chromedriver.exe");

	        // Create a new instance of the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the website
	        driver.get("https://qa.simpleenergy.in/");

	        // Handle the authentication popup
	        String username = "qaUser";
	        String password = "Simple@123";
	        String urlWithCredentials = "https://" + username + ":" + password + "@qa.simpleenergy.in/";
	        driver.get(urlWithCredentials);

	        // Close the browser
//	        driver.quit();

	}


}
