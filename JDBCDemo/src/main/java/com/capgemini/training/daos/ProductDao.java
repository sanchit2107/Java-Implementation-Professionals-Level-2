package com.capgemini.training.daos;

import java.util.List;

import com.capgemini.training.model.Login;
import com.capgemini.training.model.Product;

 public interface ProductDao {
	
	public List<Product> retriveProducts();
	public Product retriveProductById(int pid);
	public List<Product> retriveProductByBrand(String band);
	public void insertProduct(Product p);
	public void deleteProduct(int pid);
	public void updateProduct(Product p);
	public List<Product> retriveProductByName(String pname);
	public List<Product> retriveProdcutByPrice(double price);
}
