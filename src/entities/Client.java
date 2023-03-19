package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	// attributes
	private String name;
	private String email;
	private LocalDate birthDate;
	
	// constructors
	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	// methods
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Client: " + this.name + "(" + this.birthDate.format(formatter) + ") - " + this.email + "\n");
		return sb.toString();
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

}
