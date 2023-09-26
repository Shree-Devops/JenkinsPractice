package builderPattern;

public class BicycleBuilder {
 
	public boolean OtpIngears;
	public boolean OtpIndoublestands;
	public boolean OtpIndoubleseats;
	public boolean OtpIncarrier;

	public BicycleBuilder() {}
	
	public BicycleBuilder OtpIngears(boolean OtpIngears) {
		this.OtpIngears=OtpIngears;
		System.out.println("OtpIngears in BicycleBuilder class: " + OtpIngears);
		return this;
	}
	public BicycleBuilder OtpIndoublestands(boolean OtpIndoublestands) {
		this.OtpIndoublestands=OtpIndoublestands;
		System.out.println("OtpIndoublestands in BicycleBuilder class: " + OtpIndoublestands);
		return this;
	}
	public BicycleBuilder OtpIndoubleseats(boolean OtpIndoubleseats) {
		this.OtpIndoubleseats=OtpIndoubleseats;
		System.out.println("OtpIndoubleseats in BicycleBuilder class: " + OtpIndoubleseats);
		return this;
	}
	public BicycleBuilder OtpIncarrier(boolean OtpIncarrier) {
		this.OtpIncarrier=OtpIncarrier;
		System.out.println("OtpIncarrier in BicycleBuilder class: " + OtpIncarrier);
		return this;
	}
	public Bicycle build() {
		System.out.println("Bicycle built with above features..");
		 return new Bicycle(this);
	}
}
