
//We need some packages to interact with ChromeDriver and Selenium

//We need to import java.time.Duration for using delays in the testing sequence
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Bellow we have a class where we will use locators to test if a sign in form is working properly
public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// This two steps will open the browser
		System.setProperty("webdriver.chrome.driver", "/home/adriana/chromedriver");

		// ChromeDriver Class is implementing the WebDriver interface

		// We are creating the driver object to interact with the methods of the
		// ChromeDriver

		WebDriver driver = new ChromeDriver();

		// If something doesn't show up in the page, we ask Selenium to wait 5 seconds
		// and not to fail immediately
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// The next step will load the web page we want to test, based on the URL

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		Thread.sleep(1000);

		// The driver interface expose the findElement method
		// We ask our driver object to find an element based on the id
		// We fill in the credentials for the Username in the authentication form

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		// Next we use a regular expression for css Selector
		// We use the * for 'pass' word in the type
		// We look for the password field and then we fill in the credentials for that
		// field

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		// We find the check box based on the id and then click it

		driver.findElement(By.id("chkboxOne")).click();

		// We wait one second before going to the submit button, for better visibility
		// of the sign in flow
		Thread.sleep(1000);
		// We use a regular expression for xpath
		// We are looking for the tag name button that has and attribute named class and
		// a value named 'submit'
		// After finding the element we click it
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();

	}

}
