
public class Decorator implements Pizza_Interface{
	
	private Pizza_Interface pizza;
	
	public Decorator(Pizza_Interface pizza_input) {
		this.pizza = pizza_input;
	}

	@Override
	public void GetFullDescription() {
		// TODO Auto-generated method stub
		pizza.GetFullDescription();	
	}
	
	public void addPrice(int topping_price) {
		pizza.addPrice(topping_price);
		
	}
	
	public int getPrice()
	{
		return pizza.getPrice();
	}
	
	
}
