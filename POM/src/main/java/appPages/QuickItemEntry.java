package appPages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import reusable.BaseClass;
import utilities.SeleniumActions;

public class QuickItemEntry extends BaseClass {

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
	
	public void SearchField (String testname) throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Base.TestDataRead();
	
		Map<String, Map<String,String>> TestData = TestDataRead();
		
		int RI = RowIndexTestData(testname);
		
		String R = String.valueOf(RI);
		
		Actions.SendKeys(Locator.get("SearchField"), TestData.get(R).get("SearchField"));
		
}	
	public void WaitSI () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
			
		HashMap<String,String> Locator= LocatorDataRead();
		
		Actions.ExplicitWait(40, Locator.get("SearchIcon"), "visibilityOfElementLocated");
		
	}
	
	public void SearchClick () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Actions.Click(Locator.get("SearchIcon"));
		
	}
		
		
	public void WaitPopup () throws InterruptedException, IOException, AWTException {
			
		Base.LocatorDataRead();
			
		HashMap<String,String> Locator= LocatorDataRead();
		
		Actions.ExplicitWait(40, Locator.get("Quantity1"), "visibilityOfElementLocated");
		
	}
	
	public void EnterQty (String testname) throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Base.TestDataRead();
	
		Map<String, Map<String,String>> TestData = TestDataRead();
		
		int RI = RowIndexTestData(testname);
		
		String R = String.valueOf(RI);
		
		Actions.SendKeys(Locator.get("Quantity1"), TestData.get(R).get("Quantity1"));
	
 }
	public void WaitSubmit () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
			
		HashMap<String,String> Locator= LocatorDataRead();
		
		Actions.ExplicitWait(50, Locator.get("Submit"), "visibilityOfElementLocated");
		
	}
	
	//public void WaitSubmit1 () throws InterruptedException, IOException, AWTException {
		
		//Base.LocatorDataRead();
			
		//HashMap<String,String> Locator= LocatorDataRead();
		
		//Actions.ExplicitWait(40, Locator.get("Submit"), "elementToBeClickable");
		
	//}
	
	
	
	
	public void SubmitClick () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement findElement = driver.findElement(By.xpath("//div[@class='col-md-12 text-center mb-2']/button"));
		
		js.executeScript("arguments[0].scrollIntoView();",findElement );
		
		Actions.Click(Locator.get("Submit"));
		
		
	}
	
	public void WaitSM () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
			
		HashMap<String,String> Locator= LocatorDataRead();
		
		Actions.ExplicitWait(40, Locator.get("SuccessMessage"), "visibilityOfElementLocated");
		
	}
	
	public boolean ConfirmationMessage () throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		boolean exist = Actions.IsExists(Locator.get("SuccessMessage"));
		
		return exist;
	}}

