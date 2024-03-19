package src.lessons.Lesson12.constantPool.implementInterface;

public interface IUrlSlug {
    String QA_ENV = "/qa-sdet";
    String STAGING_ENV = "/staging-sdet";
    String BASE_URL = "https://basic-learning.com";

    default String getUrl(String env) {
        String url = "";
        switch (env.toUpperCase()) {
            case "QA":
                url = BASE_URL.concat(QA_ENV);
                break;
            case "STAGING":
                url = BASE_URL.concat(STAGING_ENV);
                break;
        }

        return url;
    }


    static void sayStaticMethod() {
        System.out.println(" a static method can be invoked within other static and default methods.");
    }
}
