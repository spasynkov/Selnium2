package selenium1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");


		WebElement searchBox = driver.findElement(By.id("lst-ib"));

		searchBox.sendKeys("noga");
		searchBox.submit();
		Thread.sleep(3000);
		driver.quit();




	}
}
