package decoratorDesignPattern;

public class MobileWebPage implements WebPage{
	private int rank = 1;
	
	@Override
	public int totalRank() {
		System.out.println("MobileWebpage rank: " + rank);
		return rank ;		
	}
}
