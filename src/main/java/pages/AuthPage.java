package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class AuthPage extends BasePage {

    public AuthPage Login() {
        findByXpath("//input[@name='sign']", Duration.ofSeconds(10)).sendKeys("Test42");
        return this;
    }

    public AuthPage Password() {
        findByXpath("//input[@name='password']", Duration.ofSeconds(10)).sendKeys("Test42");
        return this;
    }

    public AuthPage Sign_in() {
        findByXpath("//button[@type='submit']", Duration.ofSeconds(10)).click();
        return this;
    }

    public AuthPage Favourites() {
        findByXpath("//button[@class='e13r0v7w0 css-129ypkb e157qrb60']", Duration.ofSeconds(10)).click();
        return this;
    }

    public AuthPage pageFavourites() {
        findByXpath("//a[@href='https://auto.drom.ru/all/?my_favorites']", Duration.ofSeconds(10)).click();
        return this;
    }



}