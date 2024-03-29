package marchcucumber;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Reuseable_methods {
	static WebDriver driver;

public static void InitializeDriver() throws WebDriverException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Google Drive\\Deekshith Code\\BATCH\\9-JUlY 2018\\workspace\\com.automation.cucumber\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	public static void Launch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	 public static void compareStrings(String S1, String S2) {
		  Assert.assertEquals(S1, S2); 
		}
	public static WebElement findElement(By location,String objName) {
		WebElement obj = null;
		try {
			obj = driver.findElement(location);
			System.out.println("pass: "+objName+" Found on the page");
			//logger.log(LogStatus.PASS, ""+ objName +" Found on the page");
		}
		catch(NoSuchElementException errMessage) {
			System.out.println("Fail: "+objName+" not found on the page");
			//logger.log(LogStatus.FAIL, ""+ objName +" not Found on the page");
		
		}
		return obj;
	}
	
	/* name of the method:   entertext
	 * BriefDescription  :   entering textvalue for textbox
	 * Arguments         :  obj-->object
	 *                      textval--->to be entered 
	 *                      objName--->object name
	 *  createdby        :  Automation team 
	 *  created date     :02/13/19 
	 *  LastModified Date:02/13/19          
	 */
	public static void enterText(WebElement obj,String textval,String objName) throws InterruptedException

	{
		if(obj.isDisplayed())
		{
			Thread.sleep(4000);
			obj.sendKeys(textval);
			System.out.println("pass: "+textval+"value is entered in "+objName+"field");
			//logger.log(LogStatus.PASS,textval+"value is entered in "+objName+"field");
			
		}
		else
		{
			System.out.println("fail:" +objName+ "field does not exist please check application");
			//logger.log(LogStatus.FAIL,textval+objName+"field does not exist please check application");
		}
	}
	
	/* name of the method:   clickobject--->Button
	 * BriefDescription  :   clicking a button
	 * Arguments         :  obj-->object,objName--->object name
	 *  createdby        :  Automation team 
	 *  created date     :02/13/19 
	 *  LastModified Date:02/13/19          
	 */
	public static void clickObj(WebElement obj,String objName)
	{
		if(obj.isDisplayed())
		{
			obj.click();
			System.out.println("pass :" +objName + "button is clicked");
			//logger.log(LogStatus.PASS, objName + "button is clicked");
		}
		else
		{
			System.out.println("Fail:" +objName+"button is not displayed ,please check the application");
			//logger.log(LogStatus.FAIL, objName+ "button is not displayed ,please check the application");
		}
	}
	

/*
 * Name of the method: selectCheckBox
 * Brief Description: Select the checkbox
 * Arguments: obj --> web object, objName--> name of the object
 * Created by: Automation team
 * Creation Date: Feb 12 2019
 * Last Modified: Feb 12 2019
 * */
	public static void selectCheckBox(WebElement obj, String objName) {
		
		if(obj.isDisplayed()) {
			
			if(obj.isSelected()) {
				System.out.println("Pass: "+objName+" is already selected");
			}else{
			obj.click();
			System.out.println("Pass: "+objName+" is selected");
			//logger.log(LogStatus.PASS, objName + "is selected");
		    }}
			else {
			System.out.println("Fail:"+objName+" is not present.Please chk application");	
			//logger.log(LogStatus.FAIL, objName+ " is not displayed ,please check the application");
		}	
	}
	
	/*
	 * Name of the method: selectDropdown
	 * Brief Description: Select the Dropdown list
	 * Arguments: obj --> web object, objName--> name of the object
	 * Created by: Automation team
	 * Creation Date: Feb 12 2019
	 * Last Modified: Feb 12 2019
	 * */
	public static void selectDropdown(WebElement obj, String objName) {
		
		if(obj.isDisplayed()) {
				
				if(obj.isSelected()) {
					System.out.println("Pass: "+objName+" is already selected");
				}else{
				obj.click();
				System.out.println("Pass: "+objName+" is selected");
				//logger.log(LogStatus.PASS, objName + "is selected");
			    }}
				else {
				System.out.println("Fail:"+objName+" is not present.Please chk application");	
				//logger.log(LogStatus.FAIL, objName+ " is not present, please check the application");
					
			}	
			
		}
	
	/*
	 * Name of the method: validateErrormsg
	 * Brief Description: to validate the error msg 
	 * Arguments: actualmsg --> name of the object, errormsg--> name of the object
	 * Created by: Automation team
	 * Creation Date: Feb 12 2019
	 * Last Modified: Feb 12 2019
	 * */
	
	public static void validateErrormsg(String actualmsg, String errormsg) {
		
		if(actualmsg.equals(errormsg))
		{
			System.out.println("TestCase is passed");
			//logger.log(LogStatus.PASS,  "TestCase is passed" );
		}else
	    {
		System.out.println("TestCase is failed");
		//logger.log(LogStatus.FAIL,  "TestCase is failed" );
	    }
	}

/* name of the method:   iFrame
 * BriefDescription  :   iframe using webelement 
 * Arguments         :  driver--->driver 
 *                      obj--->webelement
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */
public static void switchFrame( WebDriver driver,WebElement obj) {
	 
    if(obj.isDisplayed()) {
     driver.switchTo().frame(obj);
     System.out.println("Pass: we can switch to the "+obj+ " frame");
    //logger.log(LogStatus.PASS,  "Switch to frame" );
     
    }else {
     System.out.println("fail: we can't switch to the "+obj+ " frame");
    // logger.log(LogStatus.FAIL,  "Cannot Switch to frame" );
    }
}

/* name of the method:   switchFrameid
 * BriefDescription  :   iframe using webelement 
 * Arguments         :  driver--->driver 
 *                      obj--->iframe id
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */

public static void switchFrameid( WebDriver driver,String obj) {
	 
     driver.switchTo().frame(obj);
     System.out.println("Pass: we can switch to the "+obj+ " frame");
    // logger.log(LogStatus.PASS,  "we can switch to the frame" );
     
    }

/* name of the method:   switchdefaultFrame
 * BriefDescription  :   iframe for switching back to default frame 
 * Arguments         :  driver--->driver 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void switchdefaultFrame( WebDriver driver)
{
driver.switchTo().defaultContent();
System.out.println("Pass: we can switch to the "+ driver + " back to frame");
//logger.log(LogStatus.PASS,  "we can switch back to the frame" );
}

/* name of the method:   mouseOver
 * BriefDescription  :   mouseOver  
 * Arguments         :  obj,index 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 

public static void mouseOver(WebDriver driver,WebElement obj) {
	if(obj.isDisplayed()) {
   Actions action=new Actions(driver);
   action.moveToElement(obj).build().perform();
	System.out.println("Pass: "+obj+" is present");
	//logger.log(LogStatus.PASS,  "obj is present" );
	}
 else {
		System.out.println("Fail:"+obj+" is not present.Please chk application");
		//logger.log(LogStatus.FAIL,  "obj is not present.Please chk application" );
	}
}

/* name of the method:   selectbyText
 * BriefDescription  :   selected by clicking the dropdown 
 * Arguments         :  obj,objName 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void SelectbyText(WebElement we, String VisibleText){
	   if(we.isDisplayed())
	   {
		   Select selObj=new Select(we);
           selObj.selectByVisibleText(VisibleText);
	           System.out.println("Pass: "+VisibleText+ " is Selected by VisibleText" );
	         //  logger.log(LogStatus.PASS, " is Selected by VisibleText" );
	           
	   } 
	   else
	   {
	    System.out.println("Fail: "+VisibleText+ " is not available");
	 //   logger.log(LogStatus.FAIL, " is not Selected by VisibleText" );
	    
	   }
	   
	   
}

/* name of the method:   SelectByValue
 * BriefDescription  :   selectedByValue by clicking the dropdown 
 * Arguments         :  obj,index 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void SelectByValue(WebElement obj, String val) {
	  //if(obj.isSelected()) {
	if(obj.isDisplayed()) {
	   Select selObj=new Select(obj);
	    
	   selObj.selectByValue(val);
	  System.out.println("pass:"+val + " is selected from drop down ");
	 // logger.log(LogStatus.PASS, " is selected from drop down " );
	 
	  }else {
	   System.out.println("Fail:"+val+"is not selected");
	 //  logger.log(LogStatus.FAIL, " is not selected from drop down " );
	  }
	 }	  


/* name of the method:   SelectByindex
 * BriefDescription  :   selected by clicking the dropdown 
 * Arguments         :  obj,index 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void selectByIndex(WebElement obj, int index) {
	  if(obj.isDisplayed()) {
	   Select selObj=new Select(obj);
	  selObj.selectByIndex(index);
	  
	  System.out.println("pass:"+index + " is selected from drop down ");
	//  logger.log(LogStatus.PASS, " is selected from drop down " );
	  }else {
	   System.out.println("Fail:"+index+"is not selected");
	//   logger.log(LogStatus.FAIL, " is not selected from drop down " );
	  }
	 }

public static void selectByVisibleText(WebElement obj, String Name) {
	if(obj.isDisplayed()) {
		 Select drop = new Select(obj);
		 drop.selectByVisibleText(Name);
	 System.out.println("Pass: dropdown is selected");
	 }else {
	 System.out.println("Fail: dropdown is not available check your application");
	 }
	 }



/*
 * Name of the method: Radiobutton
 * Brief Description: To click on the radio button 
 * Arguments: obj --> web object, objName--> name of the object
 * Created by: Automation team
 * Creation Date: Feb 12 2019
 * Last Modified: Feb 12 2019
 * */
public static void Radiobutton(WebElement obj, String objName) {
	
	if(obj.isDisplayed() ){
		obj.click();
		System.out.println("Pass: "+objName+" is clicked");
	}else {
		System.out.println("Fail:"+objName+" is not displayed .Please check your application");			
	}
}

/* name of the method:   switchtoAlert
 * BriefDescription  :   Switch to alert
 * Arguments         :  driver
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void switchtoAlert(WebDriver driver) {
	 driver.switchTo().alert().accept();
	 System.out.println("Pass: alert is present and accept");
}

	
//	public static String[][] readXlData(String path, String string) throws IOException{
//		FileInputStream fs=new FileInputStream(new File(path));
//		HSSFWorkbook wb=new HSSFWorkbook(fs);
//		HSSFSheet sheet=wb.getSheet("Sheet1");
//		int rowCount=sheet.getLastRowNum()+1;
//		int colCount=sheet.getRow(0).getLastCellNum();
//		String[][] data=new String[rowCount][colCount];
//		for(int i=0;i<rowCount;i++){
//			for(int j=0;j<colCount;j++){
//				int cellType=sheet.getRow(i).getCell(j).getCellType();
//				if(cellType==HSSFCell.CELL_TYPE_NUMERIC){
//					int val=(int)sheet.getRow(i).getCell(j).getNumericCellValue();
//					data[i][j]=String.valueOf(val);
//				}
//				else
//					data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
//					
//			}
//		}
//		return (data);
//	}
}
