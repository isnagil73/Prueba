package ejemplo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {
	@Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        //System.setProperty("webdriver.gecko.driver","C:\\Geckodriver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.es/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.close();
    }
}
