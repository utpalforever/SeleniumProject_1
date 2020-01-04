package sikuliYoutube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=VhNL2S20Thc");
//		driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[28]/div[2]/div[1]/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[28]/div[2]/div[1]/button")).click();

		Screen s = new Screen();
		Pattern pauseImg = new Pattern("playToPause.png");
		try {
			s.wait(pauseImg, 2000);
		} catch (FindFailed e) {

			e.printStackTrace();
		}
		s.click();
		s.click();

	}

}
