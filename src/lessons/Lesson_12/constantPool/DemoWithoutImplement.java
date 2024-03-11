package src.lessons.Lesson_12.constantPool;

public class DemoWithoutImplement {
    public static void main(String[] args) {
        DemoWithoutImplement demo = new DemoWithoutImplement();
        demo.printQaUrl();
        demo.printStagingUrl();

        // Create an anonymous class to use the Interface
        UrlSlug demoUrl = new UrlSlug() {
            @Override
            public String getUrl(String url) {
                return UrlSlug.super.getUrl(url);
            }
        };

        System.out.println(demoUrl.getUrl(demoUrl.QA_ENV));
        System.out.println(demoUrl.getUrl(demoUrl.STAGING_ENV));

    }

    public void printQaUrl() {
        System.out.println(UrlSlug.QA_ENV);
    }

    public void printStagingUrl() {
        System.out.println(UrlSlug.STAGING_ENV);
    }
}
