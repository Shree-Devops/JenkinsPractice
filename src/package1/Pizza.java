package package1;
public class Pizza
{
	String base;
	String[] toppings;
	int pizzaCost;
//	int baseCost;
//	int totalToppingsCost;
	
	public Pizza(String base, String[] toppings) {
		this.base = base;
		this.toppings = toppings;
	}
	public int getBaseCost()
	{
		int baseCost=0;
		if(this.base.equalsIgnoreCase("standard"))
		{
			baseCost=100;
		}
		else if(this.base.equalsIgnoreCase("soft"))
		{
			baseCost=200;
		}
		else
			System.out.println("invalid baseType selected");
		System.out.println("base Cost - " + baseCost);
		return baseCost;
	}
	public int getToppingsCost()
	{
		int totalToppingsCost=0;
		for(int i=0; i<this.toppings.length; i++)
		{
			int toppingCost=0;
			if(this.toppings[i].equalsIgnoreCase("Tomato"))
			{
				toppingCost=10;
			}
			else if(this.toppings[i].equalsIgnoreCase("corn"))
			{
				toppingCost=20;
			}
			else if(this.toppings[i].equalsIgnoreCase("mushrooms"))
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
	public void calculatePizzaCost()
	{
		
	}
}


