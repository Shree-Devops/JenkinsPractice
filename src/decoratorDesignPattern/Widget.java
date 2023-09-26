package decoratorDesignPattern;

public class Widget extends AbstractDecorator{

	private int rank = 10;
	
	public Widget(WebPage wp) {
		super(wp);
	}
	
	@Override
	public int totalRank() {
		int totalRank = super.totalRank() + rank;
		System.out.println("Widget1 rank: " + rank);
		System.out.println("total rank: " + totalRank);
		return totalRank;
	}
	
	public void widgetFunctionality() {
		System.out.println("Widget1 functionality added.");
	}
}
