package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReport extends TestBase { //in the class level if i run , i can see reports from all test cases at the same time in the test-output--report.html file inda
    @Test
    public void wrongPasswordTest() throws InterruptedException {
//name the test
        extentTestLogger=report.createTest( "Wrong Password Test" );

       LoginPage loginPage = new LoginPage();       //bu bir test case step degil, buyuzden extentLogger kullanmadim


        extentTestLogger.info( "Enter Username:user1" );
        loginPage.usernameInput.sendKeys("user1");  //driver.findElement(By.id("PrependInput")).sendKeys("user1");


        extentTestLogger.info( "Enter Password:somepassword" );
        loginPage.passwordInput.sendKeys("somepassword"); //driver.findElement(By.id("PrependInput2")).sendKeys("somepassword");



        extentTestLogger.info( "Click Login Button" );//driver.findElement(By.id("_submit")).click();
        loginPage.loginBtn.click();


//if everything goes well , assertion passes
        extentTestLogger.info( "Verify Page URL" );
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login"); //if this fails , it doesnt pass next line and we dont see that test is passed
        extentTestLogger.pass( "Wrong Password Test is passed");

    }
    //ogretmen dk 27 de configuration.properties deki degerleri degistirdi ve dediki ayni verileri girin
    @Test
    public void wrongUsernameTest(){
//name of the test
        extentTestLogger=report.createTest( "Wrong Username Test" );

        LoginPage loginPage = new LoginPage();


        extentTestLogger.info( "Enter Username:someusername" );
        loginPage.usernameInput.sendKeys("someusername");


        extentTestLogger.info( "Enter Password:UserUser123" );
        loginPage.passwordInput.sendKeys("UserUser123");

        extentTestLogger.info( "Click Login Button" );
        loginPage.loginBtn.click();


        extentTestLogger.info( "Verify pAGE url" );
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");  //bilerek burda hata olusturduk url de SONRA DUZELLTIK DAY 15 TE
        extentTestLogger.pass( "PASSED" );

    }
}
//Bu class i iyi anlamak icin ExtendDemoTest i iyi incele
//this reports are for non technical people

//sol tarafta test output dosyasi--> report.html e sag tikla-->reveal in finder---> report.html tikla ve bir browser sec  -->siralama  (open in finder i kullanma dedi ama bende reveal in finder yok)
// onemli screenshot ve report u dogru gormek icn  -->bu siralamayla yapmazsak screenshot i gorememe durumu olabilir
// screenshot almasi icin bazi test case leri fail etti