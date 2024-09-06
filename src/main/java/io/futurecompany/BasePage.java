package io.futurecompany;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public abstract class BasePage {

    private final SelenideElement title = Selenide.$("head title");

}
