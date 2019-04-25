package InterviewQA_TOP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UncheckedRadioButtonCount {
	@Test
	public void sample() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/radio.html");
		System.out.println(driver.getTitle());
		List<WebElement> ele = driver.findElementsByXPath("//input[@type='radio']");
		
		int count=0;
		for (WebElement webElement : ele) {
			if(webElement.getAttribute("checked")!=null) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
		
	}
}
