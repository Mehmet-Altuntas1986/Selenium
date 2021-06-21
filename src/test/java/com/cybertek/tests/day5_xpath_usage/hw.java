package com.cybertek.tests.day5_xpath_usage;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hw {
    /*task_homework
      1- go to amozon.com
      2-search for selenium
      3- click search button
      4- verify 1-48 of 304 results for "selenium"
       */
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver( "chrome" );
        driver.get( "https://www.amazon.com/" );

        WebElement  searchBox= driver.findElement( By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys( "Selenium" );
//Click search button
        driver.findElement( By.xpath( "//input[@value='Go']" ) ).click();

        WebElement result=driver.findElement( By.xpath( "//span[contains(text(),'results for')]" ) );
        String resultText=result.getText();

        System.out.println( "resultText = " + resultText );
    }
}