package pageobjects;

import org.openqa.selenium.By;

import pageobjects.Locator;

public enum LoginPage implements PageObject {
	txtUsername("email","emaillogin",Locator.NAME),
	txtPassword("password","passwordText",Locator.NAME),
	btnLogin("submit","buttonsubmit",Locator.CLASS);
	
	private final By BY;
	private final String NAME;
	
	private LoginPage(String property, String objName, Locator locator)
	{
		switch(locator){
			case ID:
				BY = By.id(property);
			case NAME:
				BY = By.name(property);
			case CLASS:
				BY = By.className(property);
					}
		NAME = objName;
	}

}
