package decoratorDesignPattern;

public class Widget2 extends AbstractDecorator{

	private int rank = 20;
	
	public Widget2(WebPage wp) {
		super(wp);
	}
	@Override
	public int totalRank() {
		int totalRank = super.totalRank() + rank;
		System.out.println("Widget2 rank: " + rank);
		System.out.println("total rank: " + totalRank);
		return totalRank;
	}
	public void widgetFunctionality() {
		System.out.println("Widget2 functionality added.");
	}
}
