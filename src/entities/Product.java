package entities;

public class Product {

	// attributes
	private String name;
	private Double price;
	
	// constructors
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	// methods
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + ", $" + String.format("%.2f", this.price));
		return sb.toString();
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
