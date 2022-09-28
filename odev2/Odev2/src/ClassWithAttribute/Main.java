package ClassWithAttribute;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "laptop", "Asus laptop", 234.1, 3, "blue");
		
		/*product1.setName("laptop"); 
		product1.setId(1);
		product1.setDescription("Asus Laptop");
		product1.setPrice(234.56);
		product1.setStockAmount(3);
		product1.setRenk("Gri");
		//product1.setKod("32r4373");*/
		
		System.out.println("decrib:" + product1.getDescription());
		System.out.println("id: " + product1.getId());
		System.out.println("kod: " + product1.getKod());
		System.out.println("name: " + product1.getName());
		System.out.println("price: " + product1.getPrice());
		System.out.println("renk: " + product1.getRenk());
		System.out.println("stock amount: " + product1.getStockAmount());
		
		
		ProductManager productManager1 = new ProductManager();
		productManager1.add(product1);
		
		

	}

}
