package com.saucedemo.pages;
import org.openqa.selenium.By; //להשתמש בקלאס By שמגיע מתוך ספריית Selenium.

public class LoginPage extends BasePage{  //יורש
    //login fields  //שדות פרטים כי מחלקות אחרות לא צרכים גישה אליהם
    private By usernameField = By.id("user-name"); //  ראינו שימוש עם id
    private By passwordField = By.id("password");;
    private By loginButton = By.id ("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");



    public void setUsername(String username) {
        set(usernameField,username); //By and string
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public ProductsPage clickLoginButton(){  //transition method can have an error in password or correct pass and go to next page
        click(loginButton); //calling click from base page
        return new ProductsPage(); //new page
    }

    public ProductsPage logIntoApplication(String username, String password){ //login
       setUsername(username); //calling the func
       setPassword(password);
       return clickLoginButton(); //
    }
    public String getErrorMessage(){  //when error in login
        return find(errorMessage).getText(); //get text return string so this func is string
    }






}

