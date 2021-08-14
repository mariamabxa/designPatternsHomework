package PageObjects;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class PopupPage {

    public List<SelenideElement>
     rows= $(byTagName("tbody")).$$(byTagName("tr"));

}
