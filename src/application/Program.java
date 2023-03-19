package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String clientBirthDate = sc.nextLine();
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), new Client(clientName, clientEmail, LocalDate.parse(clientBirthDate, formatter)));
		
		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		for(int i=1; i<=quantity; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
			
		}
		System.out.println("ORDER SUMARY: ");
		System.out.println(order);
		
		
		sc.close();

	}

}
