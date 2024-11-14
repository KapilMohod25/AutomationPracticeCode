package Session1;

import java.time.Duration;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSession1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		
		WebElement GoogleSearch= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		GoogleSearch.sendKeys("youtube");
		Thread.sleep(2000);
		GoogleSearch.sendKeys(Keys.ENTER);
		
		WebElement YoutubeLink = driver.findElement(By.xpath("(//h3[text()='YouTube'])[1]"));
		YoutubeLink.click();		
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		//Hit and Search something interesting on Youtube for automating something
		
		WebElement YoutubeSearchBar = driver.findElement(By.xpath("//input[@id='search']"));
		YoutubeSearchBar.sendKeys("Best selenium course");
				
		WebElement YoutubeSearchicon = driver.findElement(By.xpath("(//span[@class='yt-icon-shape style-scope yt-icon yt-spec-icon-shape'])[13]"));
		YoutubeSearchicon.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		

	}

}
