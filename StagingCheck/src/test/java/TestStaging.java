import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;

/**
 * @author Gaurang_Shah
 */
public class TestStaging {
    private WebDriver driver;
    private String urlImage = "http://qa01.lmstaging.me/test2.html?ak=b4cc298cc3";
    private String urlVideo = "http://qa01.lmstaging.me/test2.html?ak=f5b90b66ed";
    private String urlHtml = "http://qa01.lmstaging.me/test2.html?ak=b664917b29";

    @Test
    public void testImage() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get(urlImage);
         driver.findElement(By.className("ri"));
        driver.quit();
    }

    @Test
    public void testVideo() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get(urlVideo);
        driver.findElement(By.className("LM_video"));
        driver.quit();
    }

    @Test
    public void testHTML() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get(urlHtml);
        driver.findElement(By.className("LM_html_container"));
        driver.quit();
    }
}