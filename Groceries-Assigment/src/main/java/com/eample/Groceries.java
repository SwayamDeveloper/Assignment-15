package com.eample;

public class Groceries {

	private int Id;
	private String name;
	private double price;
	private String quantity;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Groceries(int id, String name, double price, String quantity) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Groceries() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Groceries [Id=" + Id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
