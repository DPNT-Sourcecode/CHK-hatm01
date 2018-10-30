package befaster.solutions.CHK;

import java.util.HashSet;
import java.util.Set;

public class CheckoutSolution {
	
	class Item{
		private char itemName;
		private Integer itemPrice;
		private Integer quantityOffer;
		private Integer quantityOfferPrice;
		
		public Item(char itemName, Integer itemPrice, Integer quantityOffer, Integer quantityOfferPrice){
			this.itemName = itemName;
			this.itemPrice = itemPrice;
			this.quantityOffer = quantityOffer;
			this.quantityOfferPrice = quantityOfferPrice;
		}
		
		public char getItemName() {
			return itemName;
		}
		public void setItemName(char itemName) {
			this.itemName = itemName;
		}
		public Integer getItemPrice() {
			return itemPrice;
		}
		public void setItemPrice(Integer itemPrice) {
			this.itemPrice = itemPrice;
		}
		public Integer getQuantityOffer() {
			return quantityOffer;
		}
		public void setQuantityOffer(Integer quantityOffer) {
			this.quantityOffer = quantityOffer;
		}
		public Integer getQuantityOfferPrice() {
			return quantityOfferPrice;
		}
		public void setQuantityOfferPrice(Integer quantityOfferPrice) {
			this.quantityOfferPrice = quantityOfferPrice;
		}
	}

	private Set<Item> items;
	
	public CheckoutSolution(){
		items = new HashSet<Item>();
		items.add(new Item('A', 50, 3, 130));
		items.add(new Item('B', 30, 2, 45));
		items.add(new Item('C', 20, null, null));
		items.add(new Item('D', 15, null, null));
	}
	
	public Integer checkout(String skus) {
    	// checking only the capital letters
    	for(int i = 0; i < skus.length(); i++){
    		if(skus.charAt(i) < 65 && skus.charAt(i) > 90){
        		return -1;
        	}
    	}
    	
    	
    }
}
