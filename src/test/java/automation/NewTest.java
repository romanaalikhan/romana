package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  
  public void orderflowAsGuest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Learning-selenium-1\\chromedriver.exe");
      // initializing driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.get("https://www.mariab.pk/");
		driver.manage().window().maximize();
		//READY TO WEAR
		driver.findElement(By.xpath("//span[contains(text(),'Ready To Wear')]")).click();
		//wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='category-img']/img[1]")));
		//EVENING WEAR
		driver.findElement(By.xpath("//span[@class='category-img']//img[1]")).click();
	    //IMAGE  
		driver.findElement(By.xpath("//li[@class='item last last']//img[1]")).click();
		//driver.findElement(By.xpath("//li[@class='item last last']/img[1]")).click();
		//wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='swatch'][contains(text(),'XS')]")));
	    //SIZE
	    driver.findElement(By.xpath("//span[@class='swatch'][contains(text(),'XS')]")).click();
	 //   driver.findElement(By.xpath("//span[@class='swatch'][contains(text(),'XS')]")).click();
	    //wait 
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button btn-cart']")));
	    //ADD TO CART
	    driver.findElement(By.xpath("//button[@class='button btn-cart']")).click();
	  //  driver.findElement(By.xpath("//button[@class='button btn-cart']")).click();
	    // scroll
	   // WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Checkout')"));
	  //  Actions actions = new Actions(driver);
	   // actions.moveToElement(element).perform();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Checkout']")));
	   //CHECK OUT  
	    driver.findElement(By.xpath("//a[@title='Checkout']")).click();
	   // driver.findElement(By.xpath("//span[contains(text(),'Checkout')]")).click();
	   // driver.findElement(By.xpath("//span[contains(text(),'Checkout')]")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'PROCEED AS GUEST')]")));
	   //GUEST
	    driver.findElement(By.xpath("//span[contains(text(),'PROCEED AS GUEST')]")).click();
	    //FULL NAME
	    driver.findElement(By.xpath("//div[@class='opc-col opc-col-left']//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]")).sendKeys("Test ROMANA");
	    //EMAIL
	    driver.findElement(By.xpath("//div[@class='data_area']//input[@placeholder='Email Address']")).sendKeys("romana@shopdev.co");;
	    //CONFIRM EMAIL
	    driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("romana@shopdev.co");
	    //SHIPPING ADDDRESS
	    driver.findElement(By.xpath("//body[@class='onepagecheckout-index-index opc-index-index']/div[@class='wrapper']/div[@class='page']/div[@class='main-container col1-layout']/div[@class='main']/div[@class='col-main']/div[contains(@class,'opc-wrapper-opc checkout_container design_package_rwd design_theme_shopistan')]/div[@class='checkout_main opc-main-container']/form/div[@class='col3-set onepagecheckout_datafields']/div[@class='opc-col opc-col-left']/div[@class='opc-col-inner']/div[@class='onepagecheckout_block']/div[@class='form_fields']/div/div[4]/div[1]/input[1]")).sendKeys("test test");
	    //COUNTRY
	   // driver.findElement(By.xpath("//select[@name='billing[country_id]")).sendKeys("pakistan");;
	    //CITY
	    Select city = new Select(driver.findElement(By.id("billing:city")));
		//city.selectByVisibleText("LAHORE");
		city.selectByValue("LAHORE");
		//city.selectByIndex(1);
	    //driver.findElement(By.xpath("//select[@name='billing[city]")).click();
	    //ZIP CODE
	    driver.findElement(By.xpath("//div[6]//div[2]//div[1]//input[1]")).sendKeys("54000");;
	    //MOBILE NUMBER
	    driver.findElement(By.xpath("//div[7]//div[1]//input[1]")).sendKeys("03456545052");
	    //CONFIRM MOBILE NUMBER
	    driver.findElement(By.xpath("//input[@placeholder='Confirm Mobile']")).sendKeys("03456545052");;
	    //COD
	   // driver.findElement(By.xpath("//dt[@class='selected']//input[@name='payment[method]")).click();
	    // TAC
	    driver.findElement(By.xpath("//input[@name='terms']")).click();
	    //Place order now
	    driver.findElement(By.xpath("//button[@class='button btn-checkout']")).click(); 
	    
	    

  }
  public void orderflowLogin() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Learning-selenium-1\\chromedriver.exe");
      // initializing driver
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.mariab.pk/");
		driver.findElement(By.id("Eid-Collection")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
		driver.findElement(By.xpath("//button[@name='send']")).click();
		//READY TO WEAR
				driver.findElement(By.xpath("//span[contains(text(),'Ready To Wear')]")).click();
				//EVENING WEAR
				driver.findElement(By.xpath("//span[@class='category-img']/img[1]")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//li[@class='item last last']/img[1]")));
				
				//IMAGE  
				driver.findElement(By.xpath("//li[@class='item last last']//img[1]")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//span[@class='swatch'][contains(text(),'XS')]")));
				
			    //SIZE
			    driver.findElement(By.xpath("//span[@class='swatch'][contains(text(),'XS')]")).click();
			    //ADD TO CART
			    driver.findElement(By.xpath("//button[@class='button btn-cart']")).click();
			    // scroll
			    WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Checkout')"));
			    Actions actions = new Actions(driver);
			    actions.moveToElement(element).perform();
			   //CHECK OUT
			    driver.findElement(By.xpath("//span[contains(text(),'Checkout')]")).click();
			   //GUEST
			    driver.findElement(By.xpath("//span[contains(text(),'PROCEED AS GUEST')]")).click();
			    //FULL NAME
			    driver.findElement(By.xpath("//div[@class='opc-col opc-col-left']//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]")).sendKeys("Test ROMANA");
			    //EMAIL
			    driver.findElement(By.xpath("//div[@class='data_area']//input[@placeholder='Email Address']")).sendKeys("romana@shopdev.co");;
			    //CONFIRM EMAIL
			    driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("romana@shopdev.co");
			    //SHIPPING ADDDRESS
			    driver.findElement(By.xpath("//body[@class='onepagecheckout-index-index opc-index-index']/div[@class='wrapper']/div[@class='page']/div[@class='main-container col1-layout']/div[@class='main']/div[@class='col-main']/div[contains(@class,'opc-wrapper-opc checkout_container design_package_rwd design_theme_shopistan')]/div[@class='checkout_main opc-main-container']/form/div[@class='col3-set onepagecheckout_datafields']/div[@class='opc-col opc-col-left']/div[@class='opc-col-inner']/div[@class='onepagecheckout_block']/div[@class='form_fields']/div/div[4]/div[1]/input[1]")).sendKeys("test test");
			    //COUNTRY
			    driver.findElement(By.xpath("//select[@name='billing[country_id]")).sendKeys("pakistan");;
			    //CITY
			    driver.findElement(By.xpath("//select[@name='billing[city]")).click();
			    //ZIP CODE
			    driver.findElement(By.xpath("//div[6]//div[2]//div[1]//input[1]")).sendKeys("54000");;
			    //MOBILE NUMBER
			    driver.findElement(By.xpath("//div[7]//div[1]//input[1]")).sendKeys("03456545052");
			    //CONFIRM MOBILE NUMBER
			    driver.findElement(By.xpath("//input[@placeholder='Confirm Mobile']")).sendKeys("03456545052");;
			    //COD
			    driver.findElement(By.xpath("//dt[@class='selected']//input[@name='payment[method]")).click();
			    // TAC
			    driver.findElement(By.xpath("//input[@name='terms']")).click();
			    //Place order now
			    driver.findElement(By.xpath("//button[@class='button btn-checkout']")).click(); 
			    
		
		
		
  }
}
