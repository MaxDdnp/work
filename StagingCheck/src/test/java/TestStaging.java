import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;

import javax.validation.constraints.AssertFalse;
import java.util.concurrent.TimeUnit;

/**
 * @author Gaurang_Shah
 */
public class TestStaging {
    private WebDriver driver;
    private String urlImage = "http://qa01.lmstaging.me/test2.html?ak=b4cc298cc3";
    private String urlVideo = "http://qa01.lmstaging.me/test2.html?ak=f5b90b66ed";
    private String urlHtml = "http://qa01.lmstaging.me/test2.html?ak=b664917b29";
    private String urlLogin = "http://qa01.lmstaging.me/login";
    private String cannotLoginMessage = "\n" +
            "    We didn't recognize the username or password you entered. Please try again.\n" +
            "  ";


    @Before
    public void createNewDriver() throws Exception {
        driver = new FirefoxDriver();
    }

    @Test
    public void testImage() throws InterruptedException {
        driver.get(urlImage);
        driver.findElement(By.className("ri"));
    }


    @Test
    public void testVideo() throws InterruptedException {
        driver.get(urlVideo);
        driver.findElement(By.className("LM_video"));
    }

    @Test
    public void testHTML() throws InterruptedException {
        driver.get(urlHtml);
        driver.findElement(By.className("LM_html_container"));
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get(urlLogin);
        driver.findElement(By.id("email")).sendKeys("superadmin@l.me");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.className("btn")).click();
        Assert.assertFalse("cannot Login", driver.getPageSource().contains(cannotLoginMessage));

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}