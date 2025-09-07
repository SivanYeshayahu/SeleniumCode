package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz3400");//wrong password
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage(); //call func from login page
        //when click the wrong password there a massage Epic sadface
        Assert.assertTrue(actualMessage.contains("Epic sadface"));//if this massge shows up than test pass
    }


}
