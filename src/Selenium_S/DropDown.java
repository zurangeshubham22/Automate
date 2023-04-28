package Selenium_S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url=("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.get(Url);
		Select drop=new Select(driver.findElement(By.xpath("//select")));
		drop.selectByIndex(2);

	}

}
