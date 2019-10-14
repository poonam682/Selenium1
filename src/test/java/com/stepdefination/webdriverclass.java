package com.stepdefination;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class webdriverclass {

    public static WebDriver driver;


    public void openbrowser() throws IOException {
        String browser = System.getProperty("browser");
        String environment = System.getProperty("environment");

        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        driver.manage().window().maximize();

        String filename = System.getProperty("user.dir")+ "\\src\\test\\java\\properties\\environment_%s.properties";
        String filenameFinal="";

        if(environment.equalsIgnoreCase("qa")){
            filenameFinal = String.format(filename,"qa");
        }
        else if (environment.equalsIgnoreCase("uat")){
            filenameFinal = String.format(filename,"uat");
        }
        File file = new File(filenameFinal);
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("URL"));

        driver.get(properties.getProperty("URL"));
    }

    public void closebrowser(){
         driver.quit();
    }

}
