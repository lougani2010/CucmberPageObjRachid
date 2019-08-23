package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pages.locators.CarsHomePageLocators;

import utilities.SeleniumDriver;

public class CarsHomePageActions {

	 CarsHomePageLocators carsHomePageLocators=null;

	public CarsHomePageActions() {

		this.carsHomePageLocators = new CarsHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsHomePageLocators);

	}
	
	//clciking on cars for sale tab

	public void clickCarsForSaleTab() {
		
		
		carsHomePageLocators.carsForSaleMenu.click();

	}

	public void clickSearchByMakeSubTab() {
		
		carsHomePageLocators.searchByMakeTab.click();

	}

	public void selectCarType(String carType) {
		
		Select select=new Select(carsHomePageLocators.carTypeDropDown);
		select.selectByVisibleText(carType);

	}

	public void selectCarMake(String carMake) {
		
		Select select=new Select(carsHomePageLocators.carMakeDropDown);
		select.selectByVisibleText(carMake);

	}

	public void selectCarModel(String carModel) {
		
		Select select=new Select(carsHomePageLocators.carModelDropDown);
		select.selectByVisibleText(carModel);

	}

	public void selectCarPrice(String carPrice) {
		
		Select select=new Select(carsHomePageLocators.carPriceDropDown);
		select.selectByVisibleText(carPrice);

	}

	public void selectCarDistance(String carDistance) {
		
		Select select=new Select(carsHomePageLocators.carDistanceDropDown);
		select.selectByVisibleText(carDistance);

	}

	public void enterZipCode(String zipCode) {
		
	
		carsHomePageLocators.carZipCode.sendKeys(zipCode);

	}

	public void clickSearchBtn() {
		
		carsHomePageLocators.searchCarBtn.click();
		

	}

}
