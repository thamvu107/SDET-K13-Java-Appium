package src.lessons.lesson_11.drivers;

public class DriverManager {
    public static void main(String[] args) {
        AppiumDriver androidDriver = getDriver("ANDROID");
        androidDriver.createSession();
        androidDriver.closeSession();

        AppiumDriver  iosDriver = getDriver("IOS");
        iosDriver.createSession();
        iosDriver.closeSession();
    }
     public static AppiumDriver getDriver(String targetPlatform) {
         // Something get from ev variable
         AppiumDriver appiumDriver = null;
         if(targetPlatform.equalsIgnoreCase("ios")){
             appiumDriver = new IOSDriver();
         } else if (targetPlatform.equalsIgnoreCase("android")) {
             appiumDriver = new AndroidDriver();
         }

         // Check null before returning => handle
         return  appiumDriver;
     }

     /**
      * Polymorphism: An object is able to transition between different forms in same family models
      * */
}
