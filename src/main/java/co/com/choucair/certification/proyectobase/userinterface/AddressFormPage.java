package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressFormPage extends PageObject {
        public static final Target INPUT_CITY = Target.the("Enter the city where yuo live")
                .located(By.id("city"));

        public static final Target INPUT_SELECT_CITY = Target.the("Select the city where yuo live")
                .located(By.id("city"));

        public static final Target INPUT_POSTAL_CODE = Target.the("Enter the postal code where yuo live")
            .located(By.id("zip"));
        public static final Target INPUT_SELECT_COUNTRY = Target.the("Enter the postal code where yuo live")
            .located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a country']//span[@class='ui-select-match-text pull-left']"));
        public static final Target INPUT_COUNTRY = Target.the("Enter the country  where yuo live")
            .located(By.xpath("//input[@type='search' and @aria-label='Select box' and @placeholder='Select a country']"));
        public static final Target INPUT_ITEM_COUNTRY = Target.the("Enter the country code where yuo live")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//span[contains(text(), 'Colombia')]"));
        public static final Target NEXT_DEVICES = Target.the("Continue with the following form")
                .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(), 'Next: Devices')]"));
}
