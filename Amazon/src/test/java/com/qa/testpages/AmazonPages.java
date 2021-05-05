package com.qa.testpages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class AmazonPages {
	WebDriver driver;
	//Getting Categories
	public Select getCategoryList()
	{
		return new Select(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select")));
	}
	
	//Searching
	@FindBy(xpath  = "//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchItem;
	public WebElement getSearch()
	{
		return searchItem;
	}
	
	//Price
	@FindAll
	(@FindBy(xpath = "//span[@class='a-price-whole']"))
	List<WebElement> price;
	
	public List<WebElement> getPrice()
	{
		return price;
	}
	
	//Total results
	@FindBy(xpath = "//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]")
	WebElement NoOfBooks;
	
	public WebElement getNoOfResults()
	{
		return NoOfBooks;
	}
	
	//Phone titles
	@FindAll(@FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']"))
	List<WebElement> title;
	
	public List<WebElement> getTitles()
	{
		return title;
	}
	
	//Book Title
	@FindAll(@FindBy(xpath = "//span[contains(text(),'The Da Vinci Code')]"))
	List<WebElement> bookTitles;
	
	public List<WebElement> getBookTitle()
	{
		return bookTitles;
	}
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")
	WebElement searchBtn;
	
	public WebElement getSearchBtn()
	{
		return searchBtn;
	}
	
	
	
	/*@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/span[1]")
	WebElement Alllink;
	public WebElement getAlllink()
	{
		return  Alllink;
	}
	
	@FindBy(xpath= "//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[29]/a[1]")
	WebElement Signoutbutton;
	public WebElement getSignoutbutton()
	{
		return Signoutbutton;
	}*/
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement Signinlink;
	public WebElement getSigninlink()
	{
		return Signinlink;
	}
	
	@FindBy(id="ap_email")
	WebElement emailtextfield;
	public WebElement getemailtextfield()
	{
		return emailtextfield;
	}
	@FindBy(id="continue")
	WebElement continuebutton;
	public WebElement getcontinuebutton()
	{
		return continuebutton;
	}
	@FindBy(id="ap_password")
	WebElement passwordfield;
	public WebElement getpasswordfield()
	{
		return passwordfield;
	}
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	public WebElement getsigninbutton()
	{
		return signinbutton;
	}
	//@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	//WebElement link;
	//public WebElement getlink()
	//{
		//return link;
	//}

	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[4]/span[2]")
	//WebElement returnsorder;
	//public WebElement getreturnsorder()
	//{
		//return returnsorder;
	//}
	
	public AmazonPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
