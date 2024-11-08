package testBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	@BeforeTest(groups= {"sanity","regression"})
	@Parameters("browser")
	public void setup(String br)
	{
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "fire":driver=new FirefoxDriver();break;
		default:return;
		}
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@AfterTest(groups= {"sanity","regression"})
	public void tearDown()
	{
		driver.quit();
	}

	public String captureScreen(String tname) {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		String Targetpath=System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timestamp+".png";
		File targetfile=new File(Targetpath);
		
		sourcefile.renameTo(targetfile);
		return Targetpath;
		
	}

}
