package ejemplo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	@Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.es/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.close();
    }
}
