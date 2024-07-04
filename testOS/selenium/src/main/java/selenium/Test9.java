package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		driver.manage().window().maximize(); //to maximize
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"green\"]")); //click on resizable and select resizable block and copy xpath
		
		Actions action = new Actions (driver);
		Thread.sleep(2000); 
		action.dragAndDropBy(element, -20, 50).perform();
		Thread.sleep(3000);
		driver.close(); //to close single browser
		//driver.quit(); // to close all the browsers

	}

}
