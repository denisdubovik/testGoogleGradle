package io.futurecompany;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class BasePage {

    private final SelenideElement title = $("head title");

    @BeforeClass
    public void setUp() {
        Configuration.headless = true;
    }
}
