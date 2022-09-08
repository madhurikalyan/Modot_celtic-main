package Parallel;

import java.io.IOException;
import com.pages.AccountTabPage;
import com.pages.BillingTab;
import com.pages.CommonObjects;
import com.pages.DashBoardPage;
import com.pages.DistanceTabPage;
import com.pages.DistanceVerification;
import com.pages.Financepage;
import com.pages.FleetPage;
import com.pages.FleetTabPage;
import com.pages.InventoryPage;
import com.pages.LoginPage;
import com.pages.Payment;
import com.pages.PaymentTab;
import com.pages.VehicleAmend;
import com.pages.VehicleDelete;
import com.pages.VehicleTabPage;
import com.pages.VehicleVerification;
import com.pages.WeightGroupVerification;
import com.pages.WgtGroup;
import com.pages.WgtGroupAdd;
import com.qa.factory.Driver_Factory;
import com.qa.util.ConfigReader;
import com.qa.util.ElementUtil;
import com.qa.util.ExcelReader;
import io.cucumber.java.en.Then;

public class RWC_002 {
	LoginPage loginpage = new LoginPage(Driver_Factory.getDriver());
	DashBoardPage dashboardpage = new DashBoardPage(Driver_Factory.getDriver());
	AccountTabPage accounttabpage = new AccountTabPage(Driver_Factory.getDriver());
	FleetTabPage fleettabpage = new FleetTabPage(Driver_Factory.getDriver());
	FleetPage fleetpage = new FleetPage(Driver_Factory.getDriver());
	DistanceTabPage distancetabpage = new DistanceTabPage(Driver_Factory.getDriver());
	WgtGroup wgtgroup = new WgtGroup(Driver_Factory.getDriver());
	WgtGroupAdd wgtgroupadd = new WgtGroupAdd(Driver_Factory.getDriver());
	VehicleTabPage Vehicletabpage = new VehicleTabPage(Driver_Factory.getDriver());
	VehicleAmend vehicleAmend =new VehicleAmend(Driver_Factory.getDriver());
	VehicleDelete vehicleDelete =new VehicleDelete(Driver_Factory.getDriver());
	CommonObjects commonobjects = new CommonObjects(Driver_Factory.getDriver());
	BillingTab billingtab = new BillingTab(Driver_Factory.getDriver());
	Payment pay =new Payment(Driver_Factory.getDriver());
	PaymentTab paymenttab = new PaymentTab(Driver_Factory.getDriver());
	InventoryPage inventorypage = new InventoryPage(Driver_Factory.getDriver());
	ExcelReader excel =new ExcelReader();
	int Noof=0;
	Financepage financepage =new Financepage(Driver_Factory.getDriver());
	//FleetVerification fleetverify =new FleetVerification(Driver_Factory.getDriver());
	DistanceVerification Distanceverify=new DistanceVerification(Driver_Factory.getDriver());
	WeightGroupVerification wgtverify= new WeightGroupVerification(Driver_Factory.getDriver());
	VehicleVerification vehicleverify =new VehicleVerification(Driver_Factory.getDriver());
	
	ElementUtil eleutil =new ElementUtil();
	
	
	@Then("User will navigate to renew fleet and search for  Reinstated Account Number")
	public void user_will_navigate_to_renew_fleet_and_search_for_reinstated_account_number() throws IOException, Exception {
		fleetpage.enterAccountNo(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"PreSetup",2,0));
		fleetpage.enterFleetNo(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"PreSetup",2,2));
		fleetpage.enterFleetyear(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"PreSetup",2,3));
		commonobjects.clickProceed();	
		
	}

	@Then("User should navigate to Account screen and provides all the required input to proceed")
	public void user_should_navigate_to_account_screen_and_provides_all_the_required_input_to_proceed() throws Exception {
		eleutil.updateExcel("Account", 0,1,accounttabpage.fetchMCECustomernolbl());
		eleutil.updateExcel("Account", 1,1,accounttabpage.fetchMCECustomerno());
		eleutil.updateExcel("Account", 0,2,accounttabpage.fetchRegistrationTypelbl());
		eleutil.updateExcel("Account", 1,2,accounttabpage.fetchRegistrationType());
		eleutil.updateExcel("Account", 0,3,accounttabpage.fetchAccountCarrierTypelbl());
		eleutil.updateExcel("Account", 1,3,accounttabpage.fetchAccountCarrierType());
		eleutil.updateExcel("Account", 0,5,accounttabpage.fetchIFTAAccountNbrlbl());
		eleutil.updateExcel("Account", 1,5,accounttabpage.fetchIFTAAccountNbr());
		eleutil.updateExcel("Account", 0,6,accounttabpage.fetchAccountCustomerStatuslbl());
		eleutil.updateExcel("Account", 1,6,accounttabpage.fetchAccountCustomerStatus());
		eleutil.updateExcel("Account", 0,8,accounttabpage.fetchAccountStreet0lbl());
		eleutil.updateExcel("Account", 1,8,accounttabpage.fetchAccountStreet0());
		eleutil.updateExcel("Account", 0,9,accounttabpage.fetchAccountZip0lbl());
		eleutil.updateExcel("Account", 1,9,accounttabpage.fetchAccountZip0());
		eleutil.updateExcel("Account", 0,10,accounttabpage.fetchAccountJur0lbl());
		eleutil.updateExcel("Account", 1,10,accounttabpage.fetchAccountJur0());
		eleutil.updateExcel("Account", 0,11,accounttabpage.fetchAccountCity0lbl());
		eleutil.updateExcel("Account", 1,11,accounttabpage.fetchAccountCity0());
		eleutil.updateExcel("Account", 0,12,accounttabpage.fetchAccountCounty0lbl());
		eleutil.updateExcel("Account", 1,12,accounttabpage.fetchAccountCounty0());
		eleutil.updateExcel("Account", 0,13,accounttabpage.fetchAccountCountry0lbl());
		eleutil.updateExcel("Account", 1,13,accounttabpage.fetchAccountCountry0());
		accounttabpage.clickMailingAddress();
		eleutil.updateExcel("Account", 0,14,accounttabpage.fetchAccountStreet1lbl());
		eleutil.updateExcel("Account", 1,14,accounttabpage.fetchAccountStreet1());
		eleutil.updateExcel("Account", 0,15,accounttabpage.fetchAccountZip1lbl());
		eleutil.updateExcel("Account", 1,15,accounttabpage.fetchAccountZip1());
		eleutil.updateExcel("Account", 0,16,accounttabpage.fetchAccountJur1lbl());
		eleutil.updateExcel("Account", 1,16,accounttabpage.fetchAccountJur1());
		eleutil.updateExcel("Account", 0,17,accounttabpage.fetchAccountCity1lbl());
		eleutil.updateExcel("Account", 1,17,accounttabpage.fetchAccountCity1());
		eleutil.updateExcel("Account", 0,18,accounttabpage.fetchAccountCounty1lbl());
		eleutil.updateExcel("Account", 1,18,accounttabpage.fetchAccountCounty1());
		eleutil.updateExcel("Account", 0,19,accounttabpage.fetchAccountCountry1lbl());
		eleutil.updateExcel("Account", 1,19,accounttabpage.fetchAccountCountry1());
		
		eleutil.updateExcel("Account", 0,20,accounttabpage.fetchAccountAttentionTolbl());
		eleutil.updateExcel("Account", 1,20,accounttabpage.fetchAccountAttentionTo());
		
		eleutil.updateExcel("Account", 0,21,accounttabpage.fetchAccountUSDOTNolbl());
		eleutil.updateExcel("Account", 1,21,accounttabpage.fetchAccountUSDOTNo());
		eleutil.updateExcel("Account", 0,22,accounttabpage.fetchAccountTPIDlbl());
		eleutil.updateExcel("Account", 1,22,accounttabpage.fetchAccountTPID());
		eleutil.updateExcel("Account", 0,23,accounttabpage.fetchAccountContactnamelbl());
		eleutil.updateExcel("Account", 1,23,accounttabpage.fetchAccountContactname());
		eleutil.updateExcel("Account", 0,24,accounttabpage.fetchAccountPrimaryPhonelbl());
		eleutil.updateExcel("Account", 1,24,accounttabpage.fetchAccountPrimaryPhone());
		eleutil.updateExcel("Account", 0,25,accounttabpage.fetchAccountAlternatePhonelbl());
		eleutil.updateExcel("Account", 1,25,accounttabpage.fetchAccountAlternatePhone());
		eleutil.updateExcel("Account", 0,26,accounttabpage.fetchAccountFaxNolbl());
		eleutil.updateExcel("Account", 1,26,accounttabpage.fetchAccountFaxNo());
		eleutil.updateExcel("Account", 0,27,accounttabpage.fetchAccountEmailnotificationlbl());
		eleutil.updateExcel("Account", 1,27,accounttabpage.fetchAccountEmailnotification());
		eleutil.updateExcel("Account", 0,28,accounttabpage.fetchAccountFaxnotificationlbl());
		eleutil.updateExcel("Account", 1,28,accounttabpage.fetchAccountFaxnotification());


		//In Account Page
		accounttabpage.checkEmailNotification();
		commonobjects.expandCommentSection();
		commonobjects.enterComments(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"AccountTab",2,0));
		commonobjects.checkDeleteAllowed();
		commonobjects.clickAddorUpdateComment();
		commonobjects.clickProceed();
		Thread.sleep(3000);
	}

	@Then("user should navigate to Account verification screen and proceed further")
	public void user_should_navigate_to_account_verification_screen_and_proceed_further() throws InterruptedException {
		//In Account Verification Screen
				//Verification screen Fetching Data
				
		//In Account Verification Screen
				commonobjects.clickProceed();
			Thread.sleep(2000);
	}

	@Then("user should navigate to Fleet  screen and update Fleet Expiration Date & Fleet Type & Commodity Class and proceed further")
	public void user_should_navigate_to_fleet_screen_and_update_fleet_expiration_date_fleet_type_commodity_class_and_proceed_further() throws IOException, Exception {
		eleutil.updateExcel("Fleet", 0,0,fleettabpage.fetchRegistrationtypelbl());
		eleutil.updateExcel("Fleet", 1,0,fleettabpage.fetchRegistrationtype());
		eleutil.updateExcel("Fleet", 0,1,fleettabpage.fetchfltstatuslbl());
		eleutil.updateExcel("Fleet", 1,1,fleettabpage.fetchfltstatus());
		eleutil.updateExcel("Fleet", 0,2,fleettabpage.fetchcarriertypelbl());
		eleutil.updateExcel("Fleet", 1,2,fleettabpage.fetchcarriertype());
		eleutil.updateExcel("Fleet", 0,3,fleettabpage.fetchDBANamelbl());
		eleutil.updateExcel("Fleet", 1,3,fleettabpage.fetchDBAName());
		
		eleutil.updateExcel("Fleet", 0,4,fleettabpage.FleetStreet0lbl());
		eleutil.updateExcel("Fleet", 1,4,fleettabpage.FleetStreet0());
		eleutil.updateExcel("Fleet", 0,5,fleettabpage.FleetZip0lbl());
		eleutil.updateExcel("Fleet", 1,5,fleettabpage.FleetZip0());
		eleutil.updateExcel("Fleet", 0,6,fleettabpage.FleetJur0lbl());
		eleutil.updateExcel("Fleet", 1,6,fleettabpage.FleetJur0());
		eleutil.updateExcel("Fleet", 0,7,fleettabpage.FleetCity0lbl());
		eleutil.updateExcel("Fleet", 1,7,fleettabpage.FleetCity0());
		eleutil.updateExcel("Fleet", 0,8,fleettabpage.FleetCounty0lbl());
		eleutil.updateExcel("Fleet", 1,8,fleettabpage.FleetCounty0());
		eleutil.updateExcel("Fleet", 0,9,fleettabpage.FleetCountry0lbl());
		eleutil.updateExcel("Fleet", 1,9,fleettabpage.FleetCountry0());
		eleutil.updateExcel("Fleet", 0,10,fleettabpage.FleetNonDeliverable0lbl());
		eleutil.updateExcel("Fleet", 1,10,fleettabpage.FleetNonDeliverable0());
		
		fleettabpage.clickMailingAddress();
		
		eleutil.updateExcel("Fleet", 0,11,fleettabpage.FleetStreet1lbl());
		eleutil.updateExcel("Fleet", 1,11,fleettabpage.FleetStreet1());
		eleutil.updateExcel("Fleet", 0,12,fleettabpage.FleetZip1lbl());
		eleutil.updateExcel("Fleet", 1,12,fleettabpage.FleetZip1());
		eleutil.updateExcel("Fleet", 0,13,fleettabpage.FleetJur1lbl());
		eleutil.updateExcel("Fleet", 1,13,fleettabpage.FleetJur1());
		eleutil.updateExcel("Fleet", 0,14,fleettabpage.FleetCity1lbl());
		eleutil.updateExcel("Fleet", 1,14,fleettabpage.FleetCity1());
		eleutil.updateExcel("Fleet", 0,15,fleettabpage.FleetCounty1lbl());
		eleutil.updateExcel("Fleet", 1,15,fleettabpage.FleetCounty1());
		eleutil.updateExcel("Fleet", 0,16,fleettabpage.FleetCountry1lbl());
		eleutil.updateExcel("Fleet", 1,16,fleettabpage.FleetCountry1());
		eleutil.updateExcel("Fleet", 0,17,fleettabpage.FleetNonDeliverable1lbl());
		eleutil.updateExcel("Fleet", 1,17,fleettabpage.FleetNonDeliverable1());
		eleutil.updateExcel("Fleet", 0,18,fleettabpage.FleetAttentionTOlbl());
		eleutil.updateExcel("Fleet", 1,18,fleettabpage.FleetAttentionTO());
		
		fleettabpage.navigateToServiceProvider();

		eleutil.updateExcel("Fleet", 0,19,fleettabpage.FleetServiceProviderlbl());
		eleutil.updateExcel("Fleet", 1,19,fleettabpage.FleetServiceProvider());
		eleutil.updateExcel("Fleet", 0,20,fleettabpage.FleetServiceLegalNamelbl());
		eleutil.updateExcel("Fleet", 1,20,fleettabpage.FleetServiceLegalName());
		eleutil.updateExcel("Fleet", 0,21,fleettabpage.FleetService_DBANamelbl());
		eleutil.updateExcel("Fleet", 1,21,fleettabpage.FleetService_DBAName());
		eleutil.updateExcel("Fleet", 0,22,fleettabpage.FleetService_PowerOfAttroneylbl());
		eleutil.updateExcel("Fleet", 1,22,fleettabpage.FleetService_PowerOfAttroney());
		
		eleutil.updateExcel("Fleet", 0,23,fleettabpage.FleetService_PowerOfAttroneyEffDatelbl());
		eleutil.updateExcel("Fleet", 1,23,fleettabpage.FleetService_PowerOfAttroneyEffDate());
		eleutil.updateExcel("Fleet", 0,24,fleettabpage.FleetService_PowerOfAttroneyExpDatelbl());
		eleutil.updateExcel("Fleet", 1,24,fleettabpage.FleetService_PowerOfAttroneyExpDate());
		eleutil.updateExcel("Fleet", 0,25,fleettabpage.FleetService_EmailIDlbl());
		eleutil.updateExcel("Fleet", 1,25,fleettabpage.FleetService_EmailID());
		eleutil.updateExcel("Fleet", 0,26,fleettabpage.FleetService_PhoneNolbl());
		eleutil.updateExcel("Fleet", 1,26,fleettabpage.FleetService_PhoneNo());
		
		eleutil.updateExcel("Fleet", 0,27,fleettabpage.FleetService_FaxNolbl());
		eleutil.updateExcel("Fleet", 1,27,fleettabpage.FleetService_FaxNo());
		eleutil.updateExcel("Fleet", 0,28,fleettabpage.FleetService_Streetlbl());
		eleutil.updateExcel("Fleet", 1,28,fleettabpage.FleetService_Street());
		eleutil.updateExcel("Fleet", 0,29,fleettabpage.FleetService_Citylbl());
		eleutil.updateExcel("Fleet", 1,29,fleettabpage.FleetService_City());
		eleutil.updateExcel("Fleet", 0,30,fleettabpage.FleetService_Jurlbl());
		eleutil.updateExcel("Fleet", 1,30,fleettabpage.FleetService_Jur());
		eleutil.updateExcel("Fleet", 0,31,fleettabpage.FleetService_ZipCodelbl());
		eleutil.updateExcel("Fleet", 1,31,fleettabpage.FleetService_ZipCode());
		eleutil.updateExcel("Fleet", 0,32,fleettabpage.FleetService_Countrylbl());
		eleutil.updateExcel("Fleet", 1,32,fleettabpage.FleetService_Country());
		fleettabpage.clickOnTimeMailingAddress();
		eleutil.updateExcel("Fleet", 0,33,fleettabpage.FleetServiceMailing_Streetlbl());
		eleutil.updateExcel("Fleet", 1,33,fleettabpage.FleetServiceMailing_Street());
		eleutil.updateExcel("Fleet", 0,34,fleettabpage.FleetServiceMailing_ZipCodelbl());
		eleutil.updateExcel("Fleet", 1,34,fleettabpage.FleetServiceMailing_ZipCode());
		eleutil.updateExcel("Fleet", 0,35,fleettabpage.FleetServiceMailing_Jurlbl());
		eleutil.updateExcel("Fleet", 1,35,fleettabpage.FleetServiceMailing_Jur());
		eleutil.updateExcel("Fleet", 0,36,fleettabpage.FleetServiceMailing_Citylbl());
		eleutil.updateExcel("Fleet", 1,36,fleettabpage.FleetServiceMailing_City());
		eleutil.updateExcel("Fleet", 0,37,fleettabpage.FleetServiceMailing_Countylbl());
		eleutil.updateExcel("Fleet", 1,37,fleettabpage.FleetServiceMailing_County());
		eleutil.updateExcel("Fleet", 0,38,fleettabpage.FleetServiceMailing_Countrylbl());
		eleutil.updateExcel("Fleet", 1,38,fleettabpage.FleetServiceMailing_Country());
		eleutil.updateExcel("Fleet", 0,39,fleettabpage.FleetServiceMailing_AttentionTOlbl());
		eleutil.updateExcel("Fleet", 1,39,fleettabpage.FleetServiceMailing_AttentionTO());
		
		
		eleutil.updateExcel("Fleet", 0,40,fleettabpage.FleetDetails_ContactNamelbl());
		eleutil.updateExcel("Fleet", 1,40,fleettabpage.FleetDetails_ContactName());
		eleutil.updateExcel("Fleet", 0,41,fleettabpage.FleetDetails_EmailIDlbl());
		eleutil.updateExcel("Fleet", 1,41,fleettabpage.FleetDetails_EmailID());
		eleutil.updateExcel("Fleet", 0,42,fleettabpage.FleetDetails_PrimaryCellNbrlbl());
		eleutil.updateExcel("Fleet", 1,42,fleettabpage.FleetDetails_PrimaryCellNbr());
		eleutil.updateExcel("Fleet", 0,43,fleettabpage.FleetDetails_AlternateCellNbrlbl());
		eleutil.updateExcel("Fleet", 1,43,fleettabpage.FleetDetails_AlternateCellNbr());
		eleutil.updateExcel("Fleet", 0,44,fleettabpage.FleetDetails_FaxNolbl());
		eleutil.updateExcel("Fleet", 1,44,fleettabpage.FleetDetails_FaxNo());
		eleutil.updateExcel("Fleet", 0,45,fleettabpage.FleetDetails_TPIDlbl());
		eleutil.updateExcel("Fleet", 1,45,fleettabpage.FleetDetails_TPID());
		eleutil.updateExcel("Fleet", 0,46,fleettabpage.FleetDetails_UsdotNbrlbl());
		eleutil.updateExcel("Fleet", 1,46,fleettabpage.FleetDetails_UsdotNbr());
		eleutil.updateExcel("Fleet", 0,47,fleettabpage.FleetDetails_ChangeVehUsdotTinlbl());
		eleutil.updateExcel("Fleet", 1,47,fleettabpage.FleetDetails_ChangeVehUsdotTin());
		
		eleutil.updateExcel("Fleet", 0,48,fleettabpage.FleetDetails_FltTypelbl());
		eleutil.updateExcel("Fleet", 1,48,fleettabpage.FleetDetails_FltType());
		eleutil.updateExcel("Fleet", 0,49,fleettabpage.FleetDetails_CommodityClasslbl());
		eleutil.updateExcel("Fleet", 1,49,fleettabpage.FleetDetails_CommodityClass());
		eleutil.updateExcel("Fleet", 0,50,fleettabpage.FleetDetails_FltEffDatelbl());
		eleutil.updateExcel("Fleet", 1,50,fleettabpage.FleetDetails_FltEffDatedtPicker());
		eleutil.updateExcel("Fleet", 0,51,fleettabpage.FleetDetails_FltExpDatelbl());
		eleutil.updateExcel("Fleet", 1,51,fleettabpage.FleetDetails_FltExpDate());
		
		eleutil.updateExcel("Fleet", 0,52,fleettabpage.FleetDetails_changeAddrOnUsdotlbl());
		eleutil.updateExcel("Fleet", 1,52,fleettabpage.FleetDetails_changeAddrOnUsdot());
		eleutil.updateExcel("Fleet", 0,53,fleettabpage.FleetDetails_FirstOperatedDatelbl());
		eleutil.updateExcel("Fleet", 1,53,fleettabpage.FleetDetails_FirstOperatedDate());
		eleutil.updateExcel("Fleet", 0,54,fleettabpage.FleetDetails_WyomingIndicatorlbl());
		eleutil.updateExcel("Fleet", 1,54,fleettabpage.FleetDetails_WyomingIndicator());
		eleutil.updateExcel("Fleet", 0,55,fleettabpage.FleetDetails_IFTADistancelbl());
		eleutil.updateExcel("Fleet", 1,55,fleettabpage.FleetDetails_IFTADistance());
		eleutil.updateExcel("Fleet", 0,56,fleettabpage.FleetDetails_MobileNotificationlbl());
		eleutil.updateExcel("Fleet", 1,56,fleettabpage.FleetDetails_MobileNotification());
		
		fleettabpage.navigateToServiceProvider();
		
		fleettabpage.clickPowerOfAttroney();
		
		fleettabpage.enterEmailID(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,0));
		
		fleettabpage.enterContactName(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,8));
		
		fleettabpage.enterprimaryPhone(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,9));
		
		fleettabpage.selectFleetType(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,9));
		
		fleettabpage.selectCommodityClass(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,10));
		
		fleettabpage.selectEffectiveDate(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,12));
		
		fleettabpage.selectExpirationDate(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,13));
		
		fleettabpage.selectFirstOperatedDate(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,14));
		
		//Collecting Documents only for Power Of Attorney
		fleettabpage.selectPowerOfAttroney(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,4));
		
	
		commonobjects.expandCommentSection();
		
		commonobjects.enterComments(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"FleetTab",2,7));
		
		commonobjects.checkDeleteAllowed();
		commonobjects.clickAddorUpdateComment();
		
		commonobjects.clickProceed();
		Thread.sleep(2000);
	}

	@Then("user should navigate to Fleet verification screen and proceed further")
	public void user_should_navigate_to_fleet_verification_screen_and_proceed_further() throws Exception {
		//Fleet Verification Screen

	
		
		/*eleutil.updateExcel("Fleet", 0,63,fleetverify.FleetDocCollection_IRPRequirementsFormlbl());
		eleutil.updateExcel("Fleet", 1,63,fleetverify.FleetDocCollection_IRPRequirementsForm());
		eleutil.updateExcel("Fleet", 0,64,fleetverify.FleetDocCollection_StatementOfUnderstandinglbl());
		eleutil.updateExcel("Fleet", 1,64,fleetverify.FleetDocCollection_StatementOfUnderstanding());
		eleutil.updateExcel("Fleet", 0,65,fleetverify.FleetDocCollection_InstallmentAgreementlbl());
		eleutil.updateExcel("Fleet", 1,65,fleetverify.FleetDocCollection_InstallmentAgreement());
		eleutil.updateExcel("Fleet", 0,66,fleetverify.FleetDocCollection_PowerOfAttorneylbl());
		eleutil.updateExcel("Fleet", 1,66,fleetverify.FleetDocCollection_PowerOfAttorney());
		*/
		commonobjects.clickProceed();
		 Thread.sleep(2000);
	}

	@Then("user should land on Distance screen and select Estimated Distance and proceed further")
	public void user_should_land_on_distance_screen_and_select_estimated_distance_and_proceed_further() throws IOException, Exception {
	 /* distancetabpage.selectYesOrNo(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"DistanceTab",2,4));
	  commonobjects.enterComments(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"DistanceTab",2,2));
		commonobjects.checkDeleteAllowed();
		commonobjects.clickAddorUpdateComment();
     	commonobjects.clickProceed();*/
		
	}

	@Then("user should navigate to Distance verification screen and proceed further")
	public void user_should_navigate_to_distance_verification_screen_and_proceed_further() throws InterruptedException {
		//Distance Verification Screen
		//Distance Verification Screen
     /*	eleutil.updateExcel("Distance", 0, 0,Distanceverify.fetchAccountnolbl());
     	eleutil.updateExcel("Distance", 1, 0,Distanceverify.fetchAccountno());
     	eleutil.updateExcel("Distance", 0,1,Distanceverify.FleetNbrlbl());
     	eleutil.updateExcel("Distance", 1,1,Distanceverify.FleetNbr());
     	eleutil.updateExcel("Distance", 0,2,Distanceverify.DistanceSupplementNbrlbl());
     	eleutil.updateExcel("Distance", 1,2,Distanceverify.DistanceSupplementNbr());
     	eleutil.updateExcel("Distance", 0,3,Distanceverify.DistanceLegalNamelbl());
     	eleutil.updateExcel("Distance", 1,3,Distanceverify.DistanceLegalName());
     	eleutil.updateExcel("Distance", 0,4,Distanceverify.DistanceDBANamelbl());
     	eleutil.updateExcel("Distance", 1,4,Distanceverify.DistanceDBAName());
     	eleutil.updateExcel("Distance", 0,5,Distanceverify.DistanceFleetEffectiveDatelbl());
     	eleutil.updateExcel("Distance", 1,5,Distanceverify.DistanceFleetEffectiveDate());
     	eleutil.updateExcel("Distance", 0,6,Distanceverify.DistanceFleetExpiryMonthYearlbl());
     	eleutil.updateExcel("Distance", 1,6,Distanceverify.DistanceFleetExpiryMonth());
     	eleutil.updateExcel("Distance", 1,7,Distanceverify.DistanceFleetExpiryyear());
     	eleutil.updateExcel("Distance", 0,8,Distanceverify.DistanceSupplementDesclbl ());
     	eleutil.updateExcel("Distance", 1,8,Distanceverify.DistanceSupplementDesc());
     	eleutil.updateExcel("Distance", 0,9,Distanceverify.DistanceReportingPeriodFromlbl ());
     	eleutil.updateExcel("Distance", 1,9,Distanceverify.DistanceReportingPeriodFrom ());
     	eleutil.updateExcel("Distance", 0,10,Distanceverify.DistanceReportingPeriodTolbl ());
     	eleutil.updateExcel("Distance", 1,10,Distanceverify.DistanceReportingPeriodTo());
     	eleutil.updateExcel("Distance", 0,11,Distanceverify.DistanceUsdotNbrlbl());
     	eleutil.updateExcel("Distance", 1,11,Distanceverify.DistanceUsdotNbr());
     	eleutil.updateExcel("Distance", 0,12,Distanceverify.DistanceEstimatedDistanceChartlbl());
     	eleutil.updateExcel("Distance", 1,12,Distanceverify.DistanceEstimatedDistanceChart ());
     	eleutil.updateExcel("Distance", 0,12,Distanceverify.DistanceOverrideContJurlbl ());
     	eleutil.updateExcel("Distance", 1,13,Distanceverify.DistanceOverrideContJurFrom());
     	eleutil.updateExcel("Distance", 0,13,Distanceverify.DistanceActualDistanceGenlbl());
     	eleutil.updateExcel("Distance", 1,14,Distanceverify.DistanceActualDistanceGen());
     	eleutil.updateExcel("Distance", 0,14,Distanceverify.DistanceFirstYearEstimatedMileagelbl());
     	eleutil.updateExcel("Distance", 1,15,Distanceverify.DistanceFirstYearEstimatedMileage());
     	eleutil.updateExcel("Distance", 0,16,Distanceverify.DistanceTotalFleetDistanceGenlbl());
     	eleutil.updateExcel("Distance", 1,16,Distanceverify.DistanceTotalFleetDistanceGen());
     	eleutil.updateExcel("Distance", 0,17,Distanceverify.DistanceFRPMlgQuetionlbl());
     	eleutil.updateExcel("Distance", 1,15,Distanceverify.DistanceFRPMlgQuetion());
     	eleutil.updateExcel("Distance", 0,17,Distanceverify.DistanceDistanceTypelbl());
     	eleutil.updateExcel("Distance", 1,18,Distanceverify.DistanceDistanceType());
     	eleutil.updateExcel("Distance", 0, 0,Distanceverify.fetchAccountnolbl());
     	eleutil.updateExcel("Distance", 1, 0,Distanceverify.fetchAccountno());
     	eleutil.updateExcel("Distance", 0,1,Distanceverify.FleetNbrlbl());
     	eleutil.updateExcel("Distance", 1,1,Distanceverify.FleetNbr());
     	eleutil.updateExcel("Distance", 0,2,Distanceverify.DistanceSupplementNbrlbl());
     	eleutil.updateExcel("Distance", 1,2,Distanceverify.DistanceSupplementNbr());
     	eleutil.updateExcel("Distance", 0,3,Distanceverify.DistanceLegalNamelbl());
     	eleutil.updateExcel("Distance", 1,3,Distanceverify.DistanceLegalName());
     	eleutil.updateExcel("Distance", 0,4,Distanceverify.DistanceDBANamelbl());
     	eleutil.updateExcel("Distance", 1,4,Distanceverify.DistanceDBAName());
     	eleutil.updateExcel("Distance", 0,5,Distanceverify.DistanceFleetEffectiveDatelbl());
     	eleutil.updateExcel("Distance", 1,5,Distanceverify.DistanceFleetEffectiveDate());
     	eleutil.updateExcel("Distance", 0,6,Distanceverify.DistanceFleetExpiryMonthYearlbl());
     	eleutil.updateExcel("Distance", 1,6,Distanceverify.DistanceFleetExpiryMonth());
     	eleutil.updateExcel("Distance", 1,7,Distanceverify.DistanceFleetExpiryyear());
     	eleutil.updateExcel("Distance", 0,8,Distanceverify.DistanceSupplementDesclbl ());
     	eleutil.updateExcel("Distance", 1,8,Distanceverify.DistanceSupplementDesc());
     	eleutil.updateExcel("Distance", 0,9,Distanceverify.DistanceReportingPeriodFromlbl ());
     	eleutil.updateExcel("Distance", 1,9,Distanceverify.DistanceReportingPeriodFrom ());
     	eleutil.updateExcel("Distance", 0,10,Distanceverify.DistanceReportingPeriodTolbl ());
     	eleutil.updateExcel("Distance", 1,10,Distanceverify.DistanceReportingPeriodTo());
     	eleutil.updateExcel("Distance", 0,11,Distanceverify.DistanceUsdotNbrlbl());
     	eleutil.updateExcel("Distance", 1,11,Distanceverify.DistanceUsdotNbr());
     	eleutil.updateExcel("Distance", 0,12,Distanceverify.DistanceEstimatedDistanceChartlbl());
     	eleutil.updateExcel("Distance", 1,12,Distanceverify.DistanceEstimatedDistanceChart ());
     	eleutil.updateExcel("Distance", 0,12,Distanceverify.DistanceOverrideContJurlbl ());
     	eleutil.updateExcel("Distance", 1,13,Distanceverify.DistanceOverrideContJurFrom());
     	eleutil.updateExcel("Distance", 0,14,Distanceverify.DistanceActualDistanceGenlbl());
     	eleutil.updateExcel("Distance", 1,14,Distanceverify.DistanceActualDistanceGen());
     	eleutil.updateExcel("Distance", 0,15,Distanceverify.DistanceFirstYearEstimatedMileagelbl());
     	eleutil.updateExcel("Distance", 1,15,Distanceverify.DistanceFirstYearEstimatedMileage());
     	eleutil.updateExcel("Distance", 0,16,Distanceverify.DistanceTotalFleetDistanceGenlbl());
     	eleutil.updateExcel("Distance", 1,16,Distanceverify.DistanceTotalFleetDistanceGen());
     	eleutil.updateExcel("Distance", 0,17,Distanceverify.DistanceFRPMlgQuetionlbl());
     	eleutil.updateExcel("Distance", 1,17,Distanceverify.DistanceFRPMlgQuetion());
     	eleutil.updateExcel("Distance", 0,18,Distanceverify.DistanceDistanceTypelbl());
     	eleutil.updateExcel("Distance", 1,18,Distanceverify.DistanceDistanceType());
     	eleutil.updateExcel("Distance", 0,19,Distanceverify.DistanceActualDistConfirmationlbl());
     	eleutil.updateExcel("Distance", 1,19,Distanceverify.DistanceActualDistConfirmation());

		commonobjects.clickProceed();*/
		
	}

	@Then("user should land on the Weight Group screen and go for Add Weight group")
	public void user_should_land_on_the_weight_group_screen_and_go_for_add_weight_group() throws IOException, Exception {
		//Weight Group
		//wgtgroup.clickAddWeightGroup();
	}

	@Then("user should land on the Add Weight Group screen and provide all the required input to proceed")
	public void user_should_land_on_the_add_weight_group_screen_and_provide_all_the_required_input_to_proceed() throws IOException, Exception {
		/*wgtgroupadd.selectWeightGroupType(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"WeightGrouptab",2,0));
		
		wgtgroupadd.enterWeightGroupNo(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"WeightGrouptab",2,1));
		wgtgroupadd.selectMaxGrossWeight(ExcelReader.FetchDataFromSheet(ConfigReader.readRWCexcel(),"WeightGrouptab",2,2));
		
		commonobjects.clickProceed();*/
		 
	}

	@Then("user should land on the Add Weight Group Verification screen and go for  Weight group")
	public void user_should_land_on_the_add_weight_group_verification_screen_and_go_for_weight_group() throws InterruptedException {
		//Add  Weight Group verification Screen
		//commonobjects.clickProceed();
		
	}

	@Then("user should land on the Weight Group and edit the existing weight group to proceed to Vehicle screen")
	public void user_should_land_on_the_weight_group_and_edit_the_existing_weight_group_to_proceed_to_vehicle_screen() throws IOException, Exception {
			//In Weight Group Screen	
				//commonobjects.clickDonebtn();
				

	}
	@Then("user should land on the Vehicle Screen and")
	public void user_should_land_on_the_vehicle_screen_and() {
	  
	}

	@Then("user should land on the Billing screen with open status and Request for TVR & set Delivery Type as PDF with Comments")
	public void user_should_land_on_the_billing_screen_with_open_status_and_request_for_tvr_set_delivery_type_as_pdf_with_comments() {
	    
	}

	@Then("system calculates Fee and user change the supplement status as invoiced")
	public void system_calculates_fee_and_user_change_the_supplement_status_as_invoiced() {
	   
	}

	@Then("system should calculates the In-state fee and Fees should be waived\\/overridden for some vehicles.")
	public void system_should_calculates_the_in_state_fee_and_fees_should_be_waived_overridden_for_some_vehicles() {
	    
	}

	@Then("user should check Installment payment and should be selected and proceed further")
	public void user_should_check_installment_payment_and_should_be_selected_and_proceed_further() {
	    
	}

	@Then("system should generate PDF and should go to Payment Init screen.")
	public void system_should_generate_pdf_and_should_go_to_payment_init_screen() {
	   
	}

	@Then("user should verify the screen and set Delivery Types as PDF & proceed further")
	public void user_should_verify_the_screen_and_set_delivery_types_as_pdf_proceed_further() {
	   
	}

	@Then("user should land on the Payment Init Verification screen & click on Pay Now")
	public void user_should_land_on_the_payment_init_verification_screen_click_on_pay_now() {
	   
	}

	@Then("user should land on the Payment Collection page")
	public void user_should_land_on_the_payment_collection_page() {
	   
	}

	@Then("user select multiple payment types and select PDF delivery type & clicks Paynow")
	public void user_select_multiple_payment_types_and_select_pdf_delivery_type_clicks_paynow() {
	   
	}

	@Then("payment receipt should get generated & Hard stop message should get displayed")
	public void payment_receipt_should_get_generated_hard_stop_message_should_get_displayed() {
	 
	}
}
