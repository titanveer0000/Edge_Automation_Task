package Edge_Selenium_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class edge_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\QA\\chromedriver-win64\\chromedriver.exe");


		
		WebDriver driver = new ChromeDriver();
		
		try {
			// Navigate to the Login Page
            driver.get("https://hachnat.stage-carelogix.de/sign-in"); // Corrected typo in URL
            
            // Initialize WebDriverWait with a timeout of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for Username, Password, and Login button to be visible
            WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("credential")));
            WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("ant-btn")));

            // Enter login credentials and click the login button
            username.sendKeys("titanveer2000@gmail.com");
            password.sendKeys("Carelogix24!!");
            loginButton.click();

            // Wait for the next page or element to load
            Thread.sleep(6000);
            
            // Locate the group button using XPath
            WebElement groupButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[1]/div[1]/div[2]/div[1]/button[2]/span")));

            // Click the group button
            groupButton.click();

            // Add a 2-second delay after clicking
            Thread.sleep(5000);
            
            // Locate the "+" button using XPath to create a new group
            WebElement plusButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[1]/div[1]/div[2]/div[2]/button")));

            // Click the "+" button
            plusButton.click();

            // Add a small delay after clicking the "+" button
            Thread.sleep(2000);

            // Locate the Group Name input field and enter the group name
            WebElement groupNameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]/div/form/div[2]/div/div[2]/div/div/input")));
            groupNameInput.sendKeys("Automation Group - 1");
            
            Thread.sleep(2000);

            // Locate the Group Description input field and enter the description
            WebElement groupDescriptionInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]/div/form/div[3]/div/div[2]/div/div/div/textarea")));
            groupDescriptionInput.sendKeys("This is an automation-created group for testing purposes.");
            Thread.sleep(2000);

            // Locate the Create button and click it
            WebElement createButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]/div/form/div[5]/button")));
            createButton.click();

            // Add a small delay to observe the action
            Thread.sleep(2000);

            // Click on the newly created group
            WebElement createdGroup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[1]/div[2]/div/div/div[1]/div[1]")));
            createdGroup.click();

            // Add a small delay after clicking the group
            Thread.sleep(2000);

            // Locate the message box and type a message
            WebElement messageBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[2]/div[3]/section/div[2]/form/div/div/div/div/div/div/div/div/textarea")));
            messageBox.sendKeys("Hello, this is an automated test message!");

            // Locate the send button and click it
            WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[2]/div[3]/section/div[2]/form/button")));
            sendButton.click();

            // Add a small delay to observe the sent message
            Thread.sleep(2000);

            // Print a success message
            System.out.println("Message sent successfully in the group!");

		
	

	} 
	catch(Exception e) {
			System.out.println("Error here");
		} finally {
			System.out.println("Test Ok !");
	//	driver.quit();
		}
	}
}