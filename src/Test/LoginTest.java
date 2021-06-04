package test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(TestNGListnerExample.class)

public class LoginTest {
	WebDriver driver;

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LoginTest obj = new LoginTest();
//		obj.setUp();
//		obj.login();
//		obj.teardown();
////		System.setProperty("webdriver.chrome.driver", "chromedriver");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();        
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
//		driver.get("https://www.simplilearn.com/");
//		
//		  WebElement loginlink = driver.findElement(By.linkText("Log in"));         
//		  loginlink.click();                 
//		  WebElement username = driver.findElement(By.name("user_login"));         
//		  username.sendKeys("ahtesham6867@gmail.com");                          
//		  WebElement password = driver.findElement(By.name("user_pwd"));         
//		  password.sendKeys("umar19GA$");   
//	  WebElement chkBox = driver.findElement(By.className("rememberMe"));         
//		  chkBox.click();                  
//		  WebElement loginbutton = driver.findElement(By.name("btn_login"));         
//		  loginbutton.click();       
	//}
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();        
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("https://www.simplilearn.com/");
		
		
		
	}
	@Test
	@Parameters({"uname","pwd"})
	public void login(String uname, String pwd) {
		  WebElement loginlink = driver.findElement(By.linkText("Log in"));         
		  loginlink.click();                 
		  WebElement username = driver.findElement(By.name("user_login"));         
		  username.sendKeys(uname);                          
		  WebElement password = driver.findElement(By.name("user_pwd"));         
		  password.sendKeys(pwd);   
		  WebElement chkBox = driver.findElement(By.className("rememberMe"));         
		  chkBox.click();                  
		  WebElement loginbutton = driver.findElement(By.name("btn_login"));         
		  loginbutton.click();  
		  
		  //String errmsg = driver.findElement(by)

	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
