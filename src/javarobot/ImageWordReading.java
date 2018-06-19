package javarobot;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;


public class ImageWordReading 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium_Harsha\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://cubicitsolution.co.in/");
		
	     List<WebElement> images=driver.findElements(By.xpath("//div[@class='sb-description']/h3"));
	     int a=images.size();
	     System.out.println("count of images" +a);
	     for(int i=0;i<a;i++)
	     {
	     	WebElement ele=images.get(i);
	     	String s=ele.getAttribute("outerText");
	     	System.out.println(s);
		
	     	/*Screen s1 = new Screen();WebElement e = driver.findElement(By.xpath("//*[@id=\"sb-slider\"]/li[1]/a/img"));
		//WebElement e = driver.findElement(By.xpath("//*[@id=\"sb-slider\"]/li[1]/div/h3"));
		System.out.println(e.getText());
		Thread.sleep(2000);
		WebElement nxtimg = driver.findElement(By.xpath("//*[@id=\"nav-arrows\"]/a[1]"));
		nxtimg.click();
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"sb-slider\"]/li[2]/div/h3"));
		System.out.println(e1.getText());*/
}
	}
}
