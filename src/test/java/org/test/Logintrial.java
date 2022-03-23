package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logintrial extends BaseClass {
	public Logintrial() {
//		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	
	@FindBy(name="q")
	private WebElement searchbox;
	
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement search;
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	private WebElement  searchphone;

	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement Addcartflipkart;

	


	public WebElement getClose() {
		return close;
	}


	public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getSearchphone() {
		return searchphone;
	}	
	
	public WebElement getAddcartflipkart() {
		return Addcartflipkart;
	}

	

}
