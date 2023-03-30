package seleniumwebdriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allnovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BISHU\\Downloads\\seleniumwebdriver\\chromedriver.exe");
		  WebDriver dv1 = new ChromeDriver();
		  dv1.manage().window().maximize();
		  dv1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  dv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  dv1.get("https://allnovel.org/");
		  dv1.findElement(By.name("keyword")).sendKeys("Battle");
		  dv1.findElement(By.className("btn")).click();
	}
}
;