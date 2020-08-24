
public class TomatoSauce extends Decorator {
		private int price_tomatosauce = 3;
		private String name = "TomatoSauce";
		
		public TomatoSauce(Pizza_Interface pizza_input) {
			super(pizza_input);
		}
		
		public void GetFullDescription() {
			super.GetFullDescription();
			addTopping_tomato();
		}
			
			
		public void addTopping_tomato() {
			
			super.addPrice(price_tomatosauce); 
			
			System.out.println("add Topping:" + name + " price:$" + super.getPrice());
			
		}
}
