package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalFormPage extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("Enter the first name in the form")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Enter the first name in the form")
            .located(By.id("lastName"));
    public static final Target INPUT_MAIL = Target.the("Enter the mail in the box")
            .located(By.id("email"));
    public static final Target INPUT_SELECT_MONTH = Target.the("Select Date of birth: month")
            .located(By.name("birthMonth"));
    public static final Target INPUT_SELECT_DAY = Target.the("Select Date of birth: day")
            .located(By.name("birthDay"));
    public static final Target INPUT_SELECT_YEAR = Target.the("Select Date of birth: year")
            .located(By.name("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("Add Languages (spoken)")
            .located(By.xpath("//input[@type='search']"));
    public static final Target NEXT_LOCATION = Target.the("Continue with the following form")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(), 'Next: Location')]"));
}
