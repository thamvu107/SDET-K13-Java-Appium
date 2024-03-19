package src.lessons.lesson11.drivers;

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

     /*
      * Inheritance:
      *     +  Utility class: Group some similar functions that I want other classes to REUSE
      *     +  IS-A relationship: Model Design | Controller (IS-A something should have something
      *     +  Polymorphism: An object is able to transition between different forms in same family models
      * */
}
