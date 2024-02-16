package ui_tests;

import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends BaseTest {

    @Test(description = "Поиск автомобилей по параметрам")
    public void checkSearchCars() {

        new SearchPage().goToStartPage()
                .clickAdvanced_search()
                .selectionMark1_1()
                .selectionMark1_2()
                .selectionMark1_3()
                .selectionModel2_1()
                .selectionModel2_2()
                .selectionModel2_3()
                .selectionFuel3_1()
                .selectionFuel3_2()
                .selectionUnsold4()
                .selectionMileage5_1()
                .selectionMileage5_2()
                .selectionYear6_1()
                .selectionYear6_2()
                .clickShowing()
                .correctSearch1()
                .correctSearch2_1()
                .correctSearch3()
                .nextPage()
                .correctSearch1()
                .correctSearch2_2()
                .correctSearch3();
    }
}