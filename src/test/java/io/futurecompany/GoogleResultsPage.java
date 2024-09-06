package io.futurecompany;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class GoogleResultsPage extends BasePage{

    private final ElementsCollection results = $$("#rso > div");
    private final SelenideElement logo = $(".logo");

    public GoogleSearchPage clickLogo(){
        logo.click();
        return page(GoogleSearchPage.class);
    }
}
