package Basic_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome_Firefox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.toolsqa.com/automation-practice-form");
    driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("awsome");
    driver.findElement(By.cssSelector("#datepicker")).sendKeys("14may");
    driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("thakral");
    driver.findElement(By.linkText("Selenium Automation Hybrid Framework")).click();
    driver.findElement(By.xpath("//input[@id='profession-1']")).click();
    Thread.sleep(5000);
    Select select = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
    select.selectByVisibleText("Europe");    		    
    String x = driver.getTitle();    
    System.out.println(x);
    //Validation part  
  if(x.equals("Demo Form for practicing Selenium Automation")) //this is how you compare two string
   
   {
	   System.out.println("correct");
   }
	   else
	   {
		   System.out.println("incorrect");
		   
	   
   }
   
   System.out.println(driver.getCurrentUrl()); 
 //  System.out.println(driver.getPageSource()); 
    
   //driver.close();

	}

}
