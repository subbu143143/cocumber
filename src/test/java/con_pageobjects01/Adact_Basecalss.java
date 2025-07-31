package con_pageobjects01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Adact_Basecalss {
	public static WebDriver driver;
	public Adact_Basecalss(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

}
