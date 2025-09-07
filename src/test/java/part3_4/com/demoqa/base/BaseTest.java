package part3_4.com.demoqa.base;

import com.saucedemo.pages.BasePage;
import demoqa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest { //we going to use in all our tests
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL= "http://demoqa.com/"; //url of website im testing


   @BeforeClass
    public void setUp(){ //before every class
       driver = new ChromeDriver(); //create chrome object
       driver.manage().window().maximize();//size of screen to max size
   }
    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL); //open the url of the website
        basePage = new BasePage(); //create object
        basePage.setDriver(driver); //set diver to BasePage class to use methods
        homePage = new HomePage(); //create object
    }
    @AfterClass
    public void tearDown(){
       driver.quit();
    }




}
