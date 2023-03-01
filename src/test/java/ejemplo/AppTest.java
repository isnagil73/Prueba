package ejemplo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {
	@Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","/home/israel/Descargas/chromedriver");
        ChromeOptions opciones = new ChromeOptions();
        
        opciones.setBinary("/opt/google/chrome/chrome");
        opciones.addArguments("start-maximized");
        opciones.addArguments("disable-infobars");
        opciones.addArguments("--disable-extensions");
        opciones.addArguments("--disable-dev-shm-usage");
        opciones.addArguments("--no-sandbox");
        
        WebDriver driver=new ChromeDriver(opciones);
        driver.get("https://www.google.es/");
        driver.close();
    }
}
