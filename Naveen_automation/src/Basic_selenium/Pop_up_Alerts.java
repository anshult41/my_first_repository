package Basic_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up_Alerts {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert alert= driver.switchTo().alert();
		Thread.sleep(2000);
		String aware = alert.getText();
	
		//Validation part
		if (aware.equals("Please enter a valid user name"))
		{
			System.out.println("correct");
			
		}
			else
			{
				System.out.println("incorrect");
				
				
				
			}
		driver.close();
		}
		
	}


