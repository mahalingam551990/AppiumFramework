package PageObjectModel.AppiumFramework.PageObjects;

import PageObjectModel.AppiumFramework.ObjectRepository.AddressScreen;
import PageObjectModel.AppiumFramework.common.ActionKeyword;
import PageObjectModel.AppiumFramework.common.Driver;

public class AddressPage extends ActionKeyword {

	public static void addNewAddress() {
		
		enterText(AddressScreen.addressFullName, "65 inch ");
		enterText(AddressScreen.addressPhoneNumber, "7894561230");
		enterText(AddressScreen.addressPostelcode, "613007");
		enterText(AddressScreen.addressLine1, "no.123, appium street,Ezhil Nagar");
		enterText(AddressScreen.addressLine2, "MC Road");
		enterText(AddressScreen.addressLandmark, "Near xyz Stores");
		enterText(AddressScreen.addressCity, "Thanjavur");
		if(verfyIfObjectIsPresent(AddressScreen.newAddress))
		{
			Tap(AddressScreen.newAddress);
		}
	}

}
