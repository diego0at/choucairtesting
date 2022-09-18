package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestWelcomePage extends PageObject {

    public static final Target WELCOME_TITLE = Target.the("welcome title for successful registration")
            .located(By.xpath("//div[@class='image-box-header']//h1[contains(text(), 'Welcome to the')]"));

}
