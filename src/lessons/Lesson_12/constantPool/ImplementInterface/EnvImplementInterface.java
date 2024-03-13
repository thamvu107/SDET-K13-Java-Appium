package src.lessons.Lesson_12.constantPool.ImplementInterface;

import src.lessons.Lesson_12.constantPool.WithoutImplementInterface.UrlSlug;

public class EnvImplementInterface implements IUrlSlug {
    public static void main(String[] args) {
        // Environment Variables
        System.out.println(QA_ENV);
        System.out.println(STAGING_ENV);

        EnvImplementInterface env = new EnvImplementInterface();
        System.out.println(env.getUrl("QA"));
    }
}
