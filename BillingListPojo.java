package org.test.booking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingListPojo extends BaseClass{

	public BillingListPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="hotel_name")
	private WebElement hotelName;
	@FindBy(id="arrival_date")
	private WebElement arrivalDate;
	@FindBy(id="departure_text")
	private WebElement departureText;
	@FindBy(id="total_rooms")
	private WebElement totalRooms;
	@FindBy(id="adults_room")
	private WebElement adultsRoom;
	@FindBy(id="children_room")
	private WebElement childrenRoom;
	@FindBy(id="price_night")
	private WebElement priceNight;
	@FindBy(id="total_price")
	private WebElement totalPrice;
	@FindBy(id="gst")
	private WebElement gst;
	@FindBy(id="final_price")
	private WebElement finalPrice;
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	public WebElement getHotelName() {
		return hotelName;
	}
	public WebElement getArrivalDate() {
		return arrivalDate;
	}
	public WebElement getDepartureText() {
		return departureText;
	}
	public WebElement getTotalRooms() {
		return totalRooms;
	}
	public WebElement getAdultsRoom() {
		return adultsRoom;
	}
	public WebElement getChildrenRoom() {
		return childrenRoom;
	}
	public WebElement getPriceNight() {
		return priceNight;
	}
	public WebElement getTotalPrice() {
		return totalPrice;
	}
	public WebElement getGst() {
		return gst;
	}
	public WebElement getFinalPrice() {
		return finalPrice;
	}
	public WebElement getOrderNo() {
		return orderNo;
	}
}
