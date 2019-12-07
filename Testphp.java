
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Testphp
{


public static void main(String[] args) throws IOException,InterruptedException
{

WebDriver d = new HtmlUnitDriver();
d.get("http://localhost/");
String expectedTitle = ("Home | Simple PHP Website");
String actualTitle = d.getTitle();
Assert.assertEquals(actualTitle,expectedTitle);
d.findElement(By.linkText("About Us")).click();
if(d.getPageSource().contains("Lorem Ipsum"))
System.out.println("Pass");
else
System.out.println("Fail");
d.quit();
}
}

