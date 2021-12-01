package org.test.booking;


public class BookingHotel {

	public static void main(String[] args) {
		
	BaseClass base = new BaseClass();
		
		base.laungBrowser();
		
		base.laungUrl("http://adactinhotelapp.com/");
				
		LoginPojo lp = new LoginPojo();
		base.input(lp.getTxtUser(), "Venkat7012");
		base.input(lp.getTxtPass(), "NG6602");
		lp.getBtnLogin().click();
		
		SelectLocationPojo sloc = new SelectLocationPojo();
		base.selectElement(sloc.getLoc(), "Sydney");
		base.selectElement(sloc.getHotel(), "Hotel Sunshine");
		base.selectElement(sloc.getRoomType(), "Standard");
		sloc.getBtnSubmit().click();
		
		ConformPojo con = new ConformPojo();
		con.getSelRadio().click();
		con.getBtnContinue().click();
		
		PaymentPojo pp = new PaymentPojo();
		base.input(pp.getFirstName(), "venkatesh");
		base.input(pp.getLastName(), "sel");
		base.input(pp.getAddr(), "cuddalore");
		base.input(pp.getCcNum(), "7483746592382719");
		base.selectElement(pp.getCctype(), "VISA");
		base.selectElement(pp.getCcExpMonth(), "July");
		base.selectElement(pp.getCcExpYear(), "2022");
		base.input(pp.getCcCvv(), "8549");
		pp.getBtnBookNow().click();
		
		BillingListPojo bList = new BillingListPojo();

		System.out.println("Hotel Name: "+ base.eleAttriValue(bList.getHotelName(), "value"));

		System.out.println("Location: "+base.eleAttriValue(sloc.getLoc(), "value"));

		System.out.println("Room Type: "+base.eleAttriValue(sloc.getRoomType(), "value"));

		System.out.println("Arrive Date: "+base.eleAttriValue(bList.getArrivalDate(), "value"));

		System.out.println("Departure Text: "+base.eleAttriValue(bList.getDepartureText(), "value"));

		System.out.println("Total Room: "+base.eleAttriValue(bList.getTotalRooms(), "value"));

		System.out.println("Adults Per Room: "+base.eleAttriValue(bList.getAdultsRoom(), "value"));

		System.out.println("Children per Room: "+base.eleAttriValue(bList.getChildrenRoom(), "value"));

		System.out.println("Price Per Night: "+base.eleAttriValue(bList.getPriceNight(), "value"));

		System.out.println("Total Price: "+base.eleAttriValue(bList.getTotalPrice(), "value"));

		System.out.println("GST: "+base.eleAttriValue(bList.getGst(), "value"));

		System.out.println("Final Price: "+base.eleAttriValue(bList.getFinalPrice(), "value"));

		System.out.println("First name: "+base.eleAttriValue(pp.getFirstName(), "value"));

		System.out.println("Last Name: "+base.eleAttriValue(pp.getLastName(), "value"));

		System.out.println("Address: "+base.eleAttriValue(pp.getAddr(),"value"));
		
		System.out.println("Order No: "+base.eleAttriValue(bList.getOrderNo(), "value"));
		
		base.laungClose();
	}
	
}
