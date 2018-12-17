package pages;

import stepdefinitions.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Utility extends stepDefinitions {

	public boolean scrollDownPage() {
		try {
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) seleniumDriver; 	
	        js.executeScript("window.scrollBy(0,250)");
	        return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean clickLink(String link) {
		try {
			WebElement linkWebElement = seleniumDriver.findElement(By.xpath("//a[text()='" + link + "']"));
			linkWebElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean waitXSeconds(int seconds) {
		try {
			int sleepSeconds = seconds * 1000;
			Thread.sleep(sleepSeconds);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	

}
