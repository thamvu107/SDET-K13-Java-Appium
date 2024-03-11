package src.lessons.Lesson_12.constantPool;

public class DemoImplement implements UrlSlug{
    public static void main(String[] args) {
        DemoImplement demo = new DemoImplement();
        demo.printQaUrl();
        demo.printStagingUrl();

        System.out.println(demo.getUrl(QA_ENV));
        System.out.println(demo.getUrl(STAGING_ENV));
    }

    public void printQaUrl(){
        System.out.println(QA_ENV);
    }

    public void printStagingUrl(){
        System.out.println(STAGING_ENV);
    }
}
