package ui_tests;

import org.testng.annotations.Test;
import pages.TablePage;

public class TableTest extends BaseTest {

    @Test(description = "Вывод таблицы с фирмами")
    public void tableCreation() {
        new TablePage().goToStartPage()
                .choiseOfRegion()
                .selectionMark()
                .allMarks();
                //.printMarks();

    }
}
