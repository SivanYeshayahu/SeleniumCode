package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginShouldFailTest {
    WebDriver driver; /*interface*/
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver(); /* open chrome */
        driver.manage().window().maximize(); /* max size of the  page */
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// link to the website
    }
    @BeforeClass   /* clean up our test  */
    public void tearDown(){ /* close our browser */
        //driver.quit(); /*close every window*/
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException{
        Thread.sleep(2000); /*2 sec */
        WebElement username = driver.findElement(By.name("username")); /* name="username"  */
        username.sendKeys("Admin"); /* Admin is the username  */

        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123"); /* Admin123 is the password*/

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.tagName("h6")).getText(); //looking for h6 tag
        String expectedResult = "Dashboard"; // just one with string dashboard
        Assert.assertNotEquals(actualResult, expectedResult); //fail test - check IF both strings NOT equal to fail


    }
}
