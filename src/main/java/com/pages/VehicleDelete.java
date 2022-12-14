package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementUtil;

public class VehicleDelete {
	public WebDriver driver;
	public VehicleDelete(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement AmendVehicle_SupplementDetailsSubHdr;
	@FindBy(xpath="//label[@for='NoOfDeletedVehicle']") WebElement DeleteVehicle_DeletedVehiclelbl;
	@FindBy(xpath="//input[@id='NoOfDeletedVehicle']") WebElement DeleteVehicle_DeletedVehicletxt;
	
	
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement AmendVehicle_VehicleSearchSubHdr;
	@FindBy(xpath="//label[@for='UnitNbr']") WebElement DeleteVehicle_UnitNumberlbl;
	@FindBy(xpath="//input[@id='UnitNbr']") WebElement DeleteVehicle_UnitNumbertxt;
	
	@FindBy(xpath="//label[@for='VIN']") WebElement DeleteVehicle_VINlbl;
	@FindBy(xpath="//input[@id='VIN']") WebElement DeleteVehicle_VINtxt;
	
	@FindBy(xpath="//label[@for='PlateNbr']") WebElement DeleteVehicle_PlateNbrlbl;
	@FindBy(xpath="//input[@id='PlateNbr']") WebElement DeleteVehicle_PlateNbrtxt;
	@FindBy(xpath="//input[@id='btnFind']") WebElement DeleteVehicle_Searchbtn;
	
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement AmendVehicle_ListOfActiveVehicleSubHdr;
	
	@FindBy(xpath="//th[@aria-label='Select']") WebElement DeleteVehicle_Selecttbl;
	@FindBy(xpath="//th[contains(@aria-label,'Unit')]") WebElement DeleteVehicle_Unittbl;
	@FindBy(xpath="//th[contains(@aria-label,'VIN')]") WebElement DeleteVehicle_VINtbl;
	@FindBy(xpath="//th[contains(@aria-label,'Plate No')]") WebElement DeleteVehicle_PlateNotbl;
	@FindBy(xpath="//th[contains(@aria-label,'Plate Status')]") WebElement DeleteVehicle_PlateStatustbl;
	@FindBy(xpath="//th[contains(@aria-label,'Inactive')]") WebElement DeleteVehicle_InactiveDatetbl;
	@FindBy(xpath="//th[contains(@aria-label,'Returned')]") WebElement DeleteVehicle_PlateReturnedDocumenttbl;
	@FindBy(xpath="//th[contains(@aria-label,'Affidavit')]") WebElement DeleteVehicle_AffidavitDocumenttbl;
	@FindBy(xpath="//th[contains(@aria-label,'Comment')]") WebElement DeleteVehicle_Commenttbl;
	@FindBy(xpath="//th[contains(@aria-label,'Waive')]") WebElement DeleteVehicle_WaiveBasejurisdictionCredittbl;
	
	
	@FindBy(xpath="//input[contains(@id,'DeletedVehicleVMList') and  contains(@id,'SelectFlag')]")WebElement DeleteVehicle_Checkboxchk;
	@FindBy(xpath="//select[contains(@id,'DeletedVehicleVMList') and  contains(@id,'PlateStatusFlag')]") WebElement DeleteVehicle_StatusPlatedd;
	@FindBy(xpath="//input[contains(@name,'DeleteDate')]") WebElement DeleteVehicle_InactiveDateddpicker;
	@FindBy(xpath="//select[contains(@id,'PlateReturnDocumentFlag')]") WebElement DeleteVehicle_PlateReturnedDocumentdd;
	@FindBy(xpath="//select[contains(@id,'AffidavitDoc')]") WebElement DeleteVehicle_AffidavitDocdd;
	@FindBy(xpath="//textarea[contains(@id,'Comment')]") WebElement DeleteVehicle_Commenttxt;
	
	@FindBy(xpath="//input[@id='btnVehicleList']") WebElement DeleteVehicle_VehicleListbtn;
	@FindBy(xpath="//table[@id='DeleteVehicleGrid']/tbody/tr") List<WebElement> DeleteVehicle_RowinTable;
	@FindBy(xpath="//td[contains(@class,'leftAlign')]") List<WebElement> DeleteCellsinaRow;
	
	public void enterUnitNo(String UnitNumbertxtValue) {
		ElementUtil.webEditTxtChange(DeleteVehicle_UnitNumbertxt,UnitNumbertxtValue);
	}
	public void clickonSearch() {
		ElementUtil.clickElement(DeleteVehicle_Searchbtn);
	}
	//Fetch the Row Number based on the Unit Value
	@SuppressWarnings("null")
	public  int selectRowinaTable(String Unitvalue) {
		int i;
		int j;
		//int[] arr = null;
		System.out.println("DeleteVehicle_RowinTable.size() is:"+DeleteVehicle_RowinTable.size());
		for(i=1;i<=DeleteVehicle_RowinTable.size();i++) {
			List<WebElement>cellvalueineachrow=driver.findElements(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+i+"]//td[contains(@class,'leftAlign')]"));
			//starting the loop from 2 because the Row contains checkbox for which text doesn't contain in locators
			System.out.println("cellvalueineachrow is:"+cellvalueineachrow.size());
			for(j=1;j<=cellvalueineachrow.size();j++) {
				//System.out.print(driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+i+"]//td[contains(@class,'leftAlign')]["+j+"]")).getText());
				if(driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+i+"]//td[contains(@class,'leftAlign')]["+j+"]")).getText().equalsIgnoreCase(Unitvalue)) 
				//	if(cellvalueineachrow.get(j).getText().equalsIgnoreCase(Unitvalue)) {
					break;
				//arr[0]=i;
				//arr[1]=j;
			}
			break;

		}
		return i;
	}
	
	public void ClickCheckBoxFromGrid() {
		ElementUtil.clickElement(DeleteVehicle_Checkboxchk);
	}
	
	public void selectPlateStatus(String PlateStatusValue) {
		ElementUtil.selectFromDropdownByVisibleText(DeleteVehicle_StatusPlatedd,PlateStatusValue);
	}
	public void selectPlateReturnedDocument(String PlateReturnedDocumentValue) {
		ElementUtil.selectFromDropdownByVisibleText(DeleteVehicle_PlateReturnedDocumentdd,PlateReturnedDocumentValue);
	}
	public void selectAffidavitDocument(String AffidavitDocumentValue) {
		ElementUtil.selectFromDropdownByVisibleText(DeleteVehicle_AffidavitDocdd,AffidavitDocumentValue);
	}
	
	public void entercomments(String commentsValue) {
		ElementUtil.webEditTxt(DeleteVehicle_Commenttxt, commentsValue);
	}
	
	public void clickVehicleList() {
		ElementUtil.clickElement(DeleteVehicle_VehicleListbtn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
