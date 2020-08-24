
public class Garlic extends Decorator{
		private String name = "Garlic";
		private int price_garlic = 1;
		
		public Garlic(Pizza_Interface pizza_input) {
			super(pizza_input);
		}
		
		public void GetFullDescription() {
			super.GetFullDescription();			
			addTopping_Garlic();
	}
		
		public void addTopping_Garlic() {
			super.addPrice(price_garlic); 

			System.out.println("add Topping:" + name + " price:$" + super.getPrice());

		}


}
