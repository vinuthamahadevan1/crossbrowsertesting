package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tetstingmultibrowser {
  WebDriver driver=null;
  
  @Parameters("browser")
  @BeforeTest
  public void setup(String browser) {
	  System.out.println("Browser name is:"+browser);
	  if(browser.equalsIgnoreCase("chrome")) {
		  driver=new ChromeDriver();
		  System.out.println("chrome is launched");
	  }
	  else if(browser.equalsIgnoreCase("Firefox")) {
		  driver=new FirefoxDriver();
		  System.out.println("firefox is launched");
	  }
	  else if(browser.equalsIgnoreCase("Edge")) {
		  driver=new EdgeDriver();
		  System.out.println("edge is launched");
	  }
  }
  @Test
  public void test1() {
	  driver.get("https://dsportalapp.herokuapp.com");
	  driver.close();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
}
