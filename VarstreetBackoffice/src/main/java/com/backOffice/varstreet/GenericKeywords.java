package com.backOffice.varstreet;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import backOffice.util.Constants;

public class GenericKeywords {
	public WebDriver driver;
	public Properties prop;
	public Properties Workflows;
	public Properties AccountProfile;
	public Properties AccountSetting;
	public Properties Rules;
	public Properties PriceList;
	public Properties Activities;
	public Properties Leads;
	public Properties Opportunities;
	public Properties Setup;
	public Properties Carts;
	public Properties Punchout;
	public Properties Store;
	public Properties StoreCatlog;
	public Properties Configurations;
	public Properties Contracts;
	public Properties CustomCatlog;
	public Properties CustomerContracts;
	public Properties Campaigns;
	public Properties MailingList;
	public Properties OrderStatus;
	public Properties Purchase_Orders;
	public Properties Distributors;
	public Properties Categories;
	public Properties Manufacturers;
	public Properties Purchasing;
	public Properties Sales;
	public Properties More;
	public Properties Invoices;
	public Properties Quotes;
	public Properties SalesOrders;
	public Properties sewpTest1;	
	public String Pwindow;


	ExtentTest test;
	public GenericKeywords(ExtentTest test){
		this.test=test;
		prop = new Properties();
		Contracts = new Properties();
		Rules = new Properties();
		sewpTest1 =new Properties();
		Quotes=new Properties();

		
	try {
		
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//resources//project.properties");
		//	FileInputStream fs3 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Rules//Rules.properties");
			FileInputStream fs31 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//home//Contracts//sewpTest1.properties");

			/*		FileInputStream fs1 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Account_Profile//AccountProfile.properties");
			FileInputStream fs2 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Account_Setting//AccountSetting.properties");
			FileInputStream fs5 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Admin//Price_List//PriceList.properties");
			FileInputStream fs6 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM//Activities//Activities.properties");
			FileInputStream fs7 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM//Leads//Leads.properties");
			FileInputStream fs8 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM//Opportunities//Opportunities.properties");
			FileInputStream fs9 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//CRM//Setup//Setup.properties");
			FileInputStream fs10 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//eCommerce//Carts//Carts.properties");
			FileInputStream fs11 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//eCommerce//Punchout//Punchout.properties");
			FileInputStream fs12 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//eCommerce//Store//Store.properties");
			FileInputStream fs13 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//eCommerce//Store_Catlog//StoreCatlog.properties");
			FileInputStream fs14 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//home//Configurations//Configurations.properties");*/
			FileInputStream fs15 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//home//Contracts//Contracts.properties");
		/*	FileInputStream fs16 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//home//Custom_Catlog//CustomCatlog.properties");
			FileInputStream fs17 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//home//CustomerContacts//CustomerContracts.properties");
			FileInputStream fs18 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//marketing//Campaigns//Campaigns.properties");
			FileInputStream fs19 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//marketing//MailingList//MailingList.properties");
			FileInputStream fs20 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//purchasing//Order_Status//OrderStatus.properties");
			FileInputStream fs21 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//purchasing//Purchase_Orders//PurchaseOrders.properties");
			FileInputStream fs22 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//reports//Distributors//Distributors.properties");
			FileInputStream fs23= new FileInputStream(System.getProperty("user.dir")+"//src//test//java//reports//eCommerce//Categories//Categories.properties");
			FileInputStream fs24 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//reports//Manufacturers//Manufacturers.properties");
			FileInputStream fs25 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//reports//Purchasing//Purchasing.properties");
			FileInputStream fs26 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//reports//Sales//Sales.properties");
			FileInputStream fs27 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//sales//Invoices//Invoices.properties");
			FileInputStream fs28 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//sales//More//More.properties");
			FileInputStream fs30 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//salesOrders//SalesOrders.properties");*/
			FileInputStream fs29 = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//sales//Quotes//Quotes.properties");

			prop.load(fs);
			sewpTest1.load(fs31);
			
			
		/*	AccountProfile.load(fs1);
	
			AccountSetting.load(fs2);
			Workflows.load(fs4);
			PriceList.load(fs5);
			Activities.load(fs6);
			Leads.load(fs7);
			Opportunities.load(fs8);
			Setup.load(fs9);
			Carts.load(fs10);			
			Punchout.load(fs11);
			Store.load(fs12);			
			StoreCatlog.load(fs13);
			Configurations.load(fs14);*/			
			Contracts.load(fs15);
			Quotes.load(fs29);
			/*	CustomCatlog.load(fs16);
			CustomerContracts.load(fs17);			
			Campaigns.load(fs18);
			MailingList.load(fs19);			
			OrderStatus.load(fs20);
			Purchase_Orders.load(fs21);			
			Distributors.load(fs22);
			Categories.load(fs23);			
			Manufacturers.load(fs24);
			Purchasing.load(fs25);			
			Sales.load(fs26);
			Invoices.load(fs27);			
			More.load(fs28);			
			
			SalesOrders.load(fs30);		*/	
			
						
			/*	prop.putAll(AccountProfile);
			prop.putAll(Rules);
			prop.putAll(AccountSetting);
			prop.putAll(Workflows);
			prop.putAll(PriceList);
			prop.putAll(Activities);
			prop.putAll(Leads);
			prop.putAll(Opportunities);
			prop.putAll(Setup);
			prop.putAll(Carts);
			prop.putAll(Punchout);
			prop.putAll(Store);
			prop.putAll(StoreCatlog);
			prop.putAll(Configurations);*/
			prop.putAll(Contracts);
			/*	prop.putAll(CustomCatlog);
			prop.putAll(CustomerContracts);
			prop.putAll(Campaigns);
			prop.putAll(MailingList);
			prop.putAll(OrderStatus);
			prop.putAll(Purchase_Orders);
			prop.putAll(Distributors);
			prop.putAll(Categories);
			prop.putAll(Manufacturers);
			prop.putAll(Purchasing);
			prop.putAll(Sales);
			prop.putAll(Invoices);
			prop.putAll(More);
			
			prop.putAll(SalesOrders);*/
			prop.putAll(Quotes);
			prop.putAll(sewpTest1);

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String openBrowser(String browserType){
		test.log(LogStatus.INFO, "Opening Browser");
		if(prop.getProperty("grid").equals("Y")){
			DesiredCapabilities cap=null;
			if(browserType.equals("Mozilla")){
				cap = DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setJavascriptEnabled(true);
				cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
				
			}else if(browserType.equals("Chrome")){
				 cap = DesiredCapabilities.chrome();
				 cap.setBrowserName("chrome");
				 cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			}
			
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{		
				if(browserType.equals("ie")){
					driver = new InternetExplorerDriver();
				}else if(browserType.equals("Chrome")){
					System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
					driver =  new ChromeDriver();
				}else if(browserType.equals("Mozilla")){
					System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
					driver =  new FirefoxDriver();
				}
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return Constants.PASS;
	}
	
	public String navigate(String urlKey){
		test.log(LogStatus.INFO, "Navigating to "+ prop.getProperty(urlKey));
		driver.get(prop.getProperty(urlKey));
		return Constants.PASS;
	}
	
	public String click(String locatorKey){
		test.log(LogStatus.INFO,"Clicking on "+ prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		e.click();
		return Constants.PASS;
		
	}
	
	public String input(String locatorKey, String data){
		test.log(LogStatus.INFO,"Typing in "+ prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		e.sendKeys(data);
		return Constants.PASS;
	}

	public String alert() {
		driver.switchTo().alert().accept();
		return Constants.PASS;
	}
	public String Actions(String locatorKey){
		test.log(LogStatus.INFO,"Clicking on "+ prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
	    Actions action =    new Actions(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        action.click(e).perform();
		return Constants.PASS;
	}

	public String Description(){
		driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("Discription");
		driver.switchTo().defaultContent();
		return Constants.PASS;
	}
    public String defaultContent(){
	driver.switchTo().defaultContent();
	return Constants.PASS;
    }
	
	public String dropdownint(String locatorKey, String data){
		test.log(LogStatus.INFO,"Selecting  "+prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		Select dropdown = new Select(e);
		
		dropdown.selectByIndex(Integer.parseInt(data));
		return Constants.PASS;	
		}
	
    public String dropdownText(String locatorKey, String data){
		
		test.log(LogStatus.INFO,"Selecting  "+prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		Select dropdown = new Select(e);
		dropdown.selectByVisibleText(data);
		return Constants.PASS;	
		}
    
    public String dropdownValue(String locatorKey, String data){
		test.log(LogStatus.INFO,"Selecting  "+prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		Select dropdown = new Select(e);
		dropdown.selectByValue(data);
		return Constants.PASS;	
		}
	
	public String closeBrowser() {
		test.log(LogStatus.INFO,"Closing browser");
		driver.quit();
		return Constants.PASS;
		
	}
	public String closeWindow(){
		driver.close();
		return Constants.PASS;
	}
	
	/***************************Validation keywords*********************************/
	public String verifyText(String locatorKey,String expectedText){
		WebElement e = getElement(locatorKey);
		String actualText = e.getText();
		if(actualText.equals(expectedText))
			return Constants.PASS;
		else
			return Constants.FAIL;
	}
	
	public String verifyElementPresent(String locatorKey){
		boolean result= isElementPresent(locatorKey);
		if(result)
			return Constants.PASS;
		else
			return Constants.FAIL+" - Could not find Element "+ locatorKey;
	}
	
	public String verifyElementNotPresent(String locatorKey){
		boolean result= isElementPresent(locatorKey);
		if(!result)
			return Constants.PASS;
		else
			return Constants.FAIL+" - Could find Element "+ locatorKey;
	}
	
	public String scrollTo(String locatorKey){
		int y = getElement(locatorKey).getLocation().y;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+(y-200)+")");
		return Constants.PASS; 
	}
	public String wait(String timeout) {

	try {
		Thread.sleep(Integer.parseInt(timeout));
	} catch (Exception  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return Constants.PASS;
	}
	
	/************************Utility Functions********************************/
	public WebElement getElement(String locatorKey){
		WebElement e = null;
		try{
			if(locatorKey.endsWith("_id"))
				e = driver.findElement(By.id(prop.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_xpath"))
				e = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
			else if(locatorKey.endsWith("_name"))
				e = driver.findElement(By.name(prop.getProperty(locatorKey)));
		}catch(Exception ex){
			reportFailure("Failure in Element Extraction - "+ locatorKey);
			Assert.fail("Failure in Element Extraction - "+ locatorKey);
		}
		
		return e;

	}
	

	public void clear(String locatorKey){
		test.log(LogStatus.INFO,"Clicking on "+ prop.getProperty(locatorKey));
		WebElement e = getElement(locatorKey);
		e.clear();
	
	}
	
	public  String selectList(String locatorKey, String data){
	
		test.log(LogStatus.INFO,"Selecting from list ");
		
			if(!data.equals(Constants.RANDOM_VALUE)){
				test.log(LogStatus.INFO,"Typing in "+ prop.getProperty(locatorKey));
				WebElement e = getElement(locatorKey);
				e.sendKeys(data);
			    try {
					Thread.sleep(2000L);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else{
				// logic to find a random value in list
				WebElement droplist = getElement(locatorKey);
				List<WebElement> droplist_cotents = droplist.findElements(By.tagName("option"));
				Random num = new Random();
				int index=num.nextInt(droplist_cotents.size());
				String selectedVal=droplist_cotents.get(index).getText();
				WebElement e = getElement(locatorKey);
				e.sendKeys(selectedVal);
			}
		
		
		return Constants.PASS;	
	}
	
	public String Upload(String locatorKey, String value){
		WebElement e = getElement(locatorKey);
		e.sendKeys(value);
		driver.manage().window().maximize();
		return Constants.PASS;
		
	}
	public String doubleClick(String locatorkey){
		WebElement e = getElement(locatorkey);
		Actions action = new Actions(driver);
		action.doubleClick(e).build().perform();
		return Constants.PASS;
	}
	public String Refresh(){
		driver.navigate().refresh();
		return Constants.PASS;
	}
	
	
	public String mousehover(String locatorkey){
		WebElement e = getElement(locatorkey);
		Actions builder=new Actions(driver);
		builder.moveToElement(e).build().perform();
		return Constants.PASS;
	}
	
	public  String checkCheckBox(String locatorKey){
		test.log(LogStatus.INFO,"Checking checkbox ");
		    // true or null
			WebElement e = getElement(locatorKey);
			String checked=e.getAttribute("checked");
			if(checked==null)// checkbox is unchecked
				e.click();
		   return Constants.PASS;
		
	}
	
	public String unCheckCheckBox(String locatorKey,String data){
		//driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		test.log(LogStatus.INFO,"Unchecking checkbox ");
		WebElement e = getElement(locatorKey);
			String checked=e.getAttribute("checked");
			if(checked!=null)
				e.click();
			return Constants.PASS;
		
	}
	public String windowHandle(){
		Pwindow=driver.getWindowHandle();
		for(String child: driver.getWindowHandles()){
		driver.switchTo().window(child);
		}
	  return Constants.PASS;
		
	}
	
	public String windowHandleClose(){
		driver.switchTo().window(Pwindow);
		return Constants.PASS;
		
	}
	
	public boolean isElementPresent(String locatorKey){
		List<WebElement> e = null;
		
		if(locatorKey.endsWith("_id"))
			e = driver.findElements(By.id(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_xpath"))
			e = driver.findElements(By.xpath(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_name"))
			e = driver.findElements(By.name(prop.getProperty(locatorKey)));
		
		if(e.size()==0)
			return false;
		else 
			return true;
	}
	/******************************Reporting functions******************************/
		
	public void reportFailure(String failureMessage){
		takeScreenShot();
		test.log(LogStatus.FAIL,failureMessage);
	}
	public void takeScreenShot(){
		// decide name - time stamp
		Date d = new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ","_")+".png";
		String path=Constants.SCREENSHOT_PATH+screenshotFile;
		// take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// embed
		test.log(LogStatus.INFO, test.addScreenCapture(path));
	}
	
	
}
