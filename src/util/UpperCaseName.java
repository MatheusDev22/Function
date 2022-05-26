package util;

import java.util.function.Function;

import entiti.Product;

public class UpperCaseName implements Function<Product, String>{

	public String apply(Product p){
		
		return p.getName().toUpperCase();
	}
}
