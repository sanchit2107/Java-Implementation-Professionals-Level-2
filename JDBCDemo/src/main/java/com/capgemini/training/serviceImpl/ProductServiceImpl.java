package com.capgemini.training.serviceImpl;

import java.util.List;

import com.capgemini.training.daos.ProductDao;
import com.capgemini.training.exceptions.BusineesException;
import com.capgemini.training.model.Product;
import com.capgemini.training.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	ProductDao productDao;

	@Override
	public List<Product> retriveProducts() throws BusineesException {
		
		List<Product> products = productDao.retriveProducts();
		if(!products.isEmpty()) {
			return products;
		} else {
			throw new BusineesException("No product available");
		}
	}

	@Override
	public Product retriveProductById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> retriveProductByBrand(String band) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertProduct(Product p) throws BusineesException {
		
		if(p.getPid() >= 10 && p.getPid() <=99) {
			if(p.getPname().length() >=3 && p.getPname().length() <= 10) {
				if(p.getBrand() == "[a-zA-Z]{4,12}") {
					if(p.getQty() >=0 ) {
						if(p.getPrice() > 100000) {
							
						}
					}
				}
			}
		}
		
		
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> retriveProductByName(String pname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> retriveProdcutByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

}
