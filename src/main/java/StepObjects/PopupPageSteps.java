package StepObjects;

import PageObjects.PopupPage;

import java.util.ArrayList;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PopupPageSteps {
    PopupPage popupPage = new PopupPage();

    public ArrayList<String> returnData(){
    ArrayList<String> checkedData = new ArrayList();
        for(int rowNum=0; rowNum<popupPage.rows.size(); rowNum++){
            String data =$(byXpath("//tbody//tr[" + (rowNum+1) +"]/td[2]")).getText();
            if(!data.isEmpty()){
                checkedData.add(data);
            } else {
                continue;
            }
        }
        return checkedData;
    }
}
