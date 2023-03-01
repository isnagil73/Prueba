package ejemplo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {
	@Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Israel\\eclipse-workspace\\Prueba\\chromedriver.exe");
        ChromeOptions opciones = new ChromeOptions();
        opciones.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver=new ChromeDriver(opciones);
        driver.get("https://www.google.es/");
        driver.manage().window().maximize();
        driver.close();
    }
}
