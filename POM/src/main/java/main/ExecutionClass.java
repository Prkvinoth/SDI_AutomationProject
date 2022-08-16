package main;

import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import appPages.AddingNonCatItemToCart;
import appPages.HomePage;
import appPages.Login;
import appPages.NonCatItemToCart;
import appPages.NonCatalogRequestPage;
import appPages.QuickItemEntry;
import reusable.BaseClass;
import utilities.ExtentReport;

public class ExecutionClass extends BaseClass {

	ExtentReport ER = new ExtentReport();
	BaseClass BS = new BaseClass();
	Login login = new Login();
	HomePage HP = new HomePage();
	NonCatalogRequestPage NCR = new NonCatalogRequestPage();
	AddingNonCatItemToCart Cart = new AddingNonCatItemToCart();
	NonCatItemToCart NCart = new NonCatItemToCart ();
	QuickItemEntry QIE = new QuickItemEntry();
	
	//Verify whether login page is displayed when punch in the URL in the browser
	@Test
	public void TC_SDIR_001() throws Exception {

		String testname = "TS_SDIR_001";
		try {

			login.AppLoginURL();

			login.WaitAlert();

			login.alert();

			login.WaitLoginToYourAccount();

			boolean exist = login.LoginToYourAccount();

			if (exist) {
				ER.ERSS(testname, "Pass", "Login page displayed");
			} else {
				ER.ERSS(testname, "Fail", "Login page not displayed");
			}
			log.info(testname + " Executed Sucessfully");
		} catch (Exception e) {
			ER.ERSS(testname, "Exception", e.getMessage());
			log.error(testname + " Execution Failed" + e.getMessage());
		}
	}

	//Verify whether user logged in to the application when provide valid credentiails
	@Test
	public void TS_SDIR_017() throws Exception {

		String testname = "TS_SDIR_017";
		
		try {

			login.AppLoginURL();

			login.WaitAlert();

			login.alert();

			login.WaitUsername();

			login.UserName();

			login.WaitPassword();

			login.Password();

			login.WaitLoginButton();

			login.LoginButton();

			HP.WaitApptitle();

			boolean exist = HP.Apptitle();

			if (exist) {
				ER.ERFSS(testname, "Pass", "Login Sucessfull");
			} else {
				ER.ERFSS(testname, "Fail", "Login failed");
			}
			log.info(testname + " Executed Sucessfully");
		}
		
		catch (Exception e) {
			ER.ERFSS(testname, "Exception", e.getMessage());

			log.error(testname + " Execution Failed" + e.getMessage());
		}
	}


// Verify whether user can navigate to the non catalog request page

	@Test
	
	public void TS_SDIR_002() throws Exception {
		
		String testname = "TS_SDIR_002";
		try {
			
		NCR.LogoClick();
		
		NCR.WaitNCIcon();
		
		NCR.NonCatIconClick();
		
		NCR.WaitNCTitle();
		
		NCR.NonCatalogPageTitle();
		
		boolean exist = NCR.NonCatalogPageTitle();
		
		if (exist) {
			
			ER.ERFSS(testname, "Pass", "NonCatalogRequest Page displayed");
		}
		else {
			
			ER.ERFSS(testname, "Fail", "NonCatalogRequest Page is not displayed");
					
		}
		
		log.info(testname + "Executed Successfully");
		
		}
		
		catch (Exception e) {
			
			ER.ERFSS(testname, "Exception", e.getMessage());
			
			log.error (testname + "Execution Failed" + e.getMessage());
			
		}}
	
	// Verify user can add non-catalog item to cart by filling mandatory fields

 @Test

public void TS_SDIR_003() throws Exception {
	 
	String testname = "TS_SDIR_003";
	
	try {
	
	Cart.LogoClick();
	
	Cart.WaitNCIcon();
	
	Cart.NonCatIconClick();
	
	Cart.WaitNCTitle();
		
	Cart.AddItemToCart(testname);
	
	Cart.AddItemToCart1(testname);
	
	Cart.AddItemToCart2(testname);
	
	Cart.AddItemToCart3(testname);
	
	Cart.AddItemToCart4(testname);
	
	Cart.AddItemToCart5(testname);
	
	Cart.ConfirmationMessage();
	
	boolean exist = Cart.ConfirmationMessage();
	
	if (exist) {
		
		ER.ERFSS(testname, "Pass", "Non-Cat Item Added To Cart");
	}
	else {
		
		ER.ERFSS(testname, "Fail", "Non-Cat Item is not Added To Cart");
				
	}
	
	log.info(testname + "Executed Successfully");
	
	}
	
	catch (Exception e) {
		
		ER.ERFSS(testname, "Exception", e.getMessage());
		
		log.error (testname + "Execution Failed" + e.getMessage());
		
	}}
 	
 		//Verify whether user can add a noncatalog item by filling all the fields

 @Test

 	public void TS_SDIR_004() throws Exception {
	 
	String testname = "TS_SDIR_004";
	
	try {
			
	NCart.LogoClick();
	
	NCart.WaitNCIcon();
		
	NCart.NonCatIconClick();
		
	NCart.WaitNCTitle();
	
	NCart.MfgName(testname);
	
	NCart.MfgPart(testname);
	
	NCart.RecSup(testname);
	
	NCart.SupPart(testname);
	
	NCart.Description(testname);
	
	NCart.Quantity(testname);
	
	NCart.UOM(testname);
	
	NCart.UploadFile(testname);
	
	NCart.WaitSave();
	
	NCart.Save_Done();
	
	NCart.Wait();
	
	NCart.FindItem();
	
	boolean exist = NCart.FindItem();
	
	if (exist) {
		
		ER.ERFSS(testname, "Pass", "Item is available in cart");
	}
	else {
		
		ER.ERFSS(testname, "Fail", "Item is not added to cart");
				
	}
	
	log.info(testname + "Executed Successfully");
	
	}
	
	catch (Exception e) {
		
		ER.ERFSS(testname, "Exception", e.getMessage());
		
		log.error (testname + "Execution Failed" + e.getMessage());
		
	}}

	//Verify whether user can add an to cart from quick item entry

@Test

	public void TS_SDIR_005() throws Exception {
 
String testname = "TS_SDIR_005";

try {
	
	QIE.LogoClick();
	
	QIE.WaitNCIcon();
	
	QIE.NonCatIconClick();
	
	QIE.WaitNCTitle();
	
	QIE.SearchField(testname);
	
	QIE.WaitSI();
	
	QIE.SearchClick();
	
	QIE.WaitPopup();
	
	QIE.EnterQty(testname);
	
	QIE.WaitSubmit();
	
	//QIE.WaitSubmit1();
	
	QIE.SubmitClick();
	
	QIE.WaitSM();

	QIE.ConfirmationMessage();
	
	boolean exist = QIE.ConfirmationMessage();
	
	if (exist) {
		
		ER.ERFSS(testname, "Pass", "Quick Item Entry is added to cart");
	}
	else {
		
		ER.ERFSS(testname, "Fail", "Quick Item Entry is not added to cart");
				
	}
	
	log.info(testname + "Executed Successfully");
	
	}
	
	catch (Exception e) {
		
		ER.ERFSS(testname, "Exception", e.getMessage());
		
		log.error (testname + "Execution Failed" + e.getMessage());
		
	}}
}