import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException, NumberFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sx.au-syd.mybluemix.net/");
		Thread.sleep(3000);
		driver.findElement(By.id("i0116")).sendKeys("sangam_s@hcl.com");
		driver.findElement(By.id("idSIButton9")).click(); 
		WebElement password = driver.findElement(By.id("i0118")); 
		password.sendKeys("chintoo@098"); 
		Thread.sleep(2000);
		//password.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        System.out.println("Please Enter the code :: ");
        String code = br.readLine();
        driver.findElement(By.id("idTxtBx_SAOTCC_OTC")).sendKeys(code);
        Thread.sleep(3000); 
        
        driver.findElement(By.id("idSubmit_SAOTCC_Continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        
        String expr = "//i[contains(@class, 'fa-bars')]";
        driver.findElement(By.xpath(expr)).click(); 
        Thread.sleep(2000);
        
        
        List<WebElement> allitems = driver.findElements(By.xpath("//ul[@id='categories']/li/a/span"));
		
		for(WebElement item : allitems){
			
			System.out.println(item.getText()); 
		 	
		}
	}
}	
        
        
		
		
		
		

		//driver.findElement(By.className("fa fa-bars")).click(); 
		/*driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();       
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click(); 
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(false); 
		}
			else  
			{
				Assert.assertTrue(true);  
				
			}
		driver.findElement(By.id("divpaxinfo")).click(); 
		for(int i=0;i<2;i++) {   
		driver.findElement(By.id("hrefIncAdt")); 
		} */
		
		
