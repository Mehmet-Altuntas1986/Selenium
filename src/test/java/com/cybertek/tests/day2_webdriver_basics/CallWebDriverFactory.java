package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {  //WebDriverFactory adinda onceden bir class acmistik, onu cagiracagiz

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver( "firefox" );  //google da koyabiliriz
        driver.get("http://www.google.com");
        String title=driver.getTitle();
        System.out.println( "title = " + title );  //soutv + enter  short cut

    }
}
