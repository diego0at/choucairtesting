package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastFormPage extends PageObject {

    public final static Target INPUT_PASSWORD = Target.the("Enter the password on the form")
            .located(By.id("password"));

    public final static Target INPUT_CONFIRM_PASSWORD = Target.the("Enter the confirm password on the form")
            .located(By.id("confirmPassword"));

    public final static Target INPUT_TERMS_OF_USE = Target.the("Click the terms of use on the form")
            .located(By.xpath("(//form[@name='userForm']/div[5])//span[@class='checkmark signup-consent__checkbox error']"));

    public final static Target INPUT_PRIVACY_SECURITY = Target.the("Click the privacy and security on the form")
            .located(By.xpath("(//form[@name='userForm']/div[6])//span[@class='checkmark signup-consent__checkbox error']"));

    public static final Target BUTTON_COMPLETE_FORM = Target.the("Complete the form")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(), 'Complete Setup')]"));

}
