package src.lessons.Lesson12.constantPool.implementInterface;

public class EnvImplementInterface implements IUrlSlug {
    public static void main(String[] args) {
        // Environment Variables
        System.out.println(QA_ENV);
        System.out.println(STAGING_ENV);

        EnvImplementInterface env = new EnvImplementInterface();
        System.out.println(env.getUrl("QA"));
    }
}
