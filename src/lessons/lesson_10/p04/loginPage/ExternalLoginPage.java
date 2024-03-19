package src.lessons.lesson_10.p04.loginPage;

public class ExternalLoginPage extends LoginPage{


    @Override
    public void inputUsername(String username) {
        System.out.println("External Username");
    }

    @Override
    public void inputPassword(String password) {
        System.out.println("External Password");
    }

    @Override
    public void clickOnLoginBtn() {
        System.out.println("External Clicked");
    }
}
