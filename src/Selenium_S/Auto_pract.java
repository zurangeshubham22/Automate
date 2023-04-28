package Selenium_S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_pract {

	public static void main(String[] args)
	{
	 
	 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url=("https://amazon.com/");
	 driver.get(url);
	 driver.findElement(By.xpath("//span[text()='All']//following::i[2]")).click();
	}

}
