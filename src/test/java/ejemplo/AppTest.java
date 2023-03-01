package ejemplo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppTest {
	@Test
    public void prueba() throws InterruptedException
    {
		///System.setProperty("webdriver.chrome.driver","/home/israel/Descargas/chromedriver");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Israel\\eclipse-workspace\\Prueba\\chromedriver.exe");
        //ChromeOptions opciones = new ChromeOptions();
        
        ///opciones.setBinary("/opt/google/chrome/chrome");
		//opciones.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		//opciones.addArguments("--no-sandbox");
		//opciones.addArguments("--disable-setuid-sandbox");
		//opciones.addArguments("--remote-debugging-port=9222");
		//opciones.addArguments("--disable-dev-shm-using");
		//opciones.addArguments("--disable-extensions");
		//opciones.addArguments("--disable-gpu");
		//opciones.addArguments("start-maximized");
		//opciones.addArguments("disable-infobars");
        
		//WebDriver driver=new ChromeDriver(opciones);
		//driver.get("https://www.google.es/");
		//driver.close();
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Israel\\eclipse-workspace\\Prueba\\chromedriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
        Proxy proxy = new Proxy();
        String proxyServer = String.format("AProxyIDontWantToDisplay", System.getenv("proxy.username"), 
System.getenv("proxy.password"));
        proxy.setHttpProxy(proxyServer);
        capabilities.setCapability("proxy", proxy);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--homepage=about:blank");
        options.addArguments("--no-first-run");
        options.addArguments("disable-infobars");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(options);	
        driver.get("https://www.google.es/");
		driver.close();
		
    }
}
