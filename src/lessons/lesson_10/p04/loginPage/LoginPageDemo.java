package src.lessons.lesson_10.p04.loginPage;

public class LoginPageDemo {
    public static void main(String[] args) {
        InternalLoginPage internalLoginPage = new InternalLoginPage();
        ExternalLoginPage externalLoginPage  = new ExternalLoginPage();
        LoginFlow loginFlow = new LoginFlow("ti ", "password");

        loginFlow.loginPageWithCreds(internalLoginPage);
        loginFlow.loginPageWithCreds(externalLoginPage);

    }
}
