package appium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
//import java.awt.List;
//import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
public class ZioxAppium {
public static AndroidDriver driver;
	
	public void devicecapability() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
		capabilities.setCapability("deviceName","lenovok50a40");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName","android");
		capabilities.setCapability("appPackage", "com.ziox.marketplace");
		capabilities.setCapability("appActivity", "com.ziox.marketplace.MainActivity");
		//capabilities.setCapability("unicodeKeyboard", true); if true device keyboard disappears
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	
	}
	public void swipe_vertical() throws InterruptedException{
		
		 
		Dimension size = driver.manage().window().getSize();
		int height = size.height;
		int width = size.width;
		System.out.println("height=" +size.height+"width="+size.width);
		int startx = size.width/2;
		int endx = size.width/2;
		int starty = size.height - size.height/4;
		//int starty = size.height - size.height/6;
		//int starty = size.height - size.height/8;
		int endy = size.height/4;
		System.out.println("vertical swipe");
		
		driver.swipe(startx,starty,endx,endy,200); 
		Thread.sleep(10000);
		driver.findElementById("com.ziox.marketplace:id/ivGoOnTop").click();
		//System.out.println(driver.findElementById("com.ziox.marketplace:id/llMain").getSize());
		//driver.swipe(544, 1079, 961, 1419, 1000);
	//WebElement element = driver.findElementByAndroidUIAutomator("Uiselector().className(\"android.widget.LinearLayout[[5]\").text(\"Snapdeal\")");
		  WebDriverWait wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("Uiselector().className(\"android.widget.LinearLayout[[5]\").text(\"Snapdeal\")")));
		//do{
			//driver.swipe(544, 1079, 961, 1419, 600);
		//}while(!element.isDisplayed());
		
				

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
			//driver.findElementByAndroidUIAutomator("Uiselector().className(\"android.widget.LinearLayout\").text(\"MY PROFILE\")").click();
			 driver.findElementByXPath("//android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[0]/android.widget.ListView[2]/android.widget.LinearLayout[3]").click();
			//driver.findElementsByXPath("//android.widget.LinearLayout[1]/listView[1]/linearLayout[1]");
			driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout'][@index='1']"));
			//List buttons = (List) driver.findElements(By.className("android.widget.ImageView"));
			 //List buttons).get(0).click(); 
			//driver.navigate().back();
			}
		public void recharge()
		{
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
		public void postpaid()
		{
			driver.findElementById("com.ziox.marketplace:id/llPostpaid").click();
			
		}
		public void DTH(){
			driver.findElementById("com.ziox.marketplace:id/llDTH").click();
			
		}
		public void electric(){
			driver.findElementById("com.ziox.marketplace:id/llElectric").click();
		
		}
		public void pager(){
			driver.findElementById("com.ziox.marketplace:id/ivPager_item[0]").click();
			driver.findElementById("com.ziox.marketplace:id/ivPager_item[1]").click();
			driver.findElementById("com.ziox.marketplace:id/ivPager_item[2]").click();
		}
		//public void connection(){
			//NetworkConnectionSetting connection_wifi_off = new NetworkConnectionSetting(false, false, false);		}
		
			
	
			
		
		public void TOPAPP() throws InterruptedException{
			driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"TOP APPS\")").click();
			
              // WebElement element = (WebElement) driver.findElementById("com.ziox.marketplace:id/llMain[6]");
			  // while (!((WebElement) element).isDisplayed()) {
                   swipe_vertical();
                  // WebDriverWait wait = new WebDriverWait(driver, 60)
                   //wait.until(ExpectedConditions.elementToBeClickable(By.name("PhonePe")));
                  
		}
		

	
			 
			//TouchAction action = new TouchAction(driver);
			// action.longPress(540,1725).moveTo(577,497).release();
			//action.tap(289,1290).release().perform();
			 //driver.performTouchAction(action);
			// driver.findElementById("com.example.intexyou:id/ivGoOnTop").click();

		
		public void FASHION() throws InterruptedException{
			  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"FASHION\")").click();
			  Thread.sleep(5000);
			  swipe_vertical();
			  
			 
			 // driver.findElementByXPath("//android.widget.LinearLayout/com.ziox.marketplace:id/llMain[@index='2']");
		      //List <WebElement> list = _driver.findElements(By.xpath("//android.widget.ListView[@resource-id='ELEMENT_ID']/android.widget.LinearLayout"));
			  //driver.findElementById("com.ziox.marketplace:id/llMain[@index='3'").click();
		
		}
		public void background(){
			driver.runAppInBackground(60);
		}
		//public void remove(){
			//driver.removeApp("com.ziox.marketplace");
		//}
		public void Close(){
			driver.closeApp();
		}
			  public static void main(String args[]) throws MalformedURLException, InterruptedException{
		ZioxAppium store = new ZioxAppium();
		
		store.devicecapability();
		
		store.agree();
		//store.pager();
		store.FASHION();
		//store.wallet();
		//store.recharge();
		//store.TOPAPP();
		//store.Close();
		//store.remove();
		//store.background();
		//store.drawer();
		//store.recharge();
		Thread.sleep(1000);
		}
		
	}
