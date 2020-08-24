
public class Mozzarella extends Decorator{
		private String name = "Mozzarella";

		private int price_mozzarella = 2;
		
		public Mozzarella(Pizza_Interface pizza_input) {
			super(pizza_input);
			
			
		}
		public void GetFullDescription() {
			super.GetFullDescription();			
			addTopping_Mozzarella();
	}

		public void addTopping_Mozzarella() {
			super.addPrice(price_mozzarella); 

			System.out.println("add Topping:" + name + " price:$" + super.getPrice());

			
		}

}
