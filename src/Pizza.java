
public class Pizza implements Pizza_Interface {
	private String name;
	private String pizzasize;
	private int price = 0;
	
	public Pizza(String input_name, String size) {
		this.name = input_name;
		this.pizzasize = size; 
		if (name == "Neapolitan") {
			price = price + 5;
		}
		if (name == "DeepFish") {
			price = price + 6;
		}
		if (name == "NewYork") {
			price = price + 7;
		}
		
		if (pizzasize == "small") {
			
		}
		if (pizzasize == "medium") {
			price = price + 3;
		}
		
		if (pizzasize == "large") {
			price = price + 6;
		}
	}
	
	public void addPrice(int topping_price) {
		price = price + topping_price;
	}
	
	public int getPrice() {
		return price;
		
	}
	public void GetFullDescription() {
		System.out.println(name + ":" + pizzasize + ", $" + price );
	}
	
	
	
	
}
