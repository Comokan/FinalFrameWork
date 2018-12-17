package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InfinityInspired;
import pages.KarissaDahnkePhotography;
import pages.Utility;	

public class stepDefinitions {
	
//	public static final Logger log = LogManager.getLogger(stepDefinitions.class.getName());
	
	
	public static FirefoxDriver seleniumDriver;
	
	public Utility utility;
	public KarissaDahnkePhotography karissaDahnkePhotography;
	public InfinityInspired infinityInspired;
	
	public Logger log = LogManager.getLogger(stepDefinitions.class.getName());
	
	
	public void assertTrue(String string, boolean Boolean) {
		if (Boolean == true) {
		} else {
			Assert.fail(string);
		}
	}	
	
	public Boolean navigateToWebsite(String website) {
		try {
			seleniumDriver.navigate().to(website);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@After
	public void cleanUp() {
		seleniumDriver.close();
	}	

	@Given("^I launch the FireFox Browser and I am ready to do some testing$")
	public void iLaunchTheFireFoxBrowserAndIAmReadyToDoSomeTesting() throws Throwable {
		try {
			seleniumDriver = new FirefoxDriver();
			log.debug("Launched Firefox Browser");
			seleniumDriver.manage().window().maximize();
			log.debug("Maximized Firefox Browswer");
			seleniumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			utility = new Utility();
			karissaDahnkePhotography = new KarissaDahnkePhotography();
			infinityInspired = new InfinityInspired();
			PageFactory.initElements(seleniumDriver, utility);
			PageFactory.initElements(seleniumDriver, karissaDahnkePhotography);
			PageFactory.initElements(seleniumDriver, infinityInspired);
			log.debug("Initialized Page Factory");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^I navigate to the Website Address \"([^\"]*)\"$")
	public void iNavigateToTheWebsiteAddress(String website) throws Throwable {
		assertTrue("Was not able to successfully navigate to website: " + website, navigateToWebsite(website));
		log.debug("Successfully navigated to website: " + website);
	}

	@Then("^I verify that I am on the correct Website Page by looking at the Header Link \"([^\"]*)\"$")
	public void iVerifyThatIAmOnTheCorrectWebsitePageByLookingAtTheHeaderLink(String websiteHeaderLink) throws Throwable {
		assertTrue("Did not find the Website Header Link that corresponds to: " + websiteHeaderLink, karissaDahnkePhotography.verifyHeaderLink(websiteHeaderLink));
		log.debug("Successfully found the Website Header Link: " + websiteHeaderLink);
	}

	@When("^I click on a category \"([^\"]*)\" on the Karissa Dahnke Photography Website$")
	public void iClickOnACategoryOnTheKarissaDahnkePhotographyWebsite(String category) throws Throwable {
		assertTrue("Was not able to click on category: " + category, karissaDahnkePhotography.clickOnCategory(category));
		log.debug("Was able to click on category: " + category);
	}

	@Then("^I take a look at the page$")
	public void iTakeALookAtThePage() throws Throwable {
		Thread.sleep(30000);
	}

	@And("^I scroll down slightly$")
	public void iScrollDownSlightly() throws Throwable {
		assertTrue("Was not able to scroll the page down", utility.scrollDownPage());
		log.debug("Scrolled webpage down");
	}

	@When("^I click on the link \"([^\"]*)\"$")
	public void iClickOnTheLink(String link) throws Throwable {
		assertTrue("Was not able to click on link: " + link, utility.clickLink(link));
		log.debug("Successfully clicked on link: " + link);
	}

	@When("^I click on the link \"([^\"]*)\" on the Infinity Inspired Photography Page$")
	public void iClickOnTheLinkOnTheInfinityInspiredPhotographyPage(String link) throws Throwable {
		assertTrue("Was not able to click on link: "+ link, infinityInspired.clickLink(link));
		log.debug("Clicked on link: " + link);
	}

	@And("^I wait \"([^\"]*)\" seconds$")
	public void iWaitSeconds(int seconds) throws Throwable {
		assertTrue("Was not able to wait " + seconds + " seconds", utility.waitXSeconds(seconds));
		log.debug("Waited " + seconds + " seconds");
	}

	@When("^I fill out my first name \"([^\"]*)\"$")
	public void iFillOutMyFirstName(String firstName) throws Throwable {
		assertTrue("Was not able to fill out first name: " + firstName, infinityInspired.enterFirstName(firstName));
		log.debug("Filled out first name: " + firstName);
		
	}

	@And("^I fill out my last name \"([^\"]*)\"$")
	public void iFillOutMyLastName(String lastName) throws Throwable {
		assertTrue("Was not able to fill out last name: " + lastName, infinityInspired.enterLastName(lastName));
		log.debug("Filled out last name: " + lastName);
	}

	@And("^I enter my Email Address \"([^\"]*)\"$")
	public void iEnterMyEmailAddress(String emailAddress) throws Throwable {
		assertTrue("Was not able to fill out email: " + emailAddress, infinityInspired.enterEmailAddress(emailAddress));
		log.debug("Filled out email address: " + emailAddress);		
	}

	@And("^I enter a Subject \"([^\"]*)\"$")
	public void iEnterASubject(String subject) throws Throwable {
		assertTrue("Was not able to enter subject: " + subject, infinityInspired.enterSubject(subject));
		log.debug("Was able to enter subject: " + subject);
	}

	@And("^I enter a Message \"([^\"]*)\"$")
	public void iEnterAMessage(String message) throws Throwable {
		assertTrue("Was not able to enter message", infinityInspired.enterMessage(message));
		log.debug("Was able to enter message");
	}

	@And("^I enter my Phone Number \"([^\"]*)\"$")
	public void iEnterMyPhoneNumber(String phoneNumber) throws Throwable {
		assertTrue("Was not able to enter phone number: " + phoneNumber, infinityInspired.enterPhoneNumber(phoneNumber));
		log.debug("Entered phone number: " + phoneNumber);
	}

	

}
