package Deals4you;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import java.util.*;
public class Dealz {
	public static AndroidDriver driver;
	public void devicecapability() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
		capabilities.setCapability("deviceName","lenovok50a40");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("appPackage", "com.ziox.marketplace");
		capabilities.setCapability("appActivity","com.ziox.marketplace.MainActivity");
		capabilities.setCapability("no ResetValue", "false");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	public void SIZE(){
		Dimension size ;
		size = driver.manage().window().getSize();
		System.out.println(size);
		
	}
	public void TOPAPP(){
		driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"TOP APPS\")").click();
	 driver.swipe(543, 1881, 537, 1895, 10000);
	 
		//TouchAction action = new TouchAction(driver);
		// action.longPress(540,1725).moveTo(577,497).release();
		//action.tap(289,1290).release().perform();
		 //driver.performTouchAction(action);
		// driver.findElementById("com.example.intexyou:id/ivGoOnTop").click();

	}
	public void DAILYREWARD(){
		 driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"DAILY REWARD\")").click();
	}
	public void RECHARGE(){
		 driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"RECHARGE\")").click();
	}
  public void SURVEY(){
	  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"SURVEY\")").click();
	
}
  public void FASHION(){
	  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"FASHION\")").click();
  }public void scroll() throws IOException {
          Dimension dimensions = driver.manage().window().getSize();
		System.out.println("Size of screen= " +dimensions);
		int Startpoint = (int) (dimensions.getHeight() * 0.5);
		System.out.println("Size of scrollStart= " +Startpoint );
		int scrollEnd = (int) (dimensions.getHeight() * 0.2);
		System.out.println("Size of cscrollEnd= " + scrollEnd);             
		driver.swipe(0, Startpoint,0,scrollEnd,1000);    
  }
  public void FOOD(){
	  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"FOOD\")").click();
  }
  public void ACCESSORIES(){
	  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"ACCESSORIES\")").click();
  }
  public void NEWS() throws InterruptedException{
	  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"NEWS\")").click();
	  Thread.sleep(1000);
	  //TouchAction action = new TouchAction(driver);
		// action.longPress(507,1785).moveTo(540,522).release().perform();
		// action.press(432, 1578).release().perform();
		// driver.performTouchAction(action);
		 //driver.swipe(544, 1026, 341, 979, 10);
		
		 
		 //driver.navigate().back();
		 
		 
  }
  public void SEARCH() throws InterruptedException{
		//click on search button
		driver.findElementById("com.example.intexyou:id/ivSearch").click();
		Thread.sleep(1000);
		// click on back button of search page
		driver.navigate().back();
		//driver.findElementById("com.example.intexyou:id/ivBack").click();
  }
  public static void main(String args[]) throws InterruptedException, MalformedURLException{
		Dealz deals = new Dealz();
		deals.devicecapability();
		deals.SIZE();
		deals.TOPAPP();
		//deals.DAILYREWARD();
		//deals.RECHARGE();
		//deals.SURVEY();
		deals.FASHION();
		deals.FOOD();
		//deals.ACCESSORIES();
		//deals.NEWS();
		//deals.SEARCH();
		Thread.sleep(1000);
  }
}
