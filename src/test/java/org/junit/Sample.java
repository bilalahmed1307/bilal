package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriverCommandExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Sample {
static WebDriver driver;
@BeforeClass
public static void beforeClass() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
}
@AfterClass
public static void afterClass() {
driver.quit();
}
@Before
public void before() {
	Date d = new Date();
	System.out.println(d);
}
@After
public void after() {
	Date d = new Date();
	System.out.println(d);
}
@Test
public void test1() {
driver.findElement(By.id("email")).sendKeys("bilal");
driver.findElement(By.name("pass")).sendKeys("bilal123");
driver.findElement(By.name("login")).click();
}
}
