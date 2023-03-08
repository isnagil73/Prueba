package ejemplo;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class NewTest {
  @Test
  public void prueba() throws InterruptedException {
	  System.out.println("Inicio de la prueba");
	  WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","/home/israel/Descargas/chromedriver");
      //System.setProperty("webdriver.chrome.driver","C:\\Users\\Israel\\eclipse-workspace\\Prueba\\chromedriver.exe");
      ChromeOptions opciones = new ChromeOptions();
      opciones.addArguments("--no-sandbox");
      opciones.addArguments("--disable-dev-shm-usage");
      opciones.addArguments("--remote-allow-origins=*");
      opciones.addArguments("--headless");
      WebDriver driver = new ChromeDriver(opciones);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
      //String url = "http://www.google.es";
      String url = "http://fernando9torres-dev.hps.es:8081/login";
      //driver.get("http://fernando9torres-dev.hps.es:8081/actualidad");
      driver.get(url);
      System.out.println("Entrando en " + url);
      //WebElement element=new WebElement();
      //String title = driver.getTitle();
      WebElement element = driver.findElement(By.id("user"));
      element.sendKeys("hps_admin");
      System.out.println("Se ha introducido el usuario");
      WebElement element2 = driver.findElement(By.id("password"));
      element2.sendKeys("deltri");
      System.out.println("Contraseña introducida");
      driver.findElement(By.id("boton")).click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
      Thread.sleep(5000);
      String url2 = "http://fernando9torres-dev.hps.es:8081/admin";
      //String url2 = "http://www.google.es";
      Assert.assertEquals(url2, driver.getCurrentUrl());
      System.out.println("El titulo de la pagina es: " + driver.getCurrentUrl());
      driver.close();     
      System.out.println("Fin de la prueba");                     
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
