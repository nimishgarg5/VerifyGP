package login.cucumber;

import com.helper.Initiallizer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Gplogin extends Initiallizer {


     WebDriver driver;
     Properties prop = new Properties();

    {
        try {
            InputStream input = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\VerifyGP\\src\\test\\Properties\\prop.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //WebdriverIitiallizer initiallizer;
    utilities obj = new utilities();

    @Given("^Open Chrome and start application$")
    public void openChromeAndStartApplication() {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //initiallizer = initiallizer.getInstance();
        driver= get().getDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //driver =  WebdriverIitiallizer.getDriver();
        driver.get("https://ems-qa-master.awsqa-gridpoint.com/login");
    }

    @Then("^verify the login page and verify$")
    public void verifyTheLoginPageAndVerify() {
        //String str="//*[@id=\"login\"]/div[3]/div[1]";
       // String etitle="Gridpoint Energy Manager: Login";
        //String tille= driver.getTitle();
        boolean b1 = obj.getWebElement(prop.getProperty("LoginPageLogo"),driver).isDisplayed();
        Assert.assertTrue(b1);
        boolean b2 = obj.getWebElement(prop.getProperty("username"),driver).isDisplayed();
        Assert.assertTrue(b2);
        //Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed());
       // Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div[2]/div/form/div[4]")).isEnabled());
    }

    @Then("^Enter username and click on next$")
    public void enterUsernameAndClickOnNext() {
        obj.getWebElement(prop.getProperty("username"),driver).sendKeys("demoTestRpUser");

        obj.getWebElement(prop.getProperty("NextButton"),driver).click();//*
    }

    @Then("^Enter Password and login$")
    public void enterPasswordAndLogin() throws InterruptedException {
        //Thread.sleep(4000);
        obj.getWebElement(prop.getProperty("Password"),driver).sendKeys("P@ssword1!");
        obj.getWebElement(prop.getProperty("LoginButton"),driver).click();
    }

    @Then("^verify the home page afer login successfully$")
    public void verifyTheHomePageAferLoginSuccessfully() throws InterruptedException {
       // Thread.sleep(4000);
        boolean b1 = obj.getWebElement(prop.getProperty("GPLogo"),driver).isDisplayed();
        Assert.assertTrue(b1);
        //Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"Sites\"]")).isSelected());
        boolean b2 = obj.getWebElement(prop.getProperty("AccountSetting"),driver).isDisplayed();
        Assert.assertTrue(b2);
    }

    @Given("^Logged in the application and on home page$")
    public void loggedInTheApplicationAndOnHomePage(){
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver= get().getDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        //driver=new ChromeDriver();
        //getTestBase().initializeGlobalVariables(false);
       // doInitialization();
        //driver =  WebdriverIitiallizer.getInstance().getDriver();
        //driver.findElement(By.id("Commissioning")).click();
        //Thread.sleep(4000);
        //driver.findElement(By.id("Commissioning")).submit();
    }

    @Then("^go to Confriguration tab and verify it check endpoint,site ,template is visible$")
    public void goToConfrigurationTabAndVerifyItCheckEndpointSiteTemplateIsVisible() throws InterruptedException {

       // driver.findElement(By.xpath("//*[@id=\"Commissioning\"]")).click();
        //Thread.sleep(4000);
        //driver.findElement(By.id("sitesSearchField")).sendKeys("TestRpSite");
       // driver.findElement(By.id("Commissioning")).click();
        //Assert.assertTrue(driver.findElement(By.id("endpointSearchField")).isDisplayed());
      //  Assert.assertTrue(driver.findElement(By.id("siteSearchField")).isDisplayed());
      //  Assert.assertTrue(driver.findElement(By.id("showTemplateButton")).isDisplayed());
        Thread.sleep(8000);
        obj.getWebElement(prop.getProperty("Configuration"),driver).click();
       // Thread.sleep(4000);
        boolean b1 = obj.getWebElement(prop.getProperty("EPSearchField"),driver).isDisplayed();
        Assert.assertTrue(b1);
        boolean b2 = obj.getWebElement(prop.getProperty("SiteSearchField"),driver).isDisplayed();
        Assert.assertTrue(b2);
        boolean b3 = obj.getWebElement(prop.getProperty("TemplateButton"),driver).isDisplayed();
        Assert.assertTrue(b3);

    }

    @Then("^enter site name and select endPoiny and click on enter button$")
    public void enterSiteNameAndSelectEndPoinyAndClickOnEnterButton() throws InterruptedException {

        obj.getWebElement(prop.getProperty("SiteSearchField"),driver).sendKeys("TestRpsite");
        //driver.findElement(By.xpath("//*[@id=\"siteSearchField\"]")).sendKeys("TestRpsite");
        //Thread.sleep(4000);
        //WebElement site = driver.findElement(By.xpath("//*[contains(text(),'TestRpSite')]"));
        obj.getWebElement(prop.getProperty("SelectSite"),driver).click();
        //Thread.sleep(3000);
        obj.getWebElement(prop.getProperty("SelectEP"),driver).click();
        obj.getWebElement(prop.getProperty("SelectButton"),driver).click();
        //driver.findElement(By.xpath("//*[contains(text(),'EC100')]")).click();
        //driver.findElement(By.xpath("//*[@id=\"selectButton\"]")).click();

    }

    @Then("^verify the page bu search endpoint-Id, Site-Id, configuration module,testing module$")
    public void verifyThePageBuSearchEndpointIdSiteIdConfigurationModuleTestingModule() throws InterruptedException {
        //Thread.sleep(4000);
       // driver.switchTo().alert().accept();

        Assert.assertTrue(driver.findElement(By.id("consoleEndpointLabel")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("changeEndpointBtn")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("consoleSiteLabel")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("configurationModel")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("testingModel")).isDisplayed());
    }

    @Then("^click on configuration module and click on use control config$")
    public void clickOnConfigurationModuleAndClickOnUseControlConfig() throws InterruptedException {

        obj.getWebElement(prop.getProperty("ConfrigurationModel"),driver).click();
       // driver.findElement(By.id("configurationModel")).click();
        //Thread.sleep(4000);
        obj.getWebElement(prop.getProperty("newButton"),driver).click();
        //driver.findElement(By.id("newButton")).click();
    }

    @Then("^Verify the Page by checking show XML,full view,smartview,General Tab is there$")
    public void verifyThePageByCheckingShowXMLFullViewSmartviewGeneralTabIsThere() throws InterruptedException {
        //Thread.sleep(4000);

        Assert.assertTrue(driver.findElement(By.id("showEndpointXmlButton")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("fullView")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("smartView")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"general\"]/div[1]")).isDisplayed());
    }
}
