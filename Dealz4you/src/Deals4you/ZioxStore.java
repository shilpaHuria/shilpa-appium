package Deals4you;
//import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

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

import javax.swing.Action;
public class ZioxStore {
	public static AndroidDriver driver;
	
	public void devicecapability() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
		capabilities.setCapability("deviceName","lenvok50a40");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName","android");
		capabilities.setCapability("appPackage", "com.ziox.marketplace");
		capabilities.setCapability("appActivity", "com.ziox.marketplace.MainActivity");
		//capabilities.setCapability("unicodeKeyboard", true); if true device keyboard disappears
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		}
		public void connection(){
			boolean airplaneMode,wifi,data;
			//NetworkConnectionSetting connection1= new NetworkConnectionSetting(airplaneMode=false,wifi=false,data=true);
			//driver.setNetworkConnection(connection1);
		}
	
	public void agree(){
	{
		driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"Agree\")").click();}
	}
	public void wallet(){
		driver.findElementById("com.ziox.marketplace:id/imageView1").click();
		//driver.navigate().back();
	}
	public void drawer(){
		driver.findElementById("com.ziox.marketplace:id/btimage").click();
		driver.navigate().back();}
	public void recharge(){
		prepaid();
		driver.navigate().back();
		postpaid();
		
		DTH();
	
		electric();
	}
	public void prepaid(){
		driver.findElementById("com.ziox.marketplace:id/llPrePaid").click();
		driver.findElementById("com.ziox.marketplace:id/edtMobileNumber").click();
		driver.findElementById("com.ziox.marketplace:id/edtMobileNumber").sendKeys("7206320310");
		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER );
	    driver.navigate().back();
		driver.findElementById("com.ziox.marketplace:id/tvBrowsPLans").click();
		}
	public void postpaid(){
		driver.findElementById("com.ziox.marketplace:id/llPostpaid").click();
		
	}
	public void DTH(){
		driver.findElementById("com.ziox.marketplace:id/llDTH").click();
		
	}
	public void electric(){
		driver.findElementById("com.ziox.marketplace:id/llElectric").click();
	
	}
	public void TOPAPPS() throws InterruptedException{
		driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"TOP APPS\")").click();
		Thread.sleep(5000);
		
		//driver.tap();
		
	    driver.swipe(529, 18171, 983, 824, 3000);
		//TouchAction action = new TouchAction(driver);
		
		//action.longPress(523,1763).moveTo(493,105).release().perform();
		
		//List<WebElement> list = (List<WebElement>) driver.findElementById("com.ziox.marketplace:id/llMain");
		//list.get(0).click();
		}public static void main(String args[]) throws MalformedURLException, InterruptedException,NullPointerException{
		ZioxStore store = new ZioxStore();
		
		store.devicecapability();
		store.agree();
		store.TOPAPPS();
		//store.drawer();
		store.wallet();
		//store.recharge();
		Thread.sleep(1000);
		}
		
	}


