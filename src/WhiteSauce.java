
public class WhiteSauce extends Decorator {
		private int price_whitesauce = 4;
		private String name = "WhiteSauce";

		public WhiteSauce(Pizza_Interface pizza_input) {
			super(pizza_input);
		}
			
		public void GetFullDescription() {
			super.GetFullDescription();			
			addTopping_whiteSauce();
	}

		public void addTopping_whiteSauce() {
			super.addPrice(price_whitesauce); 

			System.out.println("add Topping:" + name + " price:$" + super.getPrice());

			
		}
}
