import Person.Person;
import StepObjects.FormsPageSteps;
import StepObjects.HomePageSteps;
import StepObjects.PopupPageSteps;
import StepObjects.RegistrationFormPageSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormTest extends Configs {
    HomePageSteps homePageSteps = new HomePageSteps();
    FormsPageSteps formsPageSteps = new FormsPageSteps();
    RegistrationFormPageSteps registrationFormPageSteps = new RegistrationFormPageSteps();
    PopupPageSteps popupPageSteps = new PopupPageSteps();
    Person person = new Person();

    @Test
    public void fillAndValidate(){
        open("https://demoqa.com/");
        homePageSteps.clickForms();
        formsPageSteps.clickPracticeForm();

        registrationFormPageSteps.enterFirstName(person.getFirstName());
        registrationFormPageSteps.enterLastName(person.getLastName());
        registrationFormPageSteps.enterGender();
        registrationFormPageSteps.enterMobile(person.getMobile());
        registrationFormPageSteps.enterDate(person.getDate());
        registrationFormPageSteps.clickSubmit();

        //validations
        System.out.println(popupPageSteps.returnData());
        System.out.println(person.getExpectedData());
        Assert.assertEquals(popupPageSteps.returnData(), person.getExpectedData());

    }

}
