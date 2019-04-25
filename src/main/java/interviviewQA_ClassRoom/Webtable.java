package interviviewQA_ClassRoom;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Webtable {
	ChromeDriver driver;
	
	@BeforeTest
    public void launchApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(enabled=false)
	public void selectCheckBoxBaseOnText1() throws InterruptedException{
		driver.findElementByXPath("//*[contains(text(),'Handle Exceptions')]/following::input").click();
		Thread.sleep(5000);
	}

	@Test(enabled=false)
	public void selectCheckBoxBaseOnText2() throws InterruptedException{
		List<WebElement> eleRows = driver.findElementsByXPath("//table//tr");
		System.out.println("Number Of Rows : "+eleRows.size());
        for(int i=2;i<=eleRows.size();i++)   		
        {
        	System.out.println(driver.findElementByXPath("//table//tr["+i+"]/td[1]").getText());
        	if(driver.findElementByXPath("//table//tr["+i+"]/td[1]").getText().contains("Handle Exceptions"))
        	{
        		driver.findElementByXPath("//table//tr["+i+"]/td[3]").click();
        		Thread.sleep(3000);
        	}
        }
		
	}
	
	
	@Test(enabled=false)
	public void getTheMinmumPercent1(){
		List<WebElement> eleRows = driver.findElementsByXPath("//table//tr");
		System.out.println("Number Of Rows : "+eleRows.size());
		System.out.println("Number Of Cols "+driver.findElementsByXPath("//table//tr[2]/td").size());
		List<WebElement> allElePercent = driver.findElementsByXPath("//*[contains(text(),'%')]");
		List<Integer> allVal=new LinkedList<Integer>();
		for (WebElement ele : allElePercent) {
		 allVal.add(Integer.parseInt(ele.getText().replaceAll("\\D", "")));
		}
		Collections.sort(allVal);
		System.out.println(allVal.get(0));
	}
	
	
	@Test
	public void getTheMinmumPercent2(){
		List<WebElement> eleRows = driver.findElementsByXPath("//table//tr");
		System.out.println("Number Of Rows : "+eleRows.size());
		System.out.println("Number Of Cols "+driver.findElementsByXPath("//table//tr[2]/td").size());
		int[]n=new int[driver.findElementsByXPath("//table//tr[2]/td").size()-1];
		int j=0;
		System.out.println(n.length);
		for(int i=2;i<=eleRows.size();i++)
		{
			n[j] = Integer.parseInt(driver.findElementByXPath("//table//tr["+i+"]/td[2]").getText().replaceAll("%", ""));
			j++;
		}
		Arrays.sort(n);
		System.out.println(n[0]);
		
		
	}
	
	@AfterTest
    public void closeApp() {
		driver.close();
	}
}
