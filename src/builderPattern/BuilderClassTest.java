package builderPattern;

public class BuilderClassTest {

	public static void main(String[] args) {
		Bicycle bicycle = new BicycleBuilder()
                .OtpIngears(true)
                .OtpIndoublestands(false)
                .OtpIndoubleseats(true)
                .OtpIncarrier(false)
                .build();
	}
}
