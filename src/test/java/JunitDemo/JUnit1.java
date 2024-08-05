package JunitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit1 {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void SearchTest() {
		
		driver.findElement(By.cssSelector("[aria-label=\'Search for anything\']")).sendKeys("gaming laptop");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"cbx x-refine__multi-select-cbx\"])[1]")).click();
	}
	
	@After
	public void teardown() {
		driver.close();
	}
	

}
