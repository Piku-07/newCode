package newUI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pjain\\Downloads\\chromedriver-win64/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("fruits name");
	        driver.findElement(By.xpath("//img[@alt='Google']")).click();
	        driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]")).click();
	        //driver.close();
	       

	   
	}

}
