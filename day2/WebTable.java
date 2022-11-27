package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //Get the column count
	List<WebElement> colm = driver.findElements(By.xpath("//table//tr//th"));
	System.out.println(colm.size());
	 //Get the row count
	List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
	System.out.println(row.size());
	
	}

}
