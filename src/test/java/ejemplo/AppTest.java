package ejemplo;

import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class AppTest {
	@Test
    public void prueba() throws InterruptedException
    {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","/home/israel/Descargas/chromedriver");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Israel\\eclipse-workspace\\Prueba\\chromedriver.exe");
        ChromeOptions opciones = new ChromeOptions();
        opciones.addArguments("--no-sandbox");
        opciones.addArguments("--disable-dev-shm-usage");
        opciones.addArguments("--headless");
        WebDriver driver = new ChromeDriver(opciones);
        driver.get("http://fernando9torres-dev.hps.es:8081/actualidad");
        //driver.get("http://httpbin.org/html");
        //WebElement element=new WebElement();
        String title = driver.getTitle();
        //WebElement element = driver.findElement(By.cssSelector("p"));
        System.out.print("El titulo de la pagina es: " + title);
        System.out.print("");
        driver.close();     
                             
        //System.out.print(driver.page_source.encode("utf-8"));
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
				
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Israel\\eclipse-workspace\\Prueba\\chromedriver.exe");
		/*System.setProperty("webdriver.chrome.driver","/home/israel/Descargas/chromedriver");
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
		driver.close();*/
		
    }
}
