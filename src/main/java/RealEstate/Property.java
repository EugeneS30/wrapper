package RealEstate;

public class Property {
	
	private int propertyID; 
	private String suburbName;
	private int postCode;
	private String streetName;
	private String streetNumber;
	private int unitNumber;
	private int roomsNumber;
	private int price;
	private int toiletsNumber;
	private int parkingSpaces;
	private String sellInfo;

	public Property(String suburbName, int postCode, String straetName, 
					String streetNumber, int unitNumber, int roomsNumber, 
					int price, int toiletsNumber, int parkingSpaces, String sellInfo){
		
		this.suburbName = suburbName;
		this.postCode = postCode;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.unitNumber = unitNumber;
		this.roomsNumber = roomsNumber;
		this.price = price;
		this.toiletsNumber = toiletsNumber;
		this.parkingSpaces = parkingSpaces;
		this.sellInfo = sellInfo;
	}

}
