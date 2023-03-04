package com.cybertek.utilities;

import java.io.FileInputStream;
import java.util.Properties;

// platformdan bağımsız olarak, bir ortamdan başka bir ortama veri akımını sağlayacak yeteneklere sahiptirler.

/**
 * reads the properties file configuration.properties
 */
public class ConfigurationReader {  //reponsibility of this class is finding configuration.properties  file inside my project and reading it and loading it what we have in configuration.properties

    private static Properties properties;       //Properties class extends HashMap class

    static {   //load the file first             // static blocks are automatically called as soon as class is loaded in memory

        System.out.println("sadfsd");
        try {
            // what file to read
            String filePath = "configuration.properties";                            // path of properties file as a string
            // read the file into java, finds the file using the string path
            FileInputStream input = new FileInputStream(filePath);
            // Properties --> class that store properties in key / value format
            properties = new Properties();

            // the values from the file input is loaded / fed in to the properties object
             properties.load(input);  //loading the properties class//input represents configuration.properties file

             input.close();  //Islem bittikten sonra object i kullanimdan aliyoruz ve Garbage collector kullanilmayan objectleri siliyor

        } catch (Exception e) {
                e.printStackTrace();

        }
    }

    public static String get(String keyName) {  // Why static method? --> you dont need to create abject to call the method , you can just call directly from the class
                                                // ConfigurationReader.get.. ornegin

        return properties.getProperty(keyName);   //key ler configuration.properties class inda esitligin solunda bulunananlar
    }
}

//the less you touch your test case, your framework is better

// Since the static block is always executed first, it doesn't matter in which order it's placed within the class.
// Typically, you would want to have the static block listed before constructors for readability,
// but Java technically does not care. However, Java will process the static block codes in order.

//class FileInputStream extends InputStream


/*
The Properties class represents a persistent set of properties. The Properties can be saved to a stream or loaded
 from a stream. Each key and its corresponding value in the property list is a string.
 */

/*
Properties is a subclass of Hashtable. It is used to maintain lists of values in which the key is a String and the value is also a String.
 */


/* Solda configuration.properties   file i var  -- bu dosya uzantisi hakkinda wikipedia bilgi

.properties is a file extension for files mainly used in Java-related technologies to store the configurable parameters
 of an application. They can also be used for storing strings for Internationalization and localization; these are known
  as Property Resource Bundles.

Each parameter is stored as a pair of strings, one storing the name of the parameter (called the key), and the other storing the value.
 */



/*   close() Closes this file input stream and releases any system resources associated with the stream
 yani Garbage collecter kullanimdan cikan objectleri siler , sadece kullanim zamanlarinda silmez
Releasing Resources In Java
Many objects hold references to system resources (files, memory, database locks, etc.) which need to be released in a
timely fashion when they are no longer needed.
 */

/* close() method unu anlamak icin bu yaziyyi oku
https://wiki.sei.cmu.edu/confluence/display/java/FIO04-J.+Release+resources+when+they+are+no+longer+needed

 */