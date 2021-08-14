package StepObjects;

import PageObjects.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    public void clickForms(){
        homePage.forms.scrollTo().click();
    }
}
