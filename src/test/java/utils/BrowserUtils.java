package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class BrowserUtils {
    //click element with javascript

    public static void clickElement(WebDriver driver,WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //click dropdownLink
        js.executeScript("arguments[0].click()", element);



    }
    //scroll down
    public static void scrollToElement(WebDriver driver, WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);


    }
    // do screenshot
    public static void takeScreenshot(WebDriver driver){
        //taking screenshot
        File file =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //saving screenshot
        String location= System.getProperty("user.dir")+"/src/test/screenshots/";
        File directory=new File(location);
        if(!directory.exists()){
            directory.mkdir();

        }
        try{                                                             //timestamp
            FileUtils.copyFile(file, new File(location+System.currentTimeMillis()+"-janyl.png"));

        }catch (IOException ex){
            ex.printStackTrace();
        }


    }
}
