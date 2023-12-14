package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsertesting {
	static WebDriver driver;
    String url="https://dsportalapp.herokuapp.com";
    @Test @Parameters("Browsername")
	public void crossbrowser(String browsername) {
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver.get(url);
			System.out.println("Chrome browser is launched");
		}
		else if(browsername.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(url);
			System.out.println("Edge browser is launched");
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get(url);
			System.out.println("Firefox browser is launched");
			
		}		
	}
	
	
}
