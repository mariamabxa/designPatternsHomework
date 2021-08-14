package StepObjects;

import PageObjects.RegistrationFormPage;
import org.openqa.selenium.Keys;

public class RegistrationFormPageSteps {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    public void enterFirstName(String firstName){
        registrationFormPage.firstName.setValue(firstName);
    }

    public void enterLastName(String lastName){
        registrationFormPage.lastName.setValue(lastName);
    }

    public void enterGender(){
        registrationFormPage.gender.click();
    }

    public void enterMobile(String mobile){
        registrationFormPage.mobile.setValue(mobile);
    }

    public void enterDate(String date){
        registrationFormPage.date.setValue(Keys.chord(Keys.CONTROL, "a")).sendKeys(date);
        registrationFormPage.date.sendKeys(Keys.chord(Keys.ENTER));
    }

    public void clickSubmit(){
        registrationFormPage.submit.scrollTo().click();
    }
}
