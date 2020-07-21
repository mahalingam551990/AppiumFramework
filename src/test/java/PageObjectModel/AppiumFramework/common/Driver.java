package PageObjectModel.AppiumFramework.common;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Driver {
 
	
	public static AppiumDriver driver;
	public static boolean isAndroidDriver=false;
	private static String appfilePath="\\src\\test\\java\\PageObjectModel\\AppiumFramework\\app\\Amazon_shopping.apk";
	public static void Launch(String drivertoLaunch) throws Exception
	{
		if(drivertoLaunch.equals("ANDROID"))
		{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		caps.setCapability("appPackage","com.amazon.mShop.android.shopping");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("app",System.getProperty("user.dir")+appfilePath);
		caps.setCapability("ensureWebviewsHavePages",true);
		caps.setCapability("platformVersion","10");
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName","Galaxy m30");
		caps.setCapability("noReset",false);
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");		
	    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    isAndroidDriver=true;
		}
		else
		{
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("bundleId","net.one97.paytm");
			caps.setCapability("platformVersion","iOSVersion");
			caps.setCapability("platformName", "iOS");
			caps.setCapability("automationName","XCUITest");
			//caps.setCapability("app","E:\\Myworkspace\\AppiumProject\\src\\Smartprix_1.2.0.apk");
			caps.setCapability("app","E:\\Myworkspace\\AppiumProject\\src\\net.one97.paytm.ipa");
			caps.setCapability("udid","");
			caps.setCapability("deviceName","Apple iphone X");
			//caps.setCapability("newCommandTimeout","30");
			caps.setCapability("fullContextList",true);
		    driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
	
	public static void quitDriver()
	{
		driver.closeApp();
	}
	
	
}
