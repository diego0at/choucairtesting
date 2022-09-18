package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(), 'Join Today')]"));
}
