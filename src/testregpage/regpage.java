package testregpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class regpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://qavbox.github.io/demo/signup/");
		
		WebElement fullname = driver.findElement(By.name("uname"));
		fullname.sendKeys("Jewel Tess");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("123@gmail.com");
		
		WebElement telephone = driver.findElement(By.id("tel"));
		telephone.sendKeys("8976546789");
		
		//WebElement faxno = driver.findElement(By.id("fax"));
		//faxno.sendKeys("8976546789");
		
		WebElement fileInput = driver.findElement(By.name("datafile"));
        String imagePath = "C:\\Users\\jewel\\Downloads\\walles\\9159.jpg";
        fileInput.sendKeys(imagePath);
        
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"container\"]/div[7]/select"));
        gender.sendKeys("Male");
       
        WebElement radioButton = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[8]/input[2]"));
        radioButton.click();
        
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ip\"]"));
        checkbox.click();
        
        driver.findElement(By.xpath("/html/body/form/fieldset/div/div/select/option[1]")).click();
     
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitButton.click();
	}

}
