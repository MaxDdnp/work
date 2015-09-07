import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.yecht.Data;

import javax.validation.constraints.AssertFalse;
import java.util.concurrent.TimeUnit;

/**
 * @author Gaurang_Shah
 */
public class TestStaging {
    private WebDriver driver;
    private String urlImage = "http://qa01.lmstaging.me/test2.html?ak=56fabfc17f";
    private String urlVideo = "http://qa01.lmstaging.me/test2.html?ak=b510d5bcda";
    private String urlHtml = "http://qa01.lmstaging.me/test2.html?ak=4a6f7f93d1";
    private String urlLogin = "http://qa01.lmstaging.me/login";
    private String cannotLoginMessage = "\n" +
            "    We didn't recognize the username or password you entered. Please try again.\n" +
            "  ";
    private String approveButton = "\n" +
            "      Approve as\n" +
            "      ";
    private String expirationDate = "2016-06-22";



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
        driver.findElement(By.id("background-image"));
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get(urlLogin);
        driver.findElement(By.id("email")).sendKeys("superadmin@l.me");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.className("btn")).click();
        Assert.assertFalse("cannot Login", driver.getPageSource().contains(cannotLoginMessage));

    }

    @Test
    public void testFullCreatingCampaign() throws InterruptedException {
        driver.get(urlLogin);
        driver.findElement(By.id("email")).sendKeys("superadmin@l.me");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.className("btn")).click();
        driver.findElement(By.linkText("publisher@l.me")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Assert.assertTrue("Element is not present on page", driver.findElement(By.cssSelector("html/body/div[2]/div/div/div/ul/li[2]/a")).isDisplayed());
        //apps and sites
        driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[2]/a")).click();
        Thread.sleep(100);
        driver.findElement(By.linkText("Add App or Site")).click();
        Assert.assertTrue("There is no app creation", driver.findElement(By.xpath(".//*[@id='new_app']/fieldset[1]/legend")).isDisplayed());
        driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[5]/a")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("html/body/div[2]/div/div/div/ul/li[5]/ul/li[3]/a")).click();

//        Thread.sleep(100);
//        driver.findElement(By.id("app_platform_id_chzn_o_1")).click();
//        String nameOfApp = "TestAppForCheking" + LocalDate.now() + (int)(Math.random()*100);
//        driver.findElement(By.id("app_name")).sendKeys(nameOfApp);
//        //category
//        driver.findElement(By.linkText("Select an Option")).click();
//        driver.findElement(By.id("app_app_category_id_chzn_o_1")).click();
//        //mediation network
//        driver.findElement(By.linkText("Select an Option")).click();
//        driver.findElement(By.id("app_ad_network_chzn_o_1")).click();
//        //choosing phone fullscreen
//        driver.findElement(By.xpath(".//*[@id='new_app']/fieldset[1]/div[9]/div/div/label[1]")).click();
//        driver.findElement(By.linkText("Select an Option")).click();
//        driver.findElement(By.id("app_orientation_chzn_o_3")).click();
//        //exclude from ron
//        driver.findElement(By.id("app_is_excluded_from_ron")).click();
//
//        driver.findElement(By.xpath(".//*[@id='new_app']/div[2]/input")).click();
//        driver.findElement(By.linkText("Log out")).click();
//
//        driver.findElement(By.xpath("html/body/div[1]/div/div/div/ul/li[3]/a")).click();
//        driver.findElement(By.id("search_is_test")).click();
//        driver.findElement(By.id("search_name")).sendKeys(nameOfApp);
//        driver.findElement(By.name("commit")).click();
//        driver.findElement(By.linkText(nameOfApp)).click();
//
//
//        driver.findElement(By.xpath("//*[@id='main']/div[3]/a")).click();
//        driver.findElement(By.xpath("//*[@id='main']/div[3]/ul/li[2]/a")).click();

        //Login to adv account*/
        driver.findElement(By.linkText("advertiser@l.me")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        driver.findElement(By.linkText("Users")).click();
//        driver.findElement(By.linkText("advertiser@l.me")).click();
//        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.linkText("Campaigns")).click();
        Thread.sleep(100);
        //creating camp
        driver.findElement(By.linkText("Create Campaign")).click();

        Assert.assertTrue("There is no camp creation", driver.findElement(By.xpath(".//*[@id='new_campaign']/fieldset/legend")).isDisplayed());

        //choose adv
//        driver.findElement(By.xpath("//*[@id='campaign_advertiser_id_chzn']/a/span")).click();
//        driver.findElement(By.id("campaign_advertiser_id_chzn_o_1")).click();
//        //choose brand
//        driver.findElement(By.xpath(".//*[@id='campaign_brand_vertical_id_chzn']/a/span")).click();
//        driver.findElement(By.id("campaign_brand_vertical_id_chzn_o_1")).click();
//        //iab categories
//        driver.findElement(By.xpath("//*[@id='campaign_iab_categories_chzn']/ul/li/input")).click();
//        driver.findElement(By.id("campaign_iab_categories_chzn_o_0")).click();
//        //max budget
//        driver.findElement(By.id("campaign_max_budget")).sendKeys("10");
//        //submit
//        driver.findElement(By.xpath("//*[@id='new_campaign']/div[2]/input")).click();
//        //adding line item
//         /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  */
//              /* driver.get("http://qa01.lmstaging.me/campaigns/74");*/
//        driver.findElement(By.linkText("Add Line Item")).click();
//        driver.findElement(By.id("finishes_at_date")).sendKeys(expirationDate);
//        //add app
//        driver.findElement(By.xpath("//*[@id='line_item_platform_ids_chzn']/ul/li/input")).click();
//        driver.findElement(By.id("line_item_platform_ids_chzn_o_0")).click();
//        //selected apps
//        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='media-flexible-attributes']/div/select")));
//        dropdown.selectByValue("app_ids");
//
//        //type our app TestAppForCheking2015-06-22
//        driver.findElement(By.xpath(".//*[@id='line_item_app_ids_chzn']/ul/li/input")).click();
//        driver.findElement(By.xpath("//*[@id='line_item_app_ids_chzn']/ul")).sendKeys(nameOfApp);
////        driver.findElement(By.xpath(".//*[@id='line_item_app_ids_chzn']/ul/li/input")).sendKeys("TestAppFor");
//        driver.findElement(By.xpath("//*[@id='line_item_app_ids_chzn']/ul/li/input")).sendKeys(Keys.RETURN);
//        driver.findElement(By.xpath("//*[@id='new_line_item']/div[2]/input")).click();
//        driver.switchTo().alert().accept();
//
//        //add creative
//        /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        driver.get("http://qa01.lmstaging.me/campaigns/74/line_items/77");*/
//        Assert.assertTrue("There is no add creative button", driver.findElement(By.linkText("Add Creative")).isDisplayed());
//        driver.findElement(By.linkText("Add Creative")).click();
//
//        driver.findElement(By.xpath("//*[@id='ad-format-fields']/div[1]/div/div/label[2]")).click();
//
//        //click cpi
//        driver.findElement(By.xpath("//*[@id='image_creative_ad_format_attributes_delivery_price']")).click();
//        //price
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(By.xpath("//*[@id='image_creative_ad_format_attributes_delivery_price']"));
//        for (int i = 0; i < 4; i++){
//        action.sendKeys(element,Keys.BACK_SPACE).perform();
//        }
//        driver.findElement(By.xpath("//*[@id='image_creative_ad_format_attributes_delivery_price']")).sendKeys("0.01");
//        //select image
//        WebElement fileInput = driver.findElement(By.id("image_creative_image"));
//        fileInput.sendKeys("D:\\Maxim_LoopMe\\38255793.jpg");
//        //click url
//        driver.findElement(By.xpath("//*[@id='image_creative_click_url']")).sendKeys("http://google.com");
//        driver.findElement(By.xpath("//*[@id='new_image_creative']/div[2]/input")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(".//*[@id='main']/legend/div/a[5]")).click();
    }


    @After
    public void tearDown() throws Exception {
        driver.close();

        try
        {
            Thread.sleep(5000);
            driver.quit();
        }
        catch(Exception e)
        {
        }
    }
}
