# 🖥️ Selenium Automation Testing Project

## 🔹 Description

Automated web testing using **Selenium WebDriver**, **TestNG**, and **Java**.  
Follows the **Page Object Model (POM)** pattern for organized, maintainable, and reusable tests.

Tested websites:

-   **OrangeHRM** – basic login tests (Part 1)
    
-   **SauceDemo** – login and products page tests using POM (Part 2)
    
-   **DemoQA** – home page tests using POM (Part 3–4)
    

----------

## 📁 Project Structure

### **Pages (POM)**

-   **BasePage** – parent class with common WebDriver methods (`find()`, `set()`, `click()`)
    
-   **LoginPage** – login actions and error handling
    
-   **ProductsPage** – verifies Products page elements
    
-   **HomePage** – interacts with DemoQA homepage
    

### **Part 1 – OrangeHRM**

-   **FirstSeleniumTest** – positive login test
    
-   **LoginShouldFailTest** – negative login test
    

### **Part 2 – SauceDemo**

-   **BaseTest** – initializes WebDriver and page objects
    
-   **LoginTests** – negative login test, checks error message `"Epic sadface"`
    
-   **ProductsTest** – positive login test, verifies Products header
    

### **Part 3–4 – DemoQA**

-   **BaseTest** – initializes WebDriver, loads site before each test
    
-   Tests interact with **HomePage**, demonstrating reusable POM structure
    
    
----------

## ⚙️ Technologies

-   Java
    
-   Selenium WebDriver
    
-   TestNG
    
-   IntelliJ IDEA
    

----------

## 🧠 Key Concepts

-   **Page Object Model (POM)** – separates page actions from tests
    
-   **Positive & Negative Testing** – verifying success and failure scenarios
    
-   **Reusable Test Structure** – BasePage/BaseTest for all pages
    
-   **Automated Web Testing** – across multiple websites
