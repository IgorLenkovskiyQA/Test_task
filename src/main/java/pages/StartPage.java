package pages;

import java.time.Duration;

public class StartPage extends BasePage {

    public SearchPage clickAdvanced_search() {
        findByXpath("//span[@class='css-1hfjy5z eakkndi0']", Duration.ofSeconds(10)).click();
        return new SearchPage();
    }

    public AuthPage clickAuth() {
        findByXpath("//a[@data-ftid='component_header_login']", Duration.ofSeconds(10)).click();
        return new AuthPage();
    }

    public TablePage choiseOfRegion() {
        findByXpath("//a[@data-ga-stats-name='HomeRegionChange']", Duration.ofSeconds(10)).click();
        findByXpath("//a[@href='https://www.drom.ru/my_region/?set_region=25']", Duration.ofSeconds(10)).click();
        return new TablePage();
    }
}
