//Verify
//Expected Result(as per req Docs)= Actual Result(As per Application)

package webDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_Verify {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.msedge.driver", "C:\\SELENIUM\\Drivers\\msedgedriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.navigate().to("http://183.82.103.245/nareshit/login.php");
      
      if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) 
      {
    	  System.out.println("title matched");
      }
      else
      {
    	  System.out.println("title not matched");
    	  System.out.println("original title is"+driver.getTitle());
      }
      Thread.sleep(2000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("logged-in");
	Thread.sleep(3000);
	if(driver.getTitle().equals("OrangeHRM")) 
	{
		System.out.println("title matched");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logged out");
	Thread.sleep(1000);
	driver.close();
      }
	}


