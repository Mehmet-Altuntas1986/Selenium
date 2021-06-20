package com.cybertek.tests.day7_types_of_the_elements;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeTest {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver( "CHROME" );
        driver.manage().window().maximize();

        driver.get( "http://practice.cybertekschool.com/radio_buttons" );
        WebElement blueRadioBtn=driver.findElement( By.id("blue") );

        blueRadioBtn.getAttribute( "value" ); //getAttribute method is not only limited with the value , you can retrieve all the attribute value
                                               //blue radiobutton i inspect yap
         //get the value of type attribute
        System.out.println( blueRadioBtn.getAttribute( "type" ) );
        //get the value of name attribute

        System.out.println( blueRadioBtn.getAttribute( "name" ) );


        //get the value of checked attribute   -->true or false , this attribute has no value
        System.out.println( blueRadioBtn.getAttribute( "checked" ) );  //console da true yada false yazar

        //trying to get attribute that doesnt exist
        //when we use non exist attribute it will return null to us
        System.out.println( blueRadioBtn.getAttribute( "href" ) ); // it return false or something else in console -->null

        System.out.println( blueRadioBtn.getAttribute( "outerHTML" ) );//outerHTML IS NOT AN ATTRIBUTE
                  //CONSOLDA <input type="radio" id="blue" name="color" checked=""> YAZI BELIRIR

        driver.get( "http://practice.cybertekschool.com/multiple_buttons" );
        WebElement button2=driver.findElement( By.name( "button2" ) );


        System.out.println( button2.getAttribute( "outerHTML" ) );
        //  CONSOLDA--->   <button class="btn btn-primary" onclick="button2()" name="button2">Button 2</button>

        String outerHTML=button2.getAttribute( "outerHTML" );

        Assert.assertTrue( outerHTML.contains( "Button2" ));



        System.out.println( "innerHTML :" + button2.getAttribute( "innerHTML" ) );  //button 2
        driver.quit();

        /*wHEN WE Need to get text of the webelement
            1.getText();
            2.getarribute("value");
            2.getarribute("innerHTML");
            2.getaTribute("outerHTML");   */

//GET ATTRIBUTE RETURN TO String

    }

}
