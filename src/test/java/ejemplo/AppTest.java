package ejemplo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {
	@Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","/home/israel/Descargas/chromedriver.exe");
        ChromeOptions opciones = new ChromeOptions();
        opciones.setBinary("/opt/google/chrome/chrome.exe");
        WebDriver driver=new ChromeDriver(opciones);
        driver.get("https://www.google.es/");
        driver.manage().window().maximize();
        driver.close();
    }
}
