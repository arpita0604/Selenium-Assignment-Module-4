package LocatorsAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\uddip\\eclipse-workspace\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
     
        driver.get("https://www.rediff.com/");
        /*WebElement enterpriseMail = driver.findElement(By.linkText("Enterprise Email"));
        enterpriseMail.click();
        System.out.println("Title of the page"+ driver.getTitle());
        driver.quit();
        
       WebElement videos = driver.findElement(By.partialLinkText("Business "));
        videos.click();
        System.out.println("Title of the page"+ driver.getTitle());
        driver.quit();
        */
        
        
        WebElement signLink = driver.findElement(By.xpath("//a[@class='signin']"));
        signLink.click();
        System.out.println("Title of the page is "+ driver.getTitle());
        driver.quit();
        
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        
        for(WebElement link:allLinks)
        {
        	System.out.println(link.getText()+ "-"+link.getAttribute("href"));
        }
        driver.quit();
	}

}
