import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TestDriver {
    @Test
    public void test1(){
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");

        WebElement search_box = driver.findElement(By.id("ybar-sbq"));
        search_box.sendKeys("NPRU");

        WebElement btn_search = driver.findElement(By.id("ybar-search"));
        btn_search.click();

        driver.close();
    }
    @Test
    public void test2(){
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("kru");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
        String actual = driver.findElement(By.xpath("/html/body/div[3]/div/div[13]/div/div[2]/div[3]/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div")).getText();
        String expected = "มหาวิทยาลัยราชภัฏกาญจนบุรี";

        assertEquals(expected, actual);
        driver.close();
    }
    @Test
    public void calculateTest(){
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("5+5");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
        String actual = driver.findElement(By.id("cwos")).getText();

        String expected = "10";

        assertEquals(expected, actual);

        driver.close();
    }
}
