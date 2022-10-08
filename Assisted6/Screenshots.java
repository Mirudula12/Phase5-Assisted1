
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;




public class Screenshots {
	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","D:\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//maximize the screen
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		takeScreenshoot(wd,"google");
		Screen sc=new Screen();
		Pattern p1=new Pattern("F:\\image1.png");
		sc.type(p1,"simplilearn");
		Pattern p2=new Pattern("F:\\image2.png");
		sc.click(p2);
		
			
	
	
	}
	
	public static void takeScreenshoot(WebDriver wd,String fileName) throws IOException {
		//take the screen shot and store it as a file format
		File file=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//now copy the the screen shot to the location
		org.apache.commons.io.FileUtils.copyFile(file,new File("F:\\"+fileName+".png"));
	}
	
	

}
