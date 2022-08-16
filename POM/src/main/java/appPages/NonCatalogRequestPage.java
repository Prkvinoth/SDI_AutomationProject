package appPages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;

import reusable.BaseClass;
import utilities.SeleniumActions;

public class NonCatalogRequestPage extends BaseClass {

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
		
		
	public boolean NonCatalogPageTitle () throws InterruptedException, IOException, AWTException {
	
	Base.LocatorDataRead();
		
	HashMap<String,String> Locator = LocatorDataRead();
	
	boolean exist = Actions.IsExists(Locator.get("PageTitle"));
	
	return exist;
	
		
}}

 