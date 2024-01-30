package task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze_Website_Test {

	public static void main(String[] args) {

		// Create a new ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the specified URL
		driver.get("https://www.demoblaze.com/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Get the title of the page
		String pageTitle = driver.getTitle();

		// Verify if the title matches "STORE"
		if (pageTitle.equals("STORE")) {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct website");
		}

		// Close the browser
		driver.quit();
	}
}
