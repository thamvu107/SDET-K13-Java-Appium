package src.lessons.lesson_10.P04_LoginPage;

public class LoginPageDemo {
    public static void main(String[] args) {
        InternalLoginPage internalLoginPage = new InternalLoginPage();
        ExternalLoginPage externalLoginPage  = new ExternalLoginPage();
        LoginFlow loginFlow = new LoginFlow("ti ", "password");

        loginFlow.loginPageWithCreds(internalLoginPage);
        loginFlow.loginPageWithCreds(externalLoginPage);

    }
}
