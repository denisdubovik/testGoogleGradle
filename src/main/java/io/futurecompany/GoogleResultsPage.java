package io.futurecompany;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public class GoogleResultsPage extends BasePage {

    private final ElementsCollection results = Selenide.$$("#rso > div");
    private final SelenideElement logo = Selenide.$(".logo");

    public void clickLogo() {
        logo.click();
    }
}
