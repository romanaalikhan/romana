package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderflowTest {
	
	
	@Test
	public void signup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Learning-selenium-1\\chromedriver.exe");
        // initializing driver
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.mariab.pk/");
		driver.findElement(By.id("Eid-Collection")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product-collection-image-25549")));
		
		//driver.findElement(By.xpath("//body[@class='catalog-product-view catalog-product-view product-sf-ea20-08-off-white categorypath-sale-pret-html category-pret show-newsletter-bar']"));
		driver.findElement(By.id("product-collection-image-25549")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='swatch30']")));
		driver.findElement(By.xpath("//span[@id=swatch30]")).click();
		driver.findElement(By.cssSelector("button[title=Add to Bag]")).click();
		
		
	}

}
