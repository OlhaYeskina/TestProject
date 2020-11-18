package ua.com.sweetness;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Olha\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://sweetness.com.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }
}
