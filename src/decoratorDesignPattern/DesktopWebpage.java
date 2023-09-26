package decoratorDesignPattern;

public class DesktopWebpage implements WebPage{

	private int rank = 2;
	
	@Override
	public int totalRank() {
		System.out.println("DesktopWebpage rank: " + rank);
		return rank;		
	}
}
