package StepObjects;

import PageObjects.FormsPage;

public class FormsPageSteps {
    FormsPage formsPage = new FormsPage();

    public void clickPracticeForm(){
        formsPage.practiceForm.click();
    }
}
