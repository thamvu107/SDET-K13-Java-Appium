package src.lessons.Lesson_12.constantPool.withoutInterface;

public class UrlSlug {
    public static String QA_ENV = "/qa-sdet";
    public static String STAGING_ENV = "/staging-sdet";
    public static String BASE_URL = "https://basic-learning.com";

    public static String getQaUrl() {
        return BASE_URL.concat(QA_ENV);
    }

    public static String getStagingUrl() {
        return BASE_URL.concat(STAGING_ENV);
    }
}
