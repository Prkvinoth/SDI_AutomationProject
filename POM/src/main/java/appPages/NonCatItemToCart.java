package appPages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import reusable.BaseClass;
import utilities.SeleniumActions;

public class NonCatItemToCart extends BaseClass {
	
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
	
		public void MfgName (String testname) throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Base.TestDataRead();
		
		Map<String, Map<String,String>> TestData = TestDataRead();
		
		int RI = RowIndexTestData(testname);
		
		String R = String.valueOf(RI);
		
		Actions.SendKeys(Locator.get("ManufacturerName"), TestData.get(R).get("ManufacturerName"));
		
	}
	
	public void MfgPart (String testname) throws InterruptedException, IOException, AWTException {
			
			Base.LocatorDataRead();
			
			HashMap<String,String> Locator = LocatorDataRead();
			
			Base.TestDataRead();
			
			Map<String, Map<String,String>> TestData = TestDataRead();
			
			int RI = RowIndexTestData(testname);
			
			String R = String.valueOf(RI);
			
			Actions.SendKeys(Locator.get("ManufacturerPartNumber"), TestData.get(R).get("ManufacturerPartNumber"));
				
		}
	
	public void RecSup (String testname) throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Base.TestDataRead();
		
		Map<String, Map<String,String>> TestData = TestDataRead();
		
		int RI = RowIndexTestData(testname);
		
		String R = String.valueOf(RI);
		
		Actions.SendKeys(Locator.get("RecommendedSupplier"), TestData.get(R).get("RecommendedSupplier"));
		
	}
	
        public void SupPart (String testname) throws InterruptedException, IOException, AWTException {
		
		Base.LocatorDataRead();
		
		HashMap<String,String> Locator = LocatorDataRead();
		
		Base.TestDataRead();
		
		Map<String, Map<String,String>> TestData = TestDataRead();
		
		int RI = RowIndexTestData(testname);
		
		String R = String.valueOf(RI);
		
		Actions.SendKeys(Locator.get("SupplierPartNumber"), TestData.get(R).get("SupplierPartNumber"));
		
	}
	    public void Description (String testname) throws InterruptedException, IOException, AWTException {
			
	    Base.LocatorDataRead();
			
		HashMap<String,String> Locator = LocatorDataRead();
			
		Base.TestDataRead();
			
		Map<String, Map<String,String>> TestData = TestDataRead();
			
		int RI = RowIndexTestData(testname);
			
		String R = String.valueOf(RI);
			
		Actions.SendKeys(Locator.get("Description"), TestData.get(R).get("Description"));
				
		}
		
	    public void Quantity (String testname) throws InterruptedException, IOException, AWTException {
	    		
	    Base.LocatorDataRead();
	    		
	    	HashMap<String,String> Locator = LocatorDataRead();
	    		
	    		Base.TestDataRead();
	    		
	    		Map<String, Map<String,String>> TestData = TestDataRead();
	    		
	    		int RI = RowIndexTestData(testname);
	    		
	    		String R = String.valueOf(RI);
	    		
	    		Actions.SendKeys(Locator.get("Quantity"), TestData.get(R).get("Quantity"));
	        }
	   
	    public void UOM (String testname) throws InterruptedException, IOException, AWTException {
    		
		    Base.LocatorDataRead();
		    		
		    	HashMap<String,String> Locator = LocatorDataRead();
		    		
		    		Base.TestDataRead();
		    		
		    		Map<String, Map<String,String>> TestData = TestDataRead();
		    		
		    		int RI = RowIndexTestData(testname);
		    		
		    		String R = String.valueOf(RI);      
	    
		    		Actions.DDSelect(Locator.get("UOMValue"));
		    		
	    }
	    
	    public void UploadFile (String testname) throws InterruptedException, IOException, AWTException {
	    	
	    	Base.LocatorDataRead();
    		
	    	HashMap<String,String> Locator = LocatorDataRead();
	    	
	    	Base.TestDataRead();

	    	Map<String, Map<String,String>> TestData = TestDataRead();
	    	
	    	int RI = RowIndexTestData(testname);
	    	
	    	String R = String.valueOf(RI);
	    	
	    	Actions.SendKeys(Locator.get("BrowseClick"), TestData.get(R).get("Attachment"));
   }
	    	
          public void WaitSave() throws InterruptedException, IOException, AWTException {
	    	
	    	Base.LocatorDataRead();
    		
	    	HashMap<String,String> Locator = LocatorDataRead();
	    		
	    	Actions.ExplicitWait(20, Locator.get("Save&Done"), "visibilityOfElementLocated");	
	    
          } 
	    
	    public void Save_Done () throws InterruptedException, IOException, AWTException {
	    		
	    		Base.LocatorDataRead();
	    		
	    		HashMap<String,String> Locator = LocatorDataRead();
	    		
	    		Actions.Click(Locator.get("Save&Done"));
	        }
	        
	        
	        public void Wait () throws InterruptedException, IOException, AWTException {
	    		
	    	Base.LocatorDataRead();
	    		
	    	HashMap<String,String> Locator = LocatorDataRead();
	    		
	    	Actions.ExplicitWait(20, Locator.get("ItemDescription"), "visibilityOfElementLocated");
	    	
	        }
	        
	        public boolean FindItem () throws InterruptedException, IOException, AWTException {
			
			Base.LocatorDataRead();
			
			HashMap<String,String> Locator = LocatorDataRead();
			
			boolean exist = Actions.IsExists(Locator.get("ItemDescription"));
			
			return exist;
		}}
