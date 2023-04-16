import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SberCookiesCloseTest {

    @Test
    void sberCookiesClose() {
        open("https://online.sberbank.ru/CSAFront/index.do");
        $(withText("СберБанк защищает персональные данные")).shouldBe(visible);
        $(byAttribute("aria-label", "Закрыть")).click();
        $(withText("СберБанк защищает персональные данные")).shouldBe(hidden);
    }
}
