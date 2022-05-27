package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entiti.Product;
import util.UpperCaseName;

public class Program {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		List <Product> list = new ArrayList<>();
		
		list.add(new Product ("Tv", 900.0) );
		list.add(new Product("Mouse", 50.00) );
		list.add(new Product("Tablet", 350.50) );
		list.add(new Product("Hd Case", 80.90) );
		
		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList() );//convert stream em list
		
		names.forEach(System.out::println);
	}												 	
}
