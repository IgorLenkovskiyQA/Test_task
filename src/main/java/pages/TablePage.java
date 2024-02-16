package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class TablePage extends BasePage {

    public TablePage selectionMark() {
        findByXpath("//input[@placeholder='Марка']", Duration.ofSeconds(10)).click();
        return this;
    }

    public TablePage allMarks() {
        findByXpath("//div[@class='css-5iu465 ewaf0l10']",Duration.ofSeconds(10)).click();
        List<WebElement> marks = driver.findElements(By.xpath("//div[contains(@id,'ttg6vpk7y3un-')]"));
        for (WebElement xMarks : marks) System.out.println(xMarks.getText());
        return this;
    }
}


