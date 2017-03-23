package Deals4you;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.*;

public class Deals {
	private static final WebElement WebElement = null;
	public static AndroidDriver driver;
	public static void main(String args[]) throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
		capabilities.setCapability("deviceName","lenovok50a40");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("appPackage", "com.example.intexyou");
		capabilities.setCapability("appActivity","com.intex.marketplace.MainActivity");
		capabilities.setCapability("no ResetValue", "false");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	// click on drawer button to display image
		//driver.findElementById("com.example.intexyou:id/btimage").click();
		//click on search button
	//driver.findElementById("com.example.intexyou:id/ivSearch").click();
	// click on back button of search page
	//driver.navigate().back();
	//driver.findElementById("com.example.intexyou:id/ivBack").click();
	 //driver.scrollTo("RECHARGE");
	 //driver.findElementByXPath("//android.widget.HorizontalscrollView[3]/android.widget.LinearLayout[0]/android.widget.TextView[2]").click(); 
	//driver.findElementById("com.example.intexyou:id/btimage").click();
	//driver.findElementById("com.example.intexyou:id/edtSearch").sendKeys("candy crush");
	 //driver.findElementByXPath("//android.widget.FrameLayout[0]/android.view.ViewGroup[0]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[0]");
	 
	//driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"DAILY REWARD\")").click();
	 //Thread.sleep(1000);
	 driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"TOP APPS\")").click();
	 //Thread.sleep(10000);
	 TouchAction action = new TouchAction(driver);
	 action.longPress(516,1804).moveTo(546,1689).release().perform();
	 //action.longPress(546,1689).moveTo(516,1804).release().perform();
	 
	  action.press(378, 1703).release();
	 driver.performTouchAction(action);
	 
	 driver.findElementById("com.example.intexyou:id/btnDownload").click();
	 
	 //driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"RECHARGE\")").click();
	 //Thread.sleep(1000);
	 //driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"SURVEY\")").click();
	 //driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"FASHION\")").click();
	 //Thread.sleep(1000);
	 //driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"ACCESSORIES\")").click();
	 //Thread.sleep(1000);
	 //driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"FOOD\")").click();
	 //Thread.sleep(1000);
	 //driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"NEWS\")").click();
	 //list.get(0);	
//List <WebElement> list1 =driver.findElements(By.tagName("listView"));
	//System.out.println(list1.size());
		Thread.sleep(10000);

	}

}

