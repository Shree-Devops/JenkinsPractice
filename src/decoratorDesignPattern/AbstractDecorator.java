package decoratorDesignPattern;

public class AbstractDecorator implements WebPage{

	protected WebPage webpage ;
	
	public AbstractDecorator(WebPage wp) {
		this.webpage = wp;
	}
	@Override
	public int totalRank() {
		int rank = webpage.totalRank();
		return rank;
	}
}
