package src.lessons.Lesson_12.constantPool;

public interface UrlSlug {
    String QA_ENV ="qa.com";
    String STAGING_ENV = "staging.com";
    String BASE_URL = "basic-java/";

    default String getUrl( String url) {
        return BASE_URL.concat(url);
    }
}
