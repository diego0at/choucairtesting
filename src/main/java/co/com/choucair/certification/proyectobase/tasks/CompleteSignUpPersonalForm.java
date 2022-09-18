package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.PersonalFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CompleteSignUpPersonalForm implements Task {

    private String strMail;
    private String strFirstName;
    private String strLastName;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguages;

    public CompleteSignUpPersonalForm(String strFirstName, String strLastName, String strMail, String strMonth, String strDay, String strYear, String strLanguages) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strMail = strMail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguages = strLanguages;
    }

    public static CompleteSignUpPersonalForm stepOne(String strFirstName, String strLastName, String strMail, String strMonth, String strDay, String strYear, String strLanguages) {
        return Tasks.instrumented(CompleteSignUpPersonalForm.class, strFirstName, strLastName, strMail, strMonth, strDay, strYear, strLanguages);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(PersonalFormPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(PersonalFormPage.INPUT_LAST_NAME),
                Enter.theValue(strMail).into(PersonalFormPage.INPUT_MAIL),
                SelectFromOptions.byVisibleText(strMonth).from(PersonalFormPage.INPUT_SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(PersonalFormPage.INPUT_SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(PersonalFormPage.INPUT_SELECT_YEAR),
                Enter.theValue(strLanguages).into(PersonalFormPage.INPUT_LANGUAGES),
                Click.on(PersonalFormPage.NEXT_LOCATION)

        );
    }
}
