package io.futurecompany;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class GoogleSearchPage extends BasePage {

    public final static String URL = "https://www.google.com";
    public final static String TITLE = "Google";
    private final SelenideElement searchField = Selenide.$(By.name("q"));

    public GoogleResultsPage search(String query) {
        searchField.setValue(query).pressEnter();
        return Selenide.page(GoogleResultsPage.class);
    }

}
