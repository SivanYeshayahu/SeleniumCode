
package part2.com.saucedemo.base;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "http://www.saucedemo.com";// website we testing

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver(); //can be edge firefox safari choce  chrome
        driver.manage().window().maximize();
        driver.get(url); //loding the app
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
    }

    @AfterClass //to close the browser
    public void tearDown(){
        driver.quit();
    }



}