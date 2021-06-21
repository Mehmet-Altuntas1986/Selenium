package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void SwitchWindowsTest(){      //windowhandels: pencere kollari

        driver.get("http://practice.cybertekschool.com/windows");

        //get title
        System.out.println("Title before new window:"+driver.getTitle());  //practise

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("Title after new window:"+driver.getTitle());  //practice , cunku hala selenium ayni window a bakiyordu click ten sonra

        // System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle()); //i can get my current windowhandle with this method

        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles(); //this method will get all the windows open at that time handle , this set removes duplicate values,
                                                                   // only takes unique values nad it doesnt care index , order ,siralama yapmaz 1.button, 2. button diye
                                                               // getwindowshandles methodunda index kullanilamaz
//if i have two windows , how i will switch to other one?
        for (String handle : windowHandles) {

            if(!handle.equals(currentWindowHandle)){
                driver.switchTo().window(handle);
            }
        }

        System.out.println("Title after switch new window:"+driver.getTitle());

    }

    @Test
    public void moreThan2Window(){  //web sitesinin en ustunde acilan windows --pencereler
        driver.get("http://practice.cybertekschool.com/windows");

        driver.findElement(By.linkText("Click Here")).click(); //if there is a link , it is easy to use linkText locater

        System.out.println("Before Switch:"+driver.getTitle());

        Set<String> windowHandles = driver.getWindowHandles();

//Whenever your windows title equels to title that you are looking for, loop stops
        //loop through each window
        for (String handle : windowHandles) {
            //one by one change it
            driver.switchTo().window(handle);

            //whenever your title equals to your expected window title
            if(driver.getTitle().equals("New Window")){
                //stop on that window
                break;
            }

        }

        System.out.println("After Switch: "+driver.getTitle());

    }




}