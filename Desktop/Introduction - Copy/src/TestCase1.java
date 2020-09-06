import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;   

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium\\chromedriver.exe");    
	  WebDriver driver = new ChromeDriver();   
	  driver.get("http://google.com");  
	  //System.out.println(driver.getTitle()); 
	  
	 // System.out.println(driver.getCurrentUrl());
	  
	  driver.get("http://qaclickacademy.com/practice.php");//URL in the browser
	  //driver.get("http://facebook.com");
	  
	  //Assert.assertFalse(driver.findElement(By.xpath("//input[@type='email']")).isSelected());  
	  //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sangamsingh843@yahoo.in");  
	  //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("chintoo@123");       
	  //driver.findElement(By.id("pass")).sendKeys("chintoo@124"); 
	  //driver.findElement(By.xpath("//*[@class='active']")).click();
	  //driver.findElement(By.xpath("//*[@class='active']/following-sibling::li[3]")).click();  
	  //driver.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();
	  //driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click(); 
	  //driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	  //driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	  Thread.sleep(5000);     
	  driver.findElement(By.cssSelector("#checkBoxOption1")).click();  
	  
	  System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected()); 
	  driver.findElement(By.cssSelector("#checkBoxOption1")).click(); 
	  System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
	  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());    
	  
	  //Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected()); 
	  //System.out.println(driver.findElement(By.cssSelector("div._4rbf._53ij")).getText());    
	  //driver.navigate().back();
	  driver.close(); 
	  //driver.quit(); 

	}

}
