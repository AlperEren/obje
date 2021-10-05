package obje;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Casper Excalibur");
		product.setPrice(12269.00);
		product.setDiscoundRate(18);
		System.out.println(product.getName());
		System.out.println("Fiyat :" + product.getPrice());
        System.out.println("Ýndirimli Fiyat :"
		+product.getLastPrice());
	}
}
