package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.name("q")).sendKeys("shubhman");
		//driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("shubhman");
		
		//driver.findElement(By.id("APjFqb")).sendKeys("shubhman");

	}

}
