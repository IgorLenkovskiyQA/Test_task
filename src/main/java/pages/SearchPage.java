package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;

public class SearchPage extends BasePage {
    public SearchPage selectionMark1_1() {
        findByXpath("//input[@placeholder='Марка']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionMark1_2() {
        findByXpath("//input[@placeholder='Марка']", Duration.ofSeconds(10)).sendKeys("Toyota");
        return this;
    }

    public SearchPage selectionMark1_3() {
        findByXpath("//div[@class='css-1o2xogk e1x0dvi10']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionModel2_1() {
        findByXpath("//input[@placeholder='Модель']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionModel2_2() {
        findByXpath("//input[@placeholder='Модель']", Duration.ofSeconds(10)).sendKeys("Harrier");
        return this;
    }

    public SearchPage selectionModel2_3() {
        findByXpath("//div[@class='css-1o2xogk e1x0dvi10']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionFuel3_1() {
        findByXpath("//div[@aria-label='Топливо']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionFuel3_2() {
        findByXpath("//div[text()='Гибрид']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionUnsold4() {
        findByXpath("//label[text()='Непроданные']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionYear6_1() {
        findByXpath("//div[@aria-label='Год от']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionYear6_2() {
        findByXpath("//div[text()='2007']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionMileage5_1() {
        findByXpath("//input[@placeholder='от, км']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage selectionMileage5_2() {
        findByXpath("//input[@placeholder='от, км']", Duration.ofSeconds(10)).sendKeys("1");
        return this;
    }

    public SearchPage clickShowing() {
        findByXpath("//div[text()='Показать']", Duration.ofSeconds(10)).click();
        return this;
    }

    public SearchPage correctSearch1() {
        List<WebElement> elements = driver.findElements(By.cssSelector(":not(.css-d4igzo)"));
        return this;
    }

    public SearchPage correctSearch2_1() {
            WebElement element = driver.findElement(By.xpath("//div[@class='css-1nvf6xk eojktn00']"));
            String text = element.getText();
            String regex = "\\b(194[0-9]|19[5-9][0-9]|200[0-6])\\b";

            if (Pattern.compile(regex).matcher(text).find()) {
                System.out.println("Автомобили на 1 странице не только с 2007 года.");
            } else {
                System.out.println("Автомобили на 1 странице только с 2007 года.");
            }
        return this;
    }

    public SearchPage correctSearch3 () {
            List<WebElement> elements = driver.findElements(By.xpath("//span[contains(text(),'км')]"));
            return this;
    }

    public SearchPage correctSearch2_2() {
        WebElement element = driver.findElement(By.xpath("//div[@class='css-1nvf6xk eojktn00']"));
        String text = element.getText();
        String regex = "\\b(194[0-9]|19[5-9][0-9]|200[0-6])\\b";

        if (Pattern.compile(regex).matcher(text).find()) {
            System.out.println("Автомобили на 2 странице не только с 2007 года.");
        } else {
            System.out.println("Автомобили на 2 странице только с 2007 года.");
        }
        return this;
    }

    public SearchPage nextPage () {
        findByXpath("//a[@aria-label='Следующая страница']", Duration.ofSeconds(10)).click();
        return this;
    }
}




