package io.futurecompany;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

@Getter
public class GoogleSearchPage extends BasePage{

    public final static String URL = "https://www.google.com";
    public final static String TITLE = "Google";
    private final SelenideElement searchField = $(By.name("q"));

    public GoogleResultsPage search(String query) {
        searchField.setValue(query).pressEnter();
        return page(GoogleResultsPage.class);
    }

}
