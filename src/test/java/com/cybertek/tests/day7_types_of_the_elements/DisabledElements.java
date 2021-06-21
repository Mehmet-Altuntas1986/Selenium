package com.cybertek.tests.day7_types_of_the_elements;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DisabledElements {
    @Test
    public void test1(){
    WebDriver driver = WebDriverFactory.getDriver( "chrome" );
    driver.manage().window().maximize();

    driver.get( "http://practice.cybertekschool.com/radio_buttons" );
        WebElement greenRadioBtn=driver.findElement( By.id("green") );  //green is not clicable button but no error

        //disabled bir button da 2 click olunca--> senaryo   1-not clicable button but no error
          //                                                 2- element is not interactable messaji ,code error



        //how to check any web element is enabled or not?
        System.out.println( "greenRadioBtn.isEnabled() = " + greenRadioBtn.isEnabled() );
        Assert.assertFalse( greenRadioBtn.isEnabled() ,"verify green radio button not enabled");
        greenRadioBtn.click();



    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.get( "http://practice.cybertekschool.com/dynamic_controls" );

        //locater of enable box
        WebElement inputBox=driver.findElement( By.cssSelector( "#input-example>input" ) );
        inputBox.sendKeys( "some message" );



    }
}