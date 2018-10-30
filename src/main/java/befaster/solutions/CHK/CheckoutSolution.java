package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckoutSolution {

	class Item {
		private char itemName;
		private Integer itemPrice;
		private Integer quantityOffer;
		private Integer quantityOfferPrice;

		public Item(char itemName, Integer itemPrice, Integer quantityOffer, Integer quantityOfferPrice) {
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
		Integer total = 0;
		Map<Character, Integer> mapItems = new HashMap<Character, Integer>();
		// checking only the capital letters
		for (int i = 0; i < skus.length(); i++) {
			if (skus.charAt(i) < 65 && skus.charAt(i) > 68) {
				return -1;
			}
			Integer mapQty = mapItems.get(skus.charAt(i));
			if (mapQty != null) {
				mapItems.remove(skus.charAt(i));
				mapItems.put(skus.charAt(i), ++mapQty);
			} else {
				mapItems.put(skus.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : mapItems.entrySet()) {
			Item item = getItemByName(entry.getKey());
			if (item != null) {

				if (item.getQuantityOffer() != null) {
					total += (entry.getValue() / item.getQuantityOffer()) * item.getQuantityOfferPrice()
							+ (entry.getValue() % item.getQuantityOffer()) * item.getItemPrice();
				}else{
					total += entry.getValue() * item.getItemPrice();
				}
			}
		}

		return total;
	}

	private Item getItemByName(char itemName) {
		if (items == null || items.isEmpty()) {
			return null;
		}
		for (Item item : items) {
			if (itemName == item.getItemName()) {
				return item;
			}
		}
		return null;
	}
}
