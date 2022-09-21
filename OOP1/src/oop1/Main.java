package oop1;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "vade orani: ";
		
		Product product1 = new Product();
		product1.name = "Deloghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.disCount = 7;
		product1.unitInStock = 3;
		product1.imageUrl = "bilmemene.jpeg";
		
		System.out.println(product1.name);
	}

}
