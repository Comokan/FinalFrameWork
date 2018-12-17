package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import stepdefinitions.stepDefinitions;

public class KarissaDahnkePhotography extends stepDefinitions {

//	@FindBy(how = How.XPATH, using = "//a[text()='Karissa Dahnke Photography']")
//	private WebElement karissaHeader;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project-title'][text()='Concerts']")
	private WebElement concerts;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project-title'][text()='Comic Con']")
	private WebElement comicCon;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project-title'][text()='Wrestling']")
	private WebElement wrestling;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project-title'][text()='Animals']")
	private WebElement animals;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project-title'][text()='Misc Nature']")
	private WebElement miscNature;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project-title'][text()='Flowers']")
	private WebElement flowers;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project-title'][text()='Out & About']")
	private WebElement outAndAbout;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project-title'][text()='Insects']")
	private WebElement insects;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project-title'][text()='Birds']")
	private WebElement birds;

	public boolean verifyHeaderLink(String websiteHeaderLink) {
		try {
			WebElement websiteHeaderLinkWebElement = seleniumDriver.findElement(By.xpath("//a[text()='" + websiteHeaderLink + "']"));
			websiteHeaderLinkWebElement.isDisplayed();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean clickOnCategory(String category) {
		try {
			switch (category.toLowerCase()) {
			case "concerts" : 
				concerts.click();
				return true;
			case "comic con" : 
				comicCon.click();
				return true;
			case "comiccon" : 
				comicCon.click();
				return true;
			case "wrestling" :
				wrestling.click();
				return true;
			case "animals" :
				animals.click();
				return true;
			case "misc nature" :
				miscNature.click();
				return true;
			case "flowers" :
				flowers.click();
				return true;
			case "out and about" :
				outAndAbout.click();
				return true;
			case "out & about" :
				outAndAbout.click();
				return true;
			case "out&about" :
				outAndAbout.click();
				return true;
			case "birds" :
				birds.click();
				return true;
			case "insects" :
				insects.click();
				return true;
			default : log.warn("Category given: " + category + " did not match any existing case in Click on Category Method");
			return false;
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
