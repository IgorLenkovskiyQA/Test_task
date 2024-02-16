package ui_tests;

import org.testng.annotations.Test;
import pages.AuthPage;

public class AuthTest extends BaseTest {

    @Test(description = "Авторизация пользователя")
    public void checkAuthorisation() {

        new AuthPage().goToStartPage()
                .clickAuth()
                .Login()
                .Password()
                .Sign_in()
                .Favourites()
                .pageFavourites();
    }
}
