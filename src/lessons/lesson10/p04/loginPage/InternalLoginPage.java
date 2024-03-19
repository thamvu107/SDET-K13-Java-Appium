package src.lessons.lesson10.p04.loginPage;

public class InternalLoginPage extends  LoginPage{

    @Override
    public void inputUsername(String username) {
        System.out.println("Internal username");
    }

    @Override
    public void inputPassword(String password) {
        System.out.println("Internal password");

    }

    @Override
    public void clickOnLoginBtn() {
        System.out.println("Internal Clicked");
    }
}
