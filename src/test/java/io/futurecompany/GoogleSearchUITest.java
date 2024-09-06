package io.futurecompany;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchUITest {

    @Test
    public void testSearchResult() {
        GoogleSearchPage searchPage = open(GoogleSearchPage.URL, GoogleSearchPage.class);
        GoogleResultsPage resultsPage = searchPage.search("Sergey Mozgunov");
        resultsPage.getResults().get(0).shouldHave(text("Sergey Mozgunov"));
    }

    @Test
    public void testTooltipOnSearchField() {
        GoogleSearchPage searchPage = open(GoogleSearchPage.URL, GoogleSearchPage.class);
        searchPage.getSearchField().shouldHave(attribute("title", "Search"));
    }

    @Test
    public void testLogoClickBehavior() {
        GoogleSearchPage searchPage = open(GoogleSearchPage.URL, GoogleSearchPage.class);
        GoogleResultsPage resultsPage = searchPage.search("Sergey Mozgunov");
        resultsPage.clickLogo();
        resultsPage.getResults().get(0).shouldNot(exist);
        searchPage.getTitle().shouldHave(attribute("text", GoogleSearchPage.TITLE));
    }
}
