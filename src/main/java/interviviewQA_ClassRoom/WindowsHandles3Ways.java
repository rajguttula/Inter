package interviviewQA_ClassRoom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.STRadarStyleImpl;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.java.sl.Ce;

public class WindowsHandles3Ways {

	ChromeDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElementById("home").click();
	}
	
	@Test
	public void windowHandles1()  {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			String title = driver.getTitle();
			if(title.contains("Playground"))
			{
				
				break;
			}
		}
		
		
	}
	
	@Test
	public void windowHandles2()  {
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> iterator = allWindows.iterator();
		
		boolean hasNext = iterator.hasNext();
		
		if(iterator.hasNext())
		{
			driver.switchTo().window(iterator.next());
			
		}
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println(driver.getTitle());
		driver.close();
	}

}
