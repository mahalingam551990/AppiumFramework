package PageObjectModel.AppiumFramework.PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;

import PageObjectModel.AppiumFramework.ObjectRepository.LoginScreen;
import PageObjectModel.AppiumFramework.ObjectRepository.SearchScreen;
import PageObjectModel.AppiumFramework.common.ActionKeyword;
import PageObjectModel.AppiumFramework.common.Driver;
import io.appium.java_client.MobileElement;

public class SearchPage extends ActionKeyword
{

	public static void selectLanguage()
	{
		waitForObjectToLoad(SearchScreen.languageSelection,20);
		Tap(SearchScreen.languageSelection);
		Tap(SearchScreen.saveChangesButton);
		

	}
	public static void searchTV()
	{
		waitForObjectToLoad(SearchScreen.searchTxt,20);
		Tap(SearchScreen.searchTxt);
		sleep(3000);
		enterText(SearchScreen.searchTxt, "65 inch tv");
	}
	public static void clickonSearchResults()
	{
		//Tap(SearchScreen.searchResultsLbl);
		//Tap(SearchScreen.searchProductList);
		//switchToWebView();
		//verifyPresenceOfElement(SearchScreen.search65InchTV,20);
		selectAnyItemfromList(SearchScreen.search65InchTV);
		Random rand = new Random();
		int randomIndex =rand.nextInt(4);
		tapbyIndex(SearchScreen.searchProductList,randomIndex);
	}
	
	public static void deliveryLocation()
	{
		//Tap(SearchScreen.searchResultsLbl);
		//Tap(SearchScreen.searchProductList);
		//switchToWebView();
		//verifyPresenceOfElement(SearchScreen.search65InchTV,20);
		System.out.println("searchResultsLbl"+SearchScreen.searchResultsLbl+" searchProductList"+SearchScreen.searchProductList);
		tapbyIndex(SearchScreen.searchProductList,1);
	}
		
	
}
