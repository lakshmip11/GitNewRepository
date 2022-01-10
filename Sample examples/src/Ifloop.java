import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifloop {

	public static void main(String[] args) {
		
		
		//Set Browser property for chrome
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		//Initialize chrome driver
		WebDriver driver = new ChromeDriver();
		//Implicit wait statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Open irctc website
		driver.get("https://www.irctc.co.in/");
		 String titl= driver.getTitle();
		 System.out.println(titl);
		 String Er="IRCTC Next Generation eTicketing System";
		 
		 if(titl.equalsIgnoreCase(Er))
		 {
			 System.out.println("Application title is correct as per SRS");
		 }
		 else
		 {
			 System.out.println("Application title is wrong");
		 }

	}
}

	
