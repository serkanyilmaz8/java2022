package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "vade orani: ";

		Product product1 = new Product();
		product1.setName("Deloghi Kahve Makinesi");
		product1.setDisCount(6);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(7);
		product1.setImageUrl("bilmemne.jpeg");

		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Kitchen Kahve Makinesi");
		product2.setDisCount(6);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(7);
		product2.setImageUrl("bilmemne.jpeg");

		Product product3 = new Product();
		product3.setName("Oven Kahve Makinesi");
		product3.setDisCount(6);
		product3.setUnitPrice(500);
		product3.setUnitInStock(17);
		product3.setImageUrl("bilmemne3.jpeg");

		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer ic1 = new IndividualCustomer();
		ic1.setId(1);
		ic1.setPhone("32457422821");
		ic1.setCustomerNumber("12345");
		ic1.setFirstName("Serkan");
		ic1.setLastName("Yilmaz");
		
		CorporateCustomer cc1 = new CorporateCustomer();
		cc1.setId(2);
		cc1.setCompanyName("Kodlama.io");
		cc1.setPhone("53787263");
		cc1.setCustomerNumber("256873");
		cc1.setTaxNumber("1111111111");
		
		Customer[] customers = {ic1, cc1};
		
		for (Customer customer : customers) {
			System.out.println("id of the customer: " + customer.getId());
		}
		
		
	}
	

}
