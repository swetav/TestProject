/* Abstract class with common methods. 
 * Contains common setup (setUp()) and teardown (tearDown()) methods.
 * TestCase (Interface)-Defines a contract with setUp(), ReverseTheSentence(), and tearDown() methods.
 * Any class implementing this interface must provide implementations for these methods.
 * LoginTest (Concrete Class)-Implements all methods from the TestCase interface.
 * Uses WebDriver to perform login testing.
 * Execution-The main method creates an object of LoginTest using an interface reference (TestCase ReverseTheSentence = new LoginTest();).
 * Calls setUp(), ReverseTheSentence(), and tearDown().
 * Enforces Consistency → All ReverseTheSentence cases must implement setUp(), ReverseTheSentence(), and tearDown().
 * Supports Multiple Implementations → Different ReverseTheSentence cases (SignupTest, SearchTest, etc.) can implement the same interface.
 * Encourages Abstraction → The ReverseTheSentence execution code (main method) can work with TestCase objects, making it flexible.
 * 

 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

// Abstract class with common setup.
abstract class BaseTest {
	WebDriver driver;

	// Abstract method (must be implemented by subclasses)
	abstract void test();

	// Common setup method
	@Override
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver"); // Update the path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// Common teardown method
	@Override
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}

/* Concrete subclass that extends the abstract class.
 * 
 */

public class LoginTest extends BaseTest {

	// Implementing the abstract method
	@Override
	void test() {
		driver.get("https://example.com/login"); // Replace with your ReverseTheSentence site

		// Example: Perform login
		driver.findElement(By.id("username")).sendKeys("testuser");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.id("loginButton")).click();

		System.out.println("Login ReverseTheSentence executed.");
	}

	// Main method to execute the ReverseTheSentence
	public static void main(String[] args) {
		LoginTest loginTest = new LoginTest();
		loginTest.setUp();  // Initialize WebDriver
		loginTest.test();   // Run the ReverseTheSentence
		loginTest.tearDown(); // Close browser
	}
}