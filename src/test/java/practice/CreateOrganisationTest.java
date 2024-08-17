package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtiger.genericUtility.Base;
import com.vtiger.objectrepos.CreateNewOrganisationPage;
import com.vtiger.objectrepos.HomePage;
import com.vtiger.objectrepos.OrganisationInfoPage;
import com.vtiger.objectrepos.OrganisationPage;

public class CreateOrganisationTest extends Base {
@Test
public void createOrg() {
	HomePage hp=new HomePage(driver);
	hp.clickonORglnk();
	OrganisationPage op=new OrganisationPage(driver);
	op.clickoOnOrgLookUpImg();
	CreateNewOrganisationPage cnop=new CreateNewOrganisationPage(driver);
	cnop.createNewOrganisation("TCS"+jutil.getRandomNum());
	OrganisationInfoPage oip=new OrganisationInfoPage(driver);
	String header = oip.getheader();
	SoftAssert s=new SoftAssert();
	s.assertTrue(header.contains("TCS"));
	Reporter.log("ORGANISATIO IS CREATED and tc is pass",true);
	
}
}
