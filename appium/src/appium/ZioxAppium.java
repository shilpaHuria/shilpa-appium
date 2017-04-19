package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
//import java.awt.List;
//import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.mobile.NetworkConnection;
//import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import io.appium.java_client.MobileElement;8
//import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
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
		//capabilties to capture screenshot
		//capabilities.setCapability("MobileCapabilittyType.TAKES_SCREENSHOT", true);
		//capabilities.setCapability("--no-reset", true); breaks appium in both cases if value is true/false
		//appium keyboard if value is true device keyboard disappears
		capabilities.setCapability("unicodeKeyboard", true);
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
		Thread.sleep(10000);
		
		driver.swipe(startx,starty,endx,endy,200);
		
		Thread.sleep(2000);
		
		//driver.swipe(endx,endy,startx,starty,200);
	}
	public void swipe_up() throws InterruptedException
	{
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
		System.out.println("up swipe");
		Thread.sleep(10000);
	driver.swipe(endx,endy,startx,starty,200);
		
	}

		//public void element(){
			
		
		//List<WebElement> list = driver.findElements(By.id("com.ziox.marketplace:id/gridView"));
		//list.get(6).click();
	//}
		
	
		//driver.findElementByAndroidUIAutomator("text(\"Fitbit\")").click();
		
		//Thread.sleep(20000);
		//driver.findElementById("com.ziox.marketplace:id/ivGoOnTop").click();
		//System.out.println(driver.findElementById("com.ziox.marketplace:id/llMain").getSize());
		//driver.swipe(544, 1079, 961, 1419, 1000);
	//WebElement element = driver.findElementByAndroidUIAutomator("Uiselector().className(\"android.widget.LinearLayout[[5]\").text(\"Snapdeal\")");
	  //WebDriverWait wait = new WebDriverWait(driver, 80);
        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("Uiselector().className(\"android.widget.LinearLayout[[5]\").text(\"Snapdeal\")")));
		//do{
			//driver.swipe(544, 1079, 961, 1419, 600);
		//}while(!element.isDisplayed());
		
		
		//List <WebElement> element = driver.findElementsByClassName("android.widget.LinearLayout");
		//for (int i=1;i<=element.size();i++){
		//try{
			//while(!element.get(i).isDisplayed())
			//{
		
			//driver.swipe(startx, starty, endx, endy, 200);	
			//}}
		//catch(Exception e){
				//driver.swipe(startx, starty, endx, endy, 200);
			//}
		//driver.findElementByAndroidUIAutomator("text(\"Fitbit\")").click();
		
	
		
	public void agree(){
		{
			driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"Agree\")").click();}
		}
		public void wallet(){
			driver.findElementById("com.ziox.marketplace:id/imageView1").click();
			driver.navigate().back();
		}
		public void drawer() throws InterruptedException{
			driver.findElementById("com.ziox.marketplace:id/btimage").click();
			profile();
			RFE();
		   recharge();
			}
		public void profile() throws InterruptedException{
			driver.findElementByAndroidUIAutomator("text(\"MY PROFILE\")").click();
			driver.findElementById("com.ziox.marketplace:id/llMyOrders").click();
			driver.findElementById("com.ziox.marketplace:id/ivBack").click();
			driver.findElementById("com.ziox.marketplace:id/btnEdit").click();
			driver.findElementById("com.ziox.marketplace:id/editTextDialogUserInput").sendKeys("s");
			driver.findElementById("com.ziox.marketplace:id/btnOk").click();
			driver.findElementById("com.ziox.marketplace:id/llWishList").click();
			driver.navigate().back();
			TNC();
			FAQ();
			contact();
		}
		public void contact(){
			driver.findElementById("com.ziox.marketplace:id/llContancUs").click();
			driver.findElementById("com.ziox.marketplace:id/edtSubject").sendKeys("test");
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER );
			driver.findElementById("com.ziox.marketplace:id/edtDiscription").sendKeys("here i am testing");
			driver.findElementById("com.ziox.marketplace:id/btnSend").click();
			driver.navigate().back();
			
		}
		public void FAQ() throws InterruptedException
		{
			driver.findElementById("com.ziox.marketplace:id/llFAQ").click();
			Thread.sleep(2000);
			driver.findElementById("com.ziox.marketplace:id/ivBack").click();
			//driver.navigate().back();
		}
		public void TNC() throws InterruptedException{
			driver.findElementById("com.ziox.marketplace:id/llTNC").click();
			Thread.sleep(2000);
			driver.findElementById("com.ziox.marketplace:id/ivBack").click();
			//driver.navigate().back();
			
		}
		public void RFE(){
			driver.findElementById("com.ziox.marketplace:id/btimage").click();
			driver.findElementByAndroidUIAutomator("text(\"REFER A FRIEND\")").click();
			 //driver.findElementById("com.ziox.marketplace:id/llFAQvSendInvitations").click();
			//driver.navigate().back();
			// bug driver.findElementById("com.ziox.marketplace:id/tvCopyUrl").click();
			// bug driver.navigate().back();
			
		}
		public void recharge() throws InterruptedException
		{
			driver.findElementById("com.ziox.marketplace:id/btimage").click();
			driver.findElementByAndroidUIAutomator("text(\"RECHARGE\")").click();
			
			
			prepaid();
		driver.navigate().back();
			postpaid();
			
			DTH();
		
			electric();
			driver.navigate().back();
		}
		public void prepaid() throws InterruptedException{
			driver.findElementById("com.ziox.marketplace:id/llPrePaid").click();
			//driver.findElementById("com.ziox.marketplace:id/edtMobileNumber").click();
			driver.findElementById("com.ziox.marketplace:id/edtMobileNumber").sendKeys("7206320310"+"\n");
			Thread.sleep(8000);
			driver.findElementById("com.ziox.marketplace:id/edtAMT").sendKeys("10");
			Thread.sleep(5000);
			
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER );
		   //driver.navigate().back();
			//driver.findElementById("com.ziox.marketplace:id/tvBrowsPLans").click();
			//driver.findElementByAndroidUIAutomator("text(\"2G Data\")").click();
			
			//driver.findElementByAndroidUIAutomator("text(\"₹ 15.0 \")").click();
			driver.findElementById("com.ziox.marketplace:id/btnGO").click();
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
		public void connection(){
			//NetworkConnection  connection =  new NetworkConnection(false,false,false);
			//Networkconnection connection = new Networkconnection(false,false,false);
			
			
		
}
  public void TOPAPP() throws InterruptedException{
			driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"TOP APPS\")").click();
			Thread.sleep(2000);

	swipe_vertical();
	 driver.findElementById("com.ziox.marketplace:id/ivGoOnTop").click();
  }
			//driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.LinearLayout[3]\").text(\"Wynk Music\")").click();
		// WebElement gridView = driver.findElementById("com.ziox.marketplace:id/gridView"); 
			//	   List<WebElement> list = gridView.findElements(By.xpath("///android.widget.GridView[@id=com.ziox.marketplace:id/gridView"));
				//   for (int j = 0; j <= list.size(); j++)
						  // {
	//WebElement appElement = list.get(j).findElements(By.xpath("com.android.TextView")).get(0); 
	// if (appElement.getText().equalsIgnoreCase("PhonePe")) 
	//{ 
		// appElement.click(); 
	//break;
		//		   } }  
			//	   }
		   
		  
	  
		  // do {
		    //   List<WebElement> allApps = driver.findElements(By.xpath("//android.widget.GridView[@id=com.ziox.marketplace:id/gridView"));

		      // if (firstItem.getText().equals(allApps.get(0).getText())) {
		        //   System.out.println("Reached to end of list");
		          // break;
		       //}

		       //for (WebElement element : allApps) {
		         //  if (element.getText().contains("PhonePe")) {
		           //    element.click();
		             //  flag = true;
		               //break;
		          // }
		       //}
		       //firstItem = allApps.get(0);

		       //if (!flag) {
		         //  swipe_vertical();
		       //}/
		   //}/ while (!flag);
			
			
			// WebElement element = (WebElement) driver.findElementById("com.ziox.marketplace:id/llMain[6]");
			   // while (!((WebElement) element).isDisplayed()) {
               //  element();       
			   //swipe_vertical();
			
               //driver.findElementById("com.ziox.marketplace:id/ivGoOnTop").click();

                  // WebDriverWait wait = new WebDriverWait(driver, 60)
                   //wait.until(ExpectedConditions.elementToBeClickable(By.name("PhonePe")));
                  
		
		//TouchAction action = new TouchAction(driver);
			// action.longPress(540,1725).moveTo(577,497).release();
			//action.tap(289,1290).release().perform();
			 //driver.performTouchAction(action);
			// driver.findElementById("com.example.intexyou:id/ivGoOnTop").click();

		
		public void FOOTWEAR() throws InterruptedException{
			  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"FOOTWEAR\")").click();
			  Thread.sleep(5000);
			  swipe_vertical();
			
			  Thread.sleep(2000);
			  //driver.findElementById("com.ziox.marketplace:id/ivGoOnTop").click();
			// driver.findElementByXPath("//android.widget.LinearLayout/com.ziox.marketplace:id/llMain[@index='2']");
		    //List <WebElement> list = _driver.findElements(By.xpath("//android.widget.ListView[@resource-id='ELEMENT_ID']/android.widget.LinearLayout"));
			//driver.findElementById("com.ziox.marketplace:id/llMain[@index='3'").click();
		     
			 
		}
		public void movie() throws InterruptedException{
			driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"MOVIES\")").click();
		     Thread.sleep(10000);
		     swipe_vertical();
		     swipe_up();
		    }
		public void Food() throws InterruptedException{
			driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"FOOD\")").click();
			Thread.sleep(10000);
			swipe_vertical();
			swipe_up();
		}
		public void Fun() throws InterruptedException{
			driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"FUN ZONE\")").click();
			Thread.sleep(2000);
			
			}
			//swipe_vertical();

		public void Fitness() throws InterruptedException{
			driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"FITNESS\")").click();
			
			Thread.sleep(5000);
			swipe_vertical();
			//swipe_up();
			
			 driver.findElementById("com.ziox.marketplace:id/ivGoOnTop").click();
			
			
		}
		public void background(){
			driver.runAppInBackground(20);
			driver.currentActivity();
		}
	// TO remove application from device.
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
		store.TOPAPP();
		store.FOOTWEAR();
		store.background();
		store.movie();
		store.Food();
		store.Fun();
	store.Fitness();
//	    store.wallet();
        
		//store.remove();
		 store.drawer();
		store.Close();
		
		Thread.sleep(1000);
		}
		
	}
