package practice;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wappalyzer {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://www.wappalyzer.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	@Test
	public void main() throws InterruptedException {
		
		WebElement resources=driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]"));
		resources.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]")).click();
		Thread.sleep(2000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//      js.executeScript("window.scrollBy(0,1000)","");
//      Element.sendKeys("amazon alb");
        
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]/div[2]")).click();
        driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	    WebElement element=  driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	    element.click();
	
	 
	}

}
