package ejemplo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	@Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
		WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","C:\\Geckodriver\\geckodriver.exe");
        //WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.es/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}
