package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsHomePageLocators {
	
	@FindBy(how=How.XPATH,using="//*[@id='root']/div[1]/header/nav/ul/li[1]/a")
	public WebElement carsForSaleMenu;
	
	@FindBy(how=How.XPATH,using="//*[@id='shopindex-make']")
	public WebElement searchByMakeTab;
	
	@FindBy(how=How.CSS,using="select[ng-model='selectedStockType']")
	public WebElement carTypeDropDown;
	
	@FindBy(how=How.CSS,using="#search-widget-dropdowns--make > div.sw-input.sw-make > select")
	public WebElement carMakeDropDown;
	
	@FindBy(how=How.CSS,using="#search-widget-dropdowns--make > div.sw-input.sw-model > select")
	public WebElement carModelDropDown;
	
	@FindBy(how=How.CSS,using="#search-widget-dropdowns--make > div.sw-input.sw-price > select")
	public WebElement carPriceDropDown;
	
	@FindBy(how=How.CSS,using="#search-widget-dropdowns--make > div.sw-input.sw-miles > select")
	public WebElement carDistanceDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='search-widget-dropdowns--make']/div[6]/input")
	public WebElement carZipCode;
	
	@FindBy(how=How.CSS,using="#search-widget-submit")
	public WebElement searchCarBtn;
	
	


}
