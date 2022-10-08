import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWeb {
	public static void main(String[] args) throws InterruptedException, IOException {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","D:\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//maximize the screen
		wd.manage().window().maximize();
		wd.get("https://www.ilovepdf.com/word_to_pdf");
		WebElement we1=wd.findElement(By.xpath("//*[@id=\"pickfiles\"]"));
		we1.click();
		Runtime.getRuntime().exec("F:\\fileupload.exe");
			
	
	
	}

}

