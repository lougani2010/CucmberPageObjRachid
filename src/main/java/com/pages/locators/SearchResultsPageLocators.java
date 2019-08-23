package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultsPageLocators {
	
	@FindBy(how=How.CSS,using=".filter-text1")
	public WebElement filter_text;

}
