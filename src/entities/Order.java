package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities_enum.OrderStatus;

public class Order {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	// attributes
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> orderItem = new ArrayList<>();
	
	// constructors
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	// methods
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + this.moment.format(formatter) + "\n");
		sb.append("Order status: " + this.status + "\n");
		sb.append(client);
		sb.append("Order items:\n");
		for (OrderItem orderItem : orderItem) {
			sb.append(orderItem);
		}
		sb.append("Total price: $" + String.format("%.2f", total(orderItem)));
		return sb.toString();
	}
	
	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	public double total(List<OrderItem> orderItem) {
		double sum = 0;
		for(OrderItem list : this.orderItem) {
			sum += list.subTotal(list.getQuantity(), list.getPrice());
		}
		return sum;
	}

	// getters and setters
	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

}
