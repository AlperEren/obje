package obje;

public class Product {
	private String name;
	private double price;
	private double discoundRate;
	
	public double getLastPrice() {
		return this.price*(100-this.discoundRate)/100;
	}
	
	public void setDiscoundRate(double discoundRate) {
		this.discoundRate=discoundRate;
	}
	public double getDiscoundRate() {
		return this.discoundRate;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}
}
