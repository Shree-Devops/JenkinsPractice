package builderPattern;

public class Bicycle {
	
	public boolean OtpIngears;
	public boolean OtpIndoublestands;
	public boolean OtpIndoubleseats;
	public boolean OtpIncarrier;

	Bicycle(BicycleBuilder bicycleBuilder) {
		this.OtpIngears = bicycleBuilder.OtpIngears;
		this.OtpIndoublestands = bicycleBuilder.OtpIndoublestands;
		this.OtpIndoubleseats = bicycleBuilder.OtpIndoubleseats;
		this.OtpIncarrier = bicycleBuilder.OtpIncarrier;
	}
	public boolean OtpIngears() {
		System.out.println("OtpIngears in Bicycle class: " + OtpIngears);
		return OtpIngears;
	}
	public boolean OtpIndoublestands() {
		System.out.println("OtpIndoublestands in Bicycle class: " + OtpIndoublestands);
		return OtpIndoublestands;
	}
	public boolean OtpIndoubleseats() {
		System.out.println("OtpIndoubleseats in OtpIndoubleseats class: " + OtpIndoubleseats);
		return OtpIndoubleseats;
	}
	public boolean OtpIncarrier() {
		System.out.println("OtpIndoubleseats in OtpIncarrier class: " + OtpIncarrier);
		return OtpIncarrier;
	}
}
