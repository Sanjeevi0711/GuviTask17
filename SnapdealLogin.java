package guviTask17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SnapdealLogin {
		public static void main(String[] args) throws Exception {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = (WebDriver) new EdgeDriver();
			driver.get("https://www.snapdeal.com");
			driver.manage().window().maximize();
			 // Create Actions object
	        Actions actions = new Actions(driver);

	        // Locate the Sign In button and move the cursor to it


	        WebElement signInButton = driver.findElement(By.xpath("//div[@class='accountInner']"));
	        actions.moveToElement(signInButton).perform();

	        // Wait for the Sign In options to appear (adjust the timeout as needed)
	        Thread.sleep(1000);

	         WebElement login=driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
	        login.click();

	        driver.switchTo().frame("loginIframe");
	        driver.switchTo();

	        Thread.sleep(1000);


		 WebElement emailid=driver.findElement(By.xpath("//*[@id=\'userName\']"));
	       emailid.sendKeys("abcd@gmail.com"); 

	       WebElement continuebutton=driver.findElement(By.xpath("//button[@id='checkUser']"));
	       continuebutton.click();

	       WebElement password=driver.findElement(By.xpath("//*[@id=\'paaword\']"));
	       password.sendKeys("12345"); 

	       WebElement login1=driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
	       login1.click();


	        WebElement loggedInMessage = null;
			if (loggedInMessage.isDisplayed()) {
	            System.out.println("User logged in successfully.");
	        } else {
	            System.out.println("Login unsuccessful.");
	        }

	        // Close the browser
	        driver.quit();

		}

	

}
