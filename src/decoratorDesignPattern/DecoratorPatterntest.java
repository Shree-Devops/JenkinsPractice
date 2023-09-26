package decoratorDesignPattern;

public class DecoratorPatterntest {

	public static void main(String[] args) {
		WebPage widget1Widget2 = new Widget(new Widget2(new MobileWebPage()));
		System.out.println("widget1Widget2 mobile: " + widget1Widget2.totalRank());
		
		WebPage widget1 = new Widget(new MobileWebPage());
		System.out.println("widget1 mobile: " + widget1.totalRank());
		
		WebPage widget2 = new Widget2(new MobileWebPage());
		System.out.println("widget2 mobile: " + widget2.totalRank());
		
		WebPage widget11Widget22 = new Widget(new Widget2(new DesktopWebpage()));
		System.out.println("widget1Widget2 desktop: " + widget11Widget22.totalRank());
		
		WebPage widget11 = new Widget(new DesktopWebpage());
		System.out.println("widget1 desktop: " + widget11.totalRank());
		
		WebPage widget22 = new Widget2(new DesktopWebpage());
		System.out.println("widget2 desktop: " + widget22.totalRank());
	}
}
