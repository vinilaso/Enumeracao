package entities;

public class OrderItem {

	// attributes
	private Integer quantity;
	private Double price;
	private Product product;
	
	// constructors
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	// methods
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product + ", Quantity: " + this.quantity + ", Subtotal: $" + String.format("%.2f", subTotal()) + "\n");
		return sb.toString();
	}
	
	public double subTotal() {
		return (double) quantity * price;
	}
	
	// getters and setters
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
