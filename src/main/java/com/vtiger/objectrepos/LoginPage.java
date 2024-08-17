package com.vtiger.objectrepos;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//dec
	@FindBy(xpath="//input[@name='user_name']")private WebElement untxt;
		@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtxt;
		@FindBy(xpath="//input[@id='submitButton']")private WebElement loginbtn;
		//init
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//uti
		public WebElement getUntxt() {
			return untxt;
		}
		public WebElement getPwdtxt() {
			return pwdtxt;
		}
		public WebElement getLoginbtn() {
			return loginbtn;
		}
		//bl
		public  void loginToApp(String un,String pwd) {
			untxt.sendKeys(un);
			pwdtxt.sendKeys(pwd);
			loginbtn.click();
			
		}
		

}
