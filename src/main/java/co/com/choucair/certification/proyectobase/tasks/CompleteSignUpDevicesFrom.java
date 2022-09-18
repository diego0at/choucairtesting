package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.AddressFormPage;
import co.com.choucair.certification.proyectobase.userinterface.DevicesFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteSignUpDevicesFrom implements Task {
    public static CompleteSignUpDevicesFrom stepThree() {
        return Tasks.instrumented(CompleteSignUpDevicesFrom.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(DevicesFormPage.INPUT_SELECT_MOBILE),
                Enter.theValue("Sony").into(DevicesFormPage.INPUT_MOBILE),
                Click.on(DevicesFormPage.INPUT_ITEM_MOBILE),

                Click.on(DevicesFormPage.INPUT_SELECT_MODEL),
                Enter.theValue("W200").into(DevicesFormPage.INPUT_MODEL),
                Click.on(DevicesFormPage.INPUT_ITEM_MODEL),

                Click.on(DevicesFormPage.INPUT_SELECT_OPERATING_SYSTEM),
                Enter.theValue("Java ME").into(DevicesFormPage.INPUT_OPERATING_SYSTEM),
                Click.on(DevicesFormPage.INPUT_ITEM_OPERATING_SYSTEM),

                Click.on(DevicesFormPage.NEXT_LAST_STEP)
        );

    }
}
