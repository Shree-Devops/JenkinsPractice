package package1;

public class Toppings {
	
	String[] toppings;
	
	public Toppings(String[] toppingstype) {
		this.toppings=toppingstype;
	}

	public int getToppingsCost()
	{
		int totalToppingsCost=0;
		for(int i=0; i<toppings.length; i++)
		{
			int toppingCost=0;
			if(toppings[i].equalsIgnoreCase("Tomato"))
			{
				toppingCost=10;
			}
			else if(toppings[i].equalsIgnoreCase("corn"))
			{
				toppingCost=20;
			}
			else if(toppings[i].equalsIgnoreCase("mushrooms"))
			{
				toppingCost=30;
			}
			else
				System.out.println("invalid topping selected");
			totalToppingsCost=totalToppingsCost + toppingCost ;
		}
		System.out.println("totalToppingsCost Cost - " + totalToppingsCost);
		return totalToppingsCost;
	}
}
