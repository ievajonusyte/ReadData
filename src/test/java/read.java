import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;


//READ ITEM NAME FROM FILE AND SEARCH FOR IT
public class read {
    public static WebDriver driver = new ChromeDriver();

    @Test
    public void testas() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.delfi.lt/");
        driver.findElement(By.xpath("//a[contains(text(),'Paieška')]")).click();
        driver.findElement(By.cssSelector("#gsc-i-id1")).sendKeys(item.get(1),Keys.ENTER);
        driver.quit();
    }
}
