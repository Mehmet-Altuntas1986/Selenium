package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) {
//we have to enter this line every time we want to open chrome
// hey webdrivermanager, can you make chrome ready for for automation
        WebDriverManager.chromedriver().setup();


        //web driver represents the browser
        //we are creating driver for chrome browser
        //new chromeDriver()-->this part will open chrome browser
        WebDriver driver = new ChromeDriver();  //safari ,Firefox driver da diyebilirim , eger bilgisayarimizda yuklu ise calisirlar


        //.get method used for navigation to page
        driver.get("https://cybertekschool.com");
    }
}