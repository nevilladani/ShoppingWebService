package domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
	private Map<String, CartItem> map = new LinkedHashMap();
	private double price; 
	
	public void add(Computer computer){
		//Check whether the product has existed
		CartItem item = map.get(computer.getId());
		
		if(item==null){
			item = new CartItem();
			item.setComputer(computer);
			item.setQuantity(1);
			map.put(computer.getId(), item);
		}else{
			item.setQuantity(item.getQuantity()+1);
		}
	}
	
	public Map<String, CartItem> getMap() {
		return map;
	}
	public void setMap(Map<String, CartItem> map) {
		this.map = map;
	}
	public double getPrice() {
		double totalPrice = 0;
		
		for(Map.Entry<String, CartItem> entry: map.entrySet()){
			CartItem item = entry.getValue();
			totalPrice+= item.getPrice();
		}
		
		this.price = totalPrice;
		
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
