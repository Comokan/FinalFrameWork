package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import stepdefinitions.stepDefinitions;

public class InfinityInspired extends stepDefinitions {
	
	@FindBy(how = How.NAME, using = "fname")
	private WebElement firstNameWebElement;
	
	@FindBy(how = How.NAME, using = "lname")
	private WebElement lastNameWebElement;
	
	@FindBy(how = How.NAME, using = "email")
	private WebElement emailWebElement;
	
	@FindBy(how = How.XPATH, using = "//input[@class='field-element text']")
	private WebElement subjectWebElement;
	
	@FindBy(how = How.ID, using = "textarea-yui_3_10_1_1_1398131309997_30382-field")
	private WebElement messageWebElement;
	
	@FindBy(how = How.XPATH, using = "//input[@x-autocompletetype='phone-area-code']")
	private WebElement areaCodeWebElement;
	
	@FindBy(how = How.XPATH, using = "//input[@x-autocompletetype='phone-local-prefix']")
	private WebElement localPrefixWebElement;
	
	@FindBy(how = How.XPATH, using = "//input[@x-autocompletetype='phone-local-suffix']")
	private WebElement localSuffixWebElement;

	public boolean clickLink(String link) {
		try {
			WebElement linkWebElement = seleniumDriver.findElement(By.xpath("//nav[@class='main-nav']//a[text()='" + link + "']"));
			linkWebElement.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean enterFirstName(String firstName) {
		try {
			firstNameWebElement.sendKeys(firstName);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean enterLastName(String lastName) {
		try {
			lastNameWebElement.sendKeys(lastName);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean enterEmailAddress(String emailAddress) {
		try {
			emailWebElement.sendKeys(emailAddress);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean enterSubject(String subject) {
		try {
			subjectWebElement.sendKeys(subject);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean enterMessage(String message) {
		try {
			messageWebElement.sendKeys(message);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean enterPhoneNumber(String phoneNumber) {
		try {
			areaCodeWebElement.sendKeys(phoneNumber.substring(0, 3));
			localPrefixWebElement.sendKeys(phoneNumber.substring(3, 6));
			localSuffixWebElement.sendKeys(phoneNumber.substring(6));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
