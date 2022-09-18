package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.PersonalFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CompleteSignUpPersonalForm implements Task {

    public static CompleteSignUpPersonalForm stepOne() {
        return Tasks.instrumented(CompleteSignUpPersonalForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Andres").into(PersonalFormPage.INPUT_FIRST_NAME),
                Enter.theValue("Mejia").into(PersonalFormPage.INPUT_LAST_NAME),
                Enter.theValue("diegoatdev@gmail.com").into(PersonalFormPage.INPUT_MAIL),
                SelectFromOptions.byVisibleText("December").from(PersonalFormPage.INPUT_SELECT_MONTH),
                SelectFromOptions.byVisibleText("3").from(PersonalFormPage.INPUT_SELECT_DAY),
                SelectFromOptions.byVisibleText("1999").from(PersonalFormPage.INPUT_SELECT_YEAR),
                Enter.theValue("Spanish").into(PersonalFormPage.INPUT_LANGUAGES),
                Click.on(PersonalFormPage.NEXT_LOCATION)

        );
    }
}
