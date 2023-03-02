package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {
    //bunu githup dan bir arkadasim alip bilgisayarinda kullanabilir ,hata vermez
    @Test
    public void test1() {
        //We can make use of the System class to detect the OS
        System.out.println( System.getProperty( "os.name" ) );

        //Write project file path     ---->Eu3TestNgSelenium projesinin path i
        String projectPath = System.getProperty( "user.dir" );  //gives you your project location folder --> cunku butun bilgisayarlarda calismasini istiyorum
        System.out.println( "projectPath = " + projectPath );

        //Write the file path in your project
        String filePath = "src/test/resources/textfile.txt"; //click (under resources) textfile.txt --> copypath--> choose repository or content root ==>bu bir static path,
        System.out.println( "filePath = " + filePath );
        // bende calsir ama baskasinin bilgisayarinda is gormez


        //project path + any file path in project   ---> Dynamic --> can be used in all computers
        String fullPath = projectPath + "/" + filePath;
        System.out.println( "fullPath = " + fullPath );
    }

}

//https://www.youtube.com/watch?v=Uraakjx1TYM bu viodeoyu izle daha iyi anlamak icin
//in order continue ==>solda resorces-->copy path-->copy absolute path ===>/Users/mehmetaltuntas/Desktop/Eu3TestNGSelenium/src/test/resources/textfile.txt

//how can we get where my project located dynamicly?
