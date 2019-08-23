package com.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.pages.locators.SearchResultsPageLocators;

import junit.framework.Assert;
import utilities.SeleniumDriver;

public class SearchResultsPageActions {
	
	public SearchResultsPageLocators searchResultsPageLocators;
	
	public SearchResultsPageActions() {
		
		this.searchResultsPageLocators=new SearchResultsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchResultsPageLocators);
	}
	
	public void checkResultsText() {
		
		Assert.assertTrue("Text is not displayed", searchResultsPageLocators.filter_text.isDisplayed());
	}
	

}
