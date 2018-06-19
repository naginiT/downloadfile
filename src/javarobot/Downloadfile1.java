package javarobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile1 {

	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		System.setProperty("webdriver.chrome.driver","F:\\Selenium_Harsha\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   /* driver.get("https://www.tutorialspoint.com/selenium/selenium_tutorial.pdf");
	    robot.setAutoDelay(1000);
	   */ //driver.findElement(By.id("icon")).click();
	    //robot.mouseMove(1230, 130);
	    driver.get("https://stackoverflow.com/questions/44591785/file-download-in-selenium-webdriver-using-robot-class");
	   // Thread.sleep(1000);
	  WebElement e=driver.findElement(By.xpath("/html/body/header/div/ol/li[6]/a[2]"));
	  System.out.println(e.getSize());
	    
	   /* robot.mouseMove(1230, 130);
	    Thread.sleep(2000);
	    robot.mouseMove(1247, 130);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.keyPress(KeyEvent.VK_ENTER);
	   */ 
	    
	    
	//robot.mousePress(buttons);    
	    
	    

	}

}
