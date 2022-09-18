package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesFormPage extends PageObject {


    // Your computer autocomplete


    public static final Target INPUT_SELECT_MOBILE = Target.the("Click on the input version your mobile")
            .located(By.xpath("//div[@id='mobile-device']//div[@placeholder='Select Brand']"));
    public static final Target INPUT_MOBILE = Target.the("Enter version your mobile")
            .located(By.xpath("//input[@type='search' and @aria-label='Select box' and @placeholder='Select Brand']"));
    public static final Target INPUT_ITEM_MOBILE = Target.the("Select version your mobile item")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//span[contains(text(), 'Sony')]"));


    public static final Target INPUT_SELECT_MODEL = Target.the("Click on the input model your mobile")
            .located(By.xpath("//div[@id='mobile-device']//div[@placeholder='Select a Model']"));
    public static final Target INPUT_MODEL = Target.the("Enter model your mobile")
            .located(By.xpath("//input[@type='search' and @aria-label='Select box' and @placeholder='Select a Model']"));
    public static final Target INPUT_ITEM_MODEL = Target.the("Select model your mobile item")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//span[contains(text(), 'W200')]"));


    public static final Target INPUT_SELECT_OPERATING_SYSTEM = Target.the("Click on the input operating system your mobile")
            .located(By.xpath("//div[@id='mobile-device']//div[@placeholder='Select OS']"));
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("Enter operating system your mobile")
            .located(By.xpath("//div[@name='handsetOSId']//input[@type='search' and @aria-label='Select box' and @placeholder='Select OS']"));
    public static final Target INPUT_ITEM_OPERATING_SYSTEM = Target.the("Select operating system your mobile item")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//span[contains(text(), 'Java ME')]"));


    public static final Target NEXT_LAST_STEP = Target.the("Continue with the last step form")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(), 'Next: Last Step')]"));

}
