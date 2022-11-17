package com.nop_Commerce.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nop_Commerce.Base.BaseClass;

public class AddToCartPage extends BaseClass {

	public AddToCartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name = "Add to cart")
	WebElement addToCartBtn;

	@FindBy(id = "product_enteredQuantity_4")
	WebElement quantity;

	@FindBy(id = "add-to-cart-button-4")
	WebElement addtoCart;

	public void AddItem() {
		clickButton(addToCartBtn);
	}

	public void SelectItem() {
		clickButton(quantity);
	}
	
	public void AddToShipping() {
		clickButton(addtoCart);
}
}
