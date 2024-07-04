package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		Thread.sleep(2000);
		drpCountry.selectByVisibleText("IRELAND");
		Thread.sleep(3000);
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(2000);
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		Thread.sleep(2000);
		fruits.selectByVisibleText("Banana");
		Thread.sleep(2000);
		fruits.selectByIndex(3);
		Thread.sleep(1000);
		driver.close();
		
		

	}

}
