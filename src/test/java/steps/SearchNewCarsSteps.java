package steps;

import java.util.List;

import com.pages.actions.CarsHomePageActions;
import com.pages.actions.SearchResultsPageActions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.SeleniumDriver;

public class SearchNewCarsSteps {
	
	CarsHomePageActions carsHomePageActions=new CarsHomePageActions();
	SearchResultsPageActions searchResultsPageActions=new SearchResultsPageActions();

	@Given("^the user launched the browser$")
	public void the_user_launched_the_browser() throws Throwable {
		
		SeleniumDriver.setUpDriver();
	}

	@And("^the user navigated to \"([^\"]*)\"$")
	public void the_user_navigated_to(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SeleniumDriver.getURL(url);
		
	}

	@When("^the user moves to menu$")
	public void the_user_moves_to_menu(List<String> list) throws Throwable {
		
		String menu=list.get(1);
		System.out.println("Selected menu : "+menu);
		carsHomePageActions.clickCarsForSaleTab();
	}

	@And("^the user clicks on subMenu$")
	public void the_user_clicks_on_subMenu(List<String> list) throws Throwable {
		
		String submenu=list.get(1);
		System.out.println("Selected menu : "+submenu);
		carsHomePageActions.clickSearchByMakeSubTab();
		
	}

	@And("^the user selects stock type as \"([^\"]*)\" from the dropdown$")
	public void the_user_selects_stock_type_as_from_the_dropdown(String carType) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		carsHomePageActions.selectCarType(carType);
	}

	@And("^the user selects car make as \"([^\"]*)\" from the dropdown$")
	public void the_user_selects_car_make_as_from_the_dropdown(String carMake) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		carsHomePageActions.selectCarMake(carMake);
	}

	@And("^the user selects car model as \"([^\"]*)\" from the dropdown$")
	public void the_user_selects_car_model_as_from_the_dropdown(String carModel) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		carsHomePageActions.selectCarModel(carModel);
	}

	@And("^the user selects car price \"([^\"]*)\" from the dropdown$")
	public void the_user_selects_car_price_from_the_dropdown(String carPrice) throws Throwable {
		
		carsHomePageActions.selectCarPrice(carPrice);
		
	}

	@And("^the user selects car distance \"([^\"]*)\" from the dropdown$")
	public void the_user_selects_car_distance_from_the_dropdown(String carDistance) throws Throwable {
		
		carsHomePageActions.selectCarDistance(carDistance);
		
	}

	@And("^the user enters the zipCode as \"([^\"]*)\"$")
	public void the_user_enters_the_zipCode_as(String zipCode) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		carsHomePageActions.enterZipCode(zipCode);
	}

	@And("^the user clicks on Search button$")
	public void the_user_clicks_on_Search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		carsHomePageActions.clickSearchBtn();
	}

	@Then("^the list of searched car is displyed$")
	public void the_list_of_searched_car_is_displyed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		searchResultsPageActions.checkResultsText();
	}

	@And("^the page results title should be \"([^\"]*)\"$")
	public void the_page_results_title_should_be(String expectedTitle) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String actualTitle=SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

}
