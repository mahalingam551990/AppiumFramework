package PageObjectModel.AppiumFramework.PageObjects;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;

import PageObjectModel.AppiumFramework.ObjectRepository.PDPScreen;
import PageObjectModel.AppiumFramework.ObjectRepository.SearchScreen;
import PageObjectModel.AppiumFramework.common.ActionKeyword;
import PageObjectModel.AppiumFramework.common.Driver;

public class PDPPage extends ActionKeyword
{
	public static HashMap<String,String> productDetails;
	
	public static void addToCart()
	{
		scrolldown("Add to Cart");
		Tap(PDPScreen.addToCart);
		Tap(PDPScreen.cartCount);
		//Tap(PDPScreen.proceedToBuy);
	}
	public static void clickonSearchResults()
	{
		Tap(SearchScreen.searchResultsLbl);

	}
	
	public static void getProductDetails()
	{
		try
		{
		productDetails = new HashMap<String,String>();
		productDetails.put("customerReview", getText(PDPScreen.customerReviewLink));
		productDetails.put("productDescription", getText(PDPScreen.productDescription));
		productDetails.put("productPrice", getText(PDPScreen.productPrice));
		}
		catch(Exception e)
		{
			System.out.println("exception in storing values in map object  "+e.getMessage());
		}
	}
	
	
	
}
