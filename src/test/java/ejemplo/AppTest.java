package ejemplo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {
	@Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
		//System.setProperty("webdriver.chrome.driver","/home/israel/Descargas/chromedriver");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Israel\\eclipse-workspace\\Prueba\\chromedriver.exe");
        ChromeOptions opciones = new ChromeOptions();
        
        //opciones.setBinary("/opt/google/chrome/chrome");
        opciones.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        opciones.addArguments("--no-sandbox");
        opciones.addArguments("--disable-setuid-sandbox");
        opciones.addArguments("--remote-debugging-port=9222");
        opciones.addArguments("--disable-dev-shm-using");
        opciones.addArguments("--disable-extensions");
        opciones.addArguments("--disable-gpu");
        opciones.addArguments("start-maximized");
        opciones.addArguments("disable-infobars");
        
        WebDriver driver=new ChromeDriver(opciones);
        driver.get("https://www.google.es/");
        driver.close();
    }
}
