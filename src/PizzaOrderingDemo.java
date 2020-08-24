
public class PizzaOrderingDemo {
	public static void main(String[] args) {
		
		Pizza pizza_neapolitan = new Pizza("Neapolitan","large");
    
    	Pizza_Interface pizza_neapolitan_tomatoSauce = new TomatoSauce(pizza_neapolitan);
    	Pizza_Interface pizza_neapolitan_tomatoSauce_garlic = new Garlic(pizza_neapolitan_tomatoSauce);
    	Pizza_Interface pizza_neapolitan_tomatoSauce_garlic_basil = new Basil(pizza_neapolitan_tomatoSauce_garlic);
    	
    	
    	Pizza pizza_deepfish = new Pizza("DeepFish","medium");
		
		Pizza_Interface pizza_deepfish_whitesauce = new WhiteSauce(pizza_deepfish);
    	Pizza_Interface pizza_deepfish_whitesauce_mozzarella = new Mozzarella(pizza_deepfish_whitesauce);
		
    	
    	Pizza pizza_newyork = new Pizza("NewYork","small");
    	
    	Pizza_Interface pizza_newyork_tomato = new TomatoSauce(pizza_newyork);
    	Pizza_Interface pizza_newyork_tomato_basil = new Basil(pizza_newyork_tomato);

        System.out.println();

		pizza_neapolitan_tomatoSauce_garlic_basil.GetFullDescription();
        System.out.println();
        
        pizza_deepfish_whitesauce_mozzarella.GetFullDescription();
        System.out.println();

        pizza_newyork_tomato_basil.GetFullDescription();
        System.out.println();

	}

}
