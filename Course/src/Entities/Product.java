package Entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInstock() {
		return price * quantity ;
	}
	public voic addProducts(int quantity) {
		this.quantity += quantity;		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
}
