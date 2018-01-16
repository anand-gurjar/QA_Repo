import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New {

	
	public static void main (String args[]){
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qa.varstreet.com/XCBO/Enterprise/ContractProduct.aspx?VCID=6036&CONTRACTID=10362&ISUPDATE=false&CONTRACTINFO=Stuti+SEWP+V+Contract+%5b+Stuti+SEWP+V+Contract+%5d&USERID=13784");
		System.out.println(driver.getTitle());
	}
}
