package task_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia_Website_Test {

	public static void main(String[] args) {

		// Create a new Chromedriver
		WebDriver driver = new ChromeDriver();

		// Navigate to Wikipedia
		driver.get("https://www.wikipedia.org/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Find the search input field and enter the query "Artificial Intelligence"
		WebElement searchInput = driver.findElement(By.name("search"));
		searchInput.sendKeys("Artificial Intelligence");
		searchInput.submit();

		// Click on the "History" section link
		WebElement historyLink = driver.findElement(By.linkText("History"));
		historyLink.click();

		// Print the title of the "History" section
		String historySectionTitle = driver.findElement(By.id("firstHeading")).getText();
		System.out.println("Title of the History section: " + historySectionTitle);

		// Close the browser
		driver.quit();
	}
}
