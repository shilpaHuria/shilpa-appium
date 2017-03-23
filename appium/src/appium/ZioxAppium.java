package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class ZioxAppium {
public static AndroidDriver driver;
	
	public void devicecapability() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
		capabilities.setCapability("deviceName","TitaniumVista4G");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName","android");
		capabilities.setCapability("appPackage", "com.ziox.marketplace");
		capabilities.setCapability("appActivity", "com.ziox.marketplace.MainActivity");
		//capabilities.setCapability("unicodeKeyboard", true); if true device keyboard disappears
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	
	}
	public void agree(){
		{
			driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"Agree\")").click();}
		}
		public void wallet(){
			driver.findElementById("com.ziox.marketplace:id/imageView1").click();
			driver.navigate().back();
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
			driver.navigate().back();
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
		public void TOPAPP(){
			driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"TOP APPS\")").click();
			driver.swipe(543, 1881, 537, 1895, 10000);
			 
			//TouchAction action = new TouchAction(driver);
			// action.longPress(540,1725).moveTo(577,497).release();
			//action.tap(289,1290).release().perform();
			 //driver.performTouchAction(action);
			// driver.findElementById("com.example.intexyou:id/ivGoOnTop").click();

		}
	public static void main(String args[]) throws MalformedURLException, InterruptedException{
		ZioxAppium store = new ZioxAppium();
		
		store.devicecapability();
		store.agree();
		store.wallet();
		store.drawer();
		store.recharge();
		Thread.sleep(1000);
		}
		
	}
