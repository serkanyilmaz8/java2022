package oopWithNLayerdApp.business;

import java.util.List;

import oopWithNLayerdApp.Core.logging.Logger;
import oopWithNLayerdApp.dataAccess.HibernateProductDao;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[]  loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	
	
	public void add(Product product) throws Exception {
		if(product.getUnitPrice()<10) {
			throw new Exception("unit prise must be greater than 10");
		}
		
		//ProductDao productDao = new HibernateProductDao();
		productDao.add(product);
		
		for(Logger logger:loggers) {
			logger.log(product.getName());
		}
		
	}
}
