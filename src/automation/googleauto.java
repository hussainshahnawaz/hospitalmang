package automation;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class googleauto {

	public static void main(String[] args) throws
	InterruptedException {
		// TODO Auto-generated method stub

		
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.chrome.driver",path+"\\driver\\Chrome_Driver\\chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 driver.get("https://www.google.com/");
				 WebElement element = driver.findElement(By.name("q"));
				  element.sendKeys("c programing");
				  element.submit();
				Thread.sleep(500000);
				
				driver.close();
	}

}
