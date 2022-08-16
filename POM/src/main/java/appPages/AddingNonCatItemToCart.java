package appPages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.bouncycastle.asn1.dvcs.Data;

import reusable.BaseClass;
import utilities.SeleniumActions;

public class AddingNonCatItemToCart extends BaseClass {

	SeleniumActions Actions = new SeleniumActions();
	
	BaseClass Base = new BaseClass();
	
	public void LogoClick () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Actions.Click(Locator.get("LogoClick"));
		
	}
	
	public void WaitNCIcon () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Actions.ExplicitWait(20, Locator.get("NonCatIcon"), "visibilityOfElementLocated");
		
	}

	public void NonCatIconClick () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Actions.Click(Locator.get("NonCatIcon"));
		
	}
	
	public void WaitNCTitle () throws InterruptedException, IOException, AWTException {
			
			Base.LocatorDataRead();
			
			HashMap<String,String> Locator = LocatorDataRead();
			
			Actions.ExplicitWait(20, Locator.get("PageTitle"), "visibilityOfElementLocated");
			
	}
	
	public void AddItemToCart (String testname) throws InterruptedException, IOException, AWTException {
	
	Base.LocatorDataRead();
	
	HashMap<String,String> Locator = LocatorDataRead();
	
	Base.TestDataRead();
	
	Map<String, Map<String,String>> TestData = TestDataRead();
	
	int RI = RowIndexTestData(testname);
	
	String R = String.valueOf(RI);
	
	Actions.SendKeys(Locator.get("ManufacturerName"), TestData.get(R).get("ManufacturerName"));
	
	}
	
		public void AddItemToCart1 (String testname) throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Base.TestDataRead();
		
		Map<String, Map<String,String>> TestData = TestDataRead();
		
		int RI = RowIndexTestData(testname);
		
		String R = String.valueOf(RI);
		
		Actions.SendKeys(Locator.get("ManufacturerPartNumber"), TestData.get(R).get("ManufacturerPartNumber"));
			
	}
	
        public void AddItemToCart2 (String testname) throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Base.TestDataRead();
		
		Map<String, Map<String,String>> TestData = TestDataRead();
		
		int RI = RowIndexTestData(testname);
		
		String R = String.valueOf(RI);
		
		Actions.SendKeys(Locator.get("Description"), TestData.get(R).get("Description"));
			
	}
	
        public void AddItemToCart3 (String testname) throws InterruptedException, IOException, AWTException {
    		
    		Base.LocatorDataRead();
    		
    		HashMap<String,String> Locator = LocatorDataRead();
    		
    		Base.TestDataRead();
    		
    		Map<String, Map<String,String>> TestData = TestDataRead();
    		
    		int RI = RowIndexTestData(testname);
    		
    		String R = String.valueOf(RI);
    		
    		Actions.SendKeys(Locator.get("Quantity"), TestData.get(R).get("Quantity"));
        }
        
        public void AddItemToCart4 (String testname) throws InterruptedException, IOException, AWTException {
    		
    		Base.LocatorDataRead();
    		
    		HashMap<String,String> Locator = LocatorDataRead();
    		
    		Actions.Click(Locator.get("Save&More"));
        }
        
        public void AddItemToCart5 (String testname) throws InterruptedException, IOException, AWTException {
    		
    		Base.LocatorDataRead();
    		
    		HashMap<String,String> Locator = LocatorDataRead();
    		
    		Actions.ExplicitWait(20, Locator.get("ConfirmationMessage"), "visibilityOfElementLocated" );
        }
        
	public boolean ConfirmationMessage () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		boolean exist = Actions.IsExists(Locator.get("ConfirmationMessage"));
		
		return exist;
	}}