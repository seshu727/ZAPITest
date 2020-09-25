package Git_Actions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch {
	static WebDriver driver;
	@Before
	public static void setup() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SESHU\\Talentas\\Talent_Workspace\\webApp_Purchase_Insight_Tool\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void sampleTest() {
		System.out.println("done");
		Assert.assertEquals("seshu", "seshu");
	}
}
