package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public void Setup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anushka\\Downloads\\Medal of Honor\\Traffic - updated with socks (Do not edit)\\Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Actions.Search(driver);
    }

}
