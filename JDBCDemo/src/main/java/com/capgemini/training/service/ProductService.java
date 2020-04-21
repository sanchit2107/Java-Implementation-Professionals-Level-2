package com.capgemini.training.service;

import java.util.List;

import com.capgemini.training.exceptions.BusineesException;
import com.capgemini.training.model.Product;

public interface ProductService {
	
	public List<Product> retriveProducts() throws BusineesException ;
	public Product retriveProductById(int pid) throws BusineesException ;
	public List<Product> retriveProductByBrand(String band) throws BusineesException ;
	public void insertProduct(Product p) throws BusineesException ;
	public void deleteProduct(int pid) throws BusineesException ;
	public void updateProduct(Product p) throws BusineesException ;
	public List<Product> retriveProductByName(String pname) throws BusineesException ;
	public List<Product> retriveProdcutByPrice(double price) throws BusineesException ;
}
