package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Actions {

    public static void Search(WebDriver chrome)
    {
        WebElement searchbox = chrome.findElement(By.name("q"));
        searchbox.click();
        searchbox.sendKeys("Anushka");
        WebElement searchButton = chrome.findElement(By.className("gNO89b"));
        searchButton.click();

        

    }

}
