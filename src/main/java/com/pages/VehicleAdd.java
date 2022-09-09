package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementUtil;

public class VehicleAdd {
	public WebDriver driver;
	public VehicleAdd(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@for='CopyVIN']") WebElement Add_Vinlbl;
	@FindBy(xpath="//input[@id='CopyVIN']") WebElement Add_VIntxt;
	
	@FindBy(xpath="//label[@for='CopyUnitNo']") WebElement Add_UnitNolbl;
	@FindBy(xpath="//input[@id='CopyUnitNo']") WebElement Add_UnitNotxt;
	
	@FindBy(xpath="//label[@for='CopyPlateNo']") WebElement Add_PlateNolbl;
	@FindBy(xpath="//input[@id='CopyPlateNo']") WebElement Add_PlateNotxt;
	
	@FindBy(xpath="//input[@id='btnSearch']") WebElement Add_Searchbtn;
	
	@FindBy(xpath="//label[@for='NoOfVehicle']") WebElement Add_NoOfVehicleslbl;
	@FindBy(xpath="//input[@id='NoOfVehicle']") WebElement Add_NoOfVehiclestxt;
	
	@FindBy(xpath="//label[@for='RegistrantType']") WebElement Add_RegistrationTypelbl;
	@FindBy(xpath="//select[@id='RegistrantType']") WebElement Add_RegistrationTypedd;
	
	@FindBy(xpath="//label[@for='VehDtlUnitNo']") WebElement Add_Details_UnitNolbl;
	@FindBy(xpath="//input[@id='VehDtlUnitNo']") WebElement Add_Details_UnitNotxt;
	
	@FindBy(xpath="//label[@for='VehDtlWeightGroupNo']") WebElement Add_Details_WeightGroupNolbl;
	@FindBy(xpath="//select[@id='VehDtlWeightGroupNo']") WebElement Add_Details_WeightGroupNodd;
	
	@FindBy(xpath="//label[@for='VehDtlYear']") WebElement Add_Details_Yearlbl;
	@FindBy(xpath="//input[@id='VehDtlYear']") WebElement Add_Details_Yeartxt;
	@FindBy(xpath="//label[@for='VehDtlBodyStyle']") WebElement Add_Details_BodyTypelbl;
	@FindBy(xpath="//select[@id='VehDtlBodyStyle']") WebElement Add_Details_BodyTypedd;
	
	@FindBy(xpath="//label[@for='VehDtlMake']") WebElement Add_Details_Makelbl;
	@FindBy(xpath="//select[@id='VehDtlMake']") WebElement Add_Details_Makedd;
	@FindBy(xpath="//label[@id='VehDtlAxles']") WebElement Add_Details_Axlelbl;
	@FindBy(xpath="//input[@id='VehDtlAxles']") WebElement Add_Details_Axletxt;
	
	
	@FindBy(xpath="//label[@id='VehDtlCombinedAxles']") WebElement Add_Details_CombinedAxlelbl;
	@FindBy(xpath="//input[@id='VehDtlCombinedAxles']") WebElement Add_Details_CombinedAxletxt;
	
	@FindBy(xpath="//label[@id='VehDtlFuleType']") WebElement Add_Details_FuelTypelbl;
	@FindBy(xpath="//select[@id='VehDtlFuleType']") WebElement Add_Details_FuelTypedd;
	
	
	@FindBy(xpath="//label[@id='VehDtlSeats']") WebElement Add_Details_Seatslbl;
	@FindBy(xpath="//input[@id='VehDtlSeats']") WebElement Add_Details_Seatstxt;
	
	@FindBy(xpath="//label[@id='VehDtlColor']") WebElement Add_Details_Colorlbl;
	@FindBy(xpath="//select[@id='VehDtlColor']") WebElement Add_Details_Colordd;
	
	@FindBy(xpath="//label[@id='VehDtlUnladenWeight']") WebElement Add_Details_unladenWeightlbl;
	@FindBy(xpath="//input[@id='VehDtlUnladenWeight']") WebElement Add_Details_unladenWeighttxt;
	
	@FindBy(xpath="//label[@id='VehDtlMaxDesiredWeight']") WebElement Add_Details_GrossWeightlbl;
	@FindBy(xpath="//input[@id='VehDtlMaxDesiredWeight']") WebElement Add_Details_GrossWeighttxt;

	@FindBy(xpath="//label[@id='PurchaseDate']") WebElement Add_Details_PurchaseDatelbl;
	@FindBy(xpath="//input[@id='PurchaseDate']") WebElement Add_Details_PurchaseDatedtpickert;

	@FindBy(xpath="//label[@id='PurchasePrice']") WebElement Add_Details_PurchasePricelbl;
	@FindBy(xpath="//input[@id='PurchasePrice']") WebElement Add_Details_PurchasePricetxt;

	@FindBy(xpath="//label[@id='FactoryPrice']") WebElement Add_Details_FactoryPricelbl;
	@FindBy(xpath="//input[@id='FactoryPrice']") WebElement Add_Details_FactoryPricetxt;

	@FindBy(xpath="//label[@id='IsTearIndicator']") WebElement Add_Details_TVRlbl;
	@FindBy(xpath="//input[@id='IsTearIndicator']") WebElement Add_Details_TVRchk;

	@FindBy(xpath="//label[@id='NoOfDays']") WebElement Add_Details_TVRDayslbl;
	@FindBy(xpath="//input[@id='NoOfDays']") WebElement Add_Details_TVRDaystxt;

	@FindBy(xpath="//label[@id='VehDtlTitleJurisdiction']") WebElement Add_Details_TitleJurisdictionlbl;
	@FindBy(xpath="//select[@id='VehDtlTitleJurisdiction']") WebElement Add_Details_TitleJurisdictiondd;
	
	@FindBy(xpath="//label[@id='VehDtlTitleNo']") WebElement Add_Details_TitleNolbl;
	@FindBy(xpath="//input[@id='VehDtlTitleNo']") WebElement Add_Details_TitleNotxt;
	
	@FindBy(xpath="//label[@id='VehDtlCountyPlateType']") WebElement Add_Details_InStatePlateTypelbl;
	@FindBy(xpath="//select[@id='VehDtlCountyPlateType']") WebElement Add_Details_InStatePlateTypedd;

	@FindBy(xpath="//label[@id='VehDtlCountyWeight']") WebElement Add_Details_InStateWeightlbl;
	@FindBy(xpath="//input[@id='VehDtlCountyWeight']") WebElement Add_Details_InStateWeighttxt;

	@FindBy(xpath="//label[@id='CountyPlateExpiration']") WebElement Add_Details_InstateExpirationDatelbl;
	@FindBy(xpath="//input[@id='CountyPlateExpiration']") WebElement Add_Details_InstateExpirationDatedtPicker;

	@FindBy(xpath="//label[@id='VehDtlCountyPlate']") WebElement Add_Details_InStatePlatelbl;
	@FindBy(xpath="//input[@id='VehDtlCountyPlate']") WebElement Add_Details_InStatePlatetxt;;

	@FindBy(xpath="//label[@id='CountyFee']") WebElement Add_Details_InStateFeelbl;
	@FindBy(xpath="//input[@id='CountyFee']") WebElement Add_Details_InStateFeetxt;

	@FindBy(xpath="//label[@id='OwnerDtlName']") WebElement Add_Details_OwnerNamelbl;
	@FindBy(xpath="//input[@id='OwnerDtlName']") WebElement Add_Details_OwnerNametxt;

	@FindBy(xpath="//label[@id='OwnerPhoneNo']") WebElement Add_Details_OwnerPhoneNolbl;
	@FindBy(xpath="//input[@id='OwnerPhoneNo']") WebElement Add_Details_OwnerPhoneNotxt;
	
	@FindBy(xpath="//label[@id='LeaseOrOwner']") WebElement Add_Details_SafetyResponsibilitylbl;
	@FindBy(xpath="//select[@id='LeaseOrOwner']") WebElement Add_Details_SafetyResponsibilitydd;

	@FindBy(xpath="//label[@id='IsLease']") WebElement Add_Details_IsLeaselbl;
	@FindBy(xpath="//input[@id='IsLease']") WebElement Add_Details_IsLeasechk;

	@FindBy(xpath="//label[@id='VehDtlSafetyUsdot']") WebElement Add_Details_SafetyUSDOTlbl;
	@FindBy(xpath="//input[@id='VehDtlSafetyUsdot']") WebElement Add_Details_SafetyUSDOTtxt;
	
	@FindBy(xpath="//label[@id='VehDtlSafetyTin']") WebElement Add_Details_SafetyTPIDlbl;
	@FindBy(xpath="//input[@id='VehDtlSafetyTin']") WebElement Add_Details_SafetyTPIDtxt;
	
	@FindBy(xpath="//label[@id='SaftyChangeDuringYear']") WebElement Add_Details_SafetyChangelbl;
	@FindBy(xpath="//select[@id='SaftyChangeDuringYear']") WebElement Add_Details_SafetyChangedd;
	
	@FindBy(xpath="//label[@id='IsUseExistingPlate']") WebElement Add_Details_UseExistingPlatelbl;
	@FindBy(xpath="//input[@id='IsUseExistingPlate']") WebElement Add_Details_UseExistingPlatechk;

	@FindBy(xpath="//label[@id='ExistingPlate']") WebElement Add_Details_ExistingPlatelbl;
	@FindBy(xpath="//input[@id='ExistingPlate']") WebElement Add_Details_ExistingPlatetxt;

	@FindBy(xpath="//label[@id='VehDtlIsChangeUsdotAddress']") WebElement Add_Details_ChangeUSDOTAddresslbl;
	@FindBy(xpath="//input[@id='VehDtlIsChangeUsdotAddress']") WebElement Add_Details_ChangeUSDOTAddresschk;
	
	@FindBy(xpath="//label[@id='CabCardFeeOverride']") WebElement Add_Details_GradeCrossingFeelbl;
	@FindBy(xpath="//input[@id='CabCardFeeOverride']") WebElement Add_Details_GradeCrossingFeechk;
	
	@FindBy(xpath="//label[@id='TAFeeOverride']") WebElement Add_Details_Bicenetenniallbl;
	@FindBy(xpath="//input[@id='TAFeeOverride']") WebElement Add_Details_Bicenetenniallchk;
	
	@FindBy(xpath="//label[@id='SecondPlateF']") WebElement Add_Details_SecondPlatelbl;
	@FindBy(xpath="//input[@id='SecondPlateF']") WebElement Add_Details_SecondPlatechk;

	@FindBy(xpath="//label[@id='SecondPlateFeeOverrideF']") WebElement Add_Details_SecondPlateFeelbl;
	@FindBy(xpath="//input[@id='SecondPlateFeeOverrideF']") WebElement Add_Details_SecondPlateFeechk;

	@FindBy(xpath="//label[@id='ColoradoDistanceFlag']") WebElement AddVehicle_Colorado10KIndicatorlbl;
	@FindBy(xpath="//select[@id='ColoradoDistanceFlag']") WebElement AddVehicle_Colorado10KIndicatordd;
	@FindBy(xpath="//label[@id='ColoradoTrailerFlag']") WebElement AddVehicle_ColoradoTrailerlbl;
	@FindBy(xpath="//select[@id='ColoradoTrailerFlag']") WebElement AddVehicle_ColoradoTrailerdd;
	@FindBy(xpath="//label[@id='UTSpecialTruckFlag']") WebElement AddVehicle_UtahSpecialTrucklbl;
	@FindBy(xpath="//select[@id='UTSpecialTruckFlag']") WebElement AddVehicle_UtahSpecialTruckdd;
	@FindBy(xpath="//label[@id='NewUsedF']") WebElement AddVehicle_NewVehiclelbl;
	@FindBy(xpath="//select[@id='NewUsedF']") WebElement AddVehicle_NewVehicledd;
	@FindBy(xpath="//label[@id='CoSpecialTruck']") WebElement AddVehicle_COSpecialTrucklbl;
	@FindBy(xpath="//select[@id='CoSpecialTruck']") WebElement AddVehicle_COSpecialTruckdd;
	
	//Documentation Requirement Tracking
			@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[6]") WebElement AddVehicle_TrackingSubHdr;
			@FindBy(xpath="//label[@for='HVUTForm2290']") WebElement AddVehicle_HVUTForm2290lbl;
			@FindBy(xpath="//select[@id='HVUTForm2290']") WebElement AddVehicle_HVUTForm2290dd;
			
			@FindBy(xpath="//label[@for='LeaseContract']") WebElement AddVehicle_LeaseContractlbl;
			@FindBy(xpath="//select[@id='LeaseContract']") WebElement AddVehicle_LeaseContractdd;
			
			@FindBy(xpath="//label[@for='TitleDocument']") WebElement AddVehicle_TitleDocumentlbl;
			@FindBy(xpath="//select[@id='TitleDocument']") WebElement AddVehicle_TitleDocumentdd;
			
			@FindBy(xpath="//label[@for='PlateReturndoc']") WebElement AddVehicle_PlateReturndocbl;
			@FindBy(xpath="//select[@id='PlateReturndoc']") WebElement AddVehicle_PlateReturndocdd;
			
			@FindBy(xpath="//label[@for='AffidavitDoc']") WebElement AddVehicle_AffidavitDoclbl;
			@FindBy(xpath="//select[@id='AffidavitDoc']") WebElement AddVehicle_AffidavitDocdd;
		
	

public void enterVINNumber(String VinNumberValue) {
	ElementUtil.webEditTxtChange(Add_VIntxt, VinNumberValue);
}

public void clickSearch() {
	ElementUtil.clickElement(Add_Searchbtn);
}

public void enterDetailsUnitNumber(String UnitNumberValue) {
	ElementUtil.webEditTxtChange(Add_Details_UnitNotxt, UnitNumberValue);
}
public void selectBodyType(String BodyTypeValue) {
	ElementUtil.selectFromDropdownByVisibleText(Add_Details_BodyTypedd, BodyTypeValue);
}
public void selectWeightGroupNumber(String BodyTypeValue) {
	ElementUtil.selectFromDropdownByVisibleText(Add_Details_WeightGroupNodd, BodyTypeValue);
}

public void enterYear(String YearValue) {
	ElementUtil.webEditTxtChange(Add_Details_Yeartxt, YearValue);
}
public void selectMake(String MakeValue) {
	ElementUtil.selectFromDropdownByVisibleText(Add_Details_Makedd, MakeValue);
}

public void enterAxle(String AxleValue) {
	ElementUtil.webEditTxtChange(Add_Details_Axletxt, AxleValue);
}

public void enterCombinedAxle(String combinedAxleValue) {
	ElementUtil.webEditTxtChange(Add_Details_CombinedAxletxt, combinedAxleValue);
}

public void selectFuelType(String FuelTypeValue) {
	ElementUtil.selectFromDropdownByVisibleText(Add_Details_FuelTypedd, FuelTypeValue);
}

public void selectColor(String ColorValue) {
	ElementUtil.selectFromDropdownByVisibleText(Add_Details_Colordd, ColorValue);
}

public void enterUnladenWeight(String UnladeWeightValue) {
	ElementUtil.webEditTxtChange(Add_Details_unladenWeighttxt, UnladeWeightValue);
}
public void enterPurchaseDate(String PurchaseDateValue) {
	ElementUtil.webEditTxtChange(Add_Details_PurchaseDatedtpickert, PurchaseDateValue);
}
public void enterPurchaseprice(String PurchasePriceValue) {
	ElementUtil.webEditTxtChange(Add_Details_PurchasePricetxt, PurchasePriceValue);
}

public void enterFactoryPrice(String FactoryPriceValue) {
	ElementUtil.webEditTxtChange(Add_Details_FactoryPricetxt, FactoryPriceValue);
}

public void checkTVR() {
	ElementUtil.webCheckON(Add_Details_TVRchk);
}

public void enterTVRDays(String TVRDaysValue) {
	ElementUtil.webEditTxtChange(Add_Details_TVRDaystxt, TVRDaysValue);
}

public void selectTitleJurisdiction(String TitleJurisdictionValue) {
	ElementUtil.selectFromDropdownByVisibleText(Add_Details_TitleJurisdictiondd, TitleJurisdictionValue);
}

public void enterTitleNo(String TitleNumberValue) {
	ElementUtil.webEditTxtChange(Add_Details_TitleNotxt, TitleNumberValue);
}
public void selectInStatePlateType(String InStatePlateTypeValue) {
	ElementUtil.selectFromDropdownByVisibleText(Add_Details_InStatePlateTypedd, InStatePlateTypeValue);
}

public void enterInStatePlateWeight(String InStatePlateWeightValue) {
	ElementUtil.webEditTxtChange(Add_Details_InStateWeighttxt, InStatePlateWeightValue);
}
public void enterInStateExpirationDate(String InStateExpirationDateValue) {
	ElementUtil.webEditTxtChange(Add_Details_InstateExpirationDatedtPicker, InStateExpirationDateValue);
}
public void enterInStatePlate(String InStatePlateValue) {
	ElementUtil.webEditTxtChange(Add_Details_InStatePlatetxt, InStatePlateValue);
}
public void enterInStateFee(String InStateFeeValue) {
	ElementUtil.webEditTxtChange(Add_Details_InStateFeetxt, InStateFeeValue);
}

public void enterOwnerName(String InSlatePlateValue) {
	ElementUtil.webEditTxtChange(Add_Details_OwnerNametxt, InSlatePlateValue);
}
public void enterOwnerPhoneNumber(String InSlateFeeValue) {
	ElementUtil.webEditTxtChange(Add_Details_OwnerPhoneNotxt, InSlateFeeValue);
}
public void selectSafetyResponsibility(String SafetyResponsibilityValue) {
	ElementUtil.selectFromDropdownByVisibleText(Add_Details_SafetyResponsibilitydd, SafetyResponsibilityValue);
}

public void checkLease() {
	ElementUtil.webCheckON(Add_Details_IsLeasechk);
}
public void enterSafetyUSDOT(String SafetyUSDOTValue) {
	ElementUtil.webEditTxtChange(Add_Details_SafetyUSDOTtxt, SafetyUSDOTValue);
}
public void enterSafetyTPID(String SafetyTPIDValue) {
	ElementUtil.webEditTxtChange(Add_Details_SafetyTPIDtxt, SafetyTPIDValue);
}
public void selectSafetyChange(String SafetyChangeValue) {
	ElementUtil.selectFromDropdownByVisibleText(Add_Details_SafetyChangedd, SafetyChangeValue);
}
public void checkExistingPlate() {
	ElementUtil.webCheckON(Add_Details_UseExistingPlatechk);
}

public void enterExistingPlate(String ExistingPlateValue) {
	ElementUtil.webEditTxtChange(Add_Details_ExistingPlatetxt, ExistingPlateValue);
}

public void checkChangeUSDOTAddress() {
	ElementUtil.webCheckON(Add_Details_ChangeUSDOTAddresschk);
}
public void checkGradeCrossingFee() {
	ElementUtil.webCheckON(Add_Details_GradeCrossingFeechk);
}
public void checkBicenetenniall() {
	ElementUtil.webCheckON(Add_Details_Bicenetenniallchk);
}
public void checkSecondPlate() {
	ElementUtil.webCheckON(Add_Details_SecondPlatechk);
}
public void checkSecondPlateFee() {
	ElementUtil.webCheckON(Add_Details_SecondPlateFeechk);
}

public void selectColorado10kIndicator(String Colorado10kIndicatorddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_Colorado10KIndicatordd,Colorado10kIndicatorddValue);
}

public void selectColoradoTrailer(String ColoradoTrailerddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_ColoradoTrailerdd,ColoradoTrailerddValue);
}

public void selectUtahSpecialTruck(String UtahSpecialTruckddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_UtahSpecialTruckdd,UtahSpecialTruckddValue);
}

public void selectCNewVehicle(String NewVehicleddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_NewVehicledd,NewVehicleddValue);
}

public void selectCOSpecialTruck(String COSpecialTruckddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_COSpecialTruckdd,COSpecialTruckddValue);
}

public void selectHVUTForm2290(String HVUTForm2290ddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_HVUTForm2290dd,HVUTForm2290ddValue);
}

public void selectLeaseContract(String LeaseContractddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_LeaseContractdd,LeaseContractddValue);
}
public void selectTitleDocument(String TitleDocumentddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_TitleDocumentdd,TitleDocumentddValue);
}
public void selectPlateReturndoc(String PlateReturndocddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_PlateReturndocdd,PlateReturndocddValue);
}

public void selectAffidavitDoc(String AffidavitDocddValue) {
	ElementUtil.selectFromDropdownByVisibleText(AddVehicle_AffidavitDocdd,AffidavitDocddValue);
}
}
