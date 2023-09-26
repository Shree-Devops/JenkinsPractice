package SingletonPattern;

public class CandyMaker {
	private boolean empty;
	private boolean boiled;
	private static CandyMaker candymaker;  
	
	private CandyMaker() {
		empty = true;
		boiled = false;
	}
	public static CandyMaker getInstance() {
		if (candymaker==null)
		{
			candymaker = new CandyMaker();
		}
		return candymaker;
	}
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	public boolean isEmpty() {
		return empty;
	}
	public boolean isBoiled() {
		return boiled;
	}
}

