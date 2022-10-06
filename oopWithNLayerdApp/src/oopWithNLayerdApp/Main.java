package oopWithNLayerdApp;

import oopWithNLayerdApp.Core.logging.DataBaseLogger;
import oopWithNLayerdApp.Core.logging.FileLogger;
import oopWithNLayerdApp.Core.logging.Logger;
import oopWithNLayerdApp.business.ProductManager;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Uphone Xr", 10000 );
		
		Logger[] loggers = {new DataBaseLogger(), new FileLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);

	}

}
