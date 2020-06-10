package pepinazo;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class StepDefinitionTodoist {

    public WebDriver driver;

   public static WebDriverWait wait;
    @Before
    public void setUpTest() throws MalformedURLException {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait= new WebDriverWait(driver,15);

    }

    @After
    public void tearDownTest() {
        driver.quit();
    }


    @Given("I navigate to {word}")
    public void iNavigateToTodoist(String url) {
        driver.navigate().to(url);
        System.out.println("ok navegación");
    }



    @When("I log into todoist with valid credentials")
    public void iLogIntoTaoistWithVailCredentials()
    {
        //WebElement logoImg = driver.findElement(By.cssSelector("[mask*='#logo-wordmark']"));
        WebElement linkLogin = driver.findElement(By.linkText("Inicia sesión"));
       // wait.until(ExpectedConditions.visibilityOf(logoImg));
        wait.until(ExpectedConditions.visibilityOf(linkLogin));

        linkLogin.click();




    }
    @And("I enter {word} and {word}")
    public void ingresoUserAndPassword(String user, String password) {
        WebElement emailTxt = driver.findElement(By.id("email"));
        emailTxt.sendKeys(user);
        WebElement passwordTxt= driver.findElement(By.id("password"));
        passwordTxt.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.cssSelector(".submit_btn"));
        loginBtn.click();
    }

    @Then("I should see the home page")
    public void iShouldSeeTheHomePage(){
        //instrucciones de selenium

        WebElement homeIcon =driver.findElement(By.cssSelector(".left_control > button:last-of-type"));
        WebElement searchBox = driver.findElement(By.cssSelector(".quick_find__input"));
        WebElement upcomingLink = driver.findElement(By.id("filter_upcoming"));


        wait.until(ExpectedConditions.visibilityOf(homeIcon));
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        wait.until(ExpectedConditions.visibilityOf(upcomingLink));


        System.out.println("ok validación pag");
    }

    @And("The list of projects will be visible")
    public void theListOfProjectWillBeVisable(){
        //instrucciones de selenium
        WebElement projectLink = driver.findElement(By.cssSelector("[data-track='navigation|projects_panel']"));
        wait.until(ExpectedConditions.visibilityOf(projectLink));


        System.out.println("ok lista proyectos");
    }

    @When("I log into todoist with facebook account {word} and {word}")
    public void iLogIntoTodoistWithFacebookAccountFacebookUserAndFacebookPass( String facebookUser, String facebookPass) {
    }






}