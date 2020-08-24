
public class Basil extends Decorator{
	
	private int price_basil = 2;
	private String name = "Basil";

	public Basil(Pizza_Interface pizza_input) {
		super(pizza_input);
	}
	
	public void GetFullDescription() {
		super.GetFullDescription();			
		addTopping_Basil();
	}

	public void addTopping_Basil(){
		super.addPrice(price_basil); 

		System.out.println("add Topping:" + name + " price:$" + super.getPrice());

		
	}
}
