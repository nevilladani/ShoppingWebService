package domain;

public class Computer {
	private String id;
	private String name;
	private String brand;
	private double price;
	private String description;
	
	public Computer(String id, String name, String brand, double price,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
