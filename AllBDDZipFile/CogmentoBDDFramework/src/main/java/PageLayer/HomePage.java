package PageLayer;

import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public String ContactPageTitle() {

		return getTitle();

	}

}
