package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entiti.Product;

public class Program {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		List <Product> list = new ArrayList<>();
		
		list.add(new Product ("Tv", 900.0) );
		list.add(new Product("Mouse", 50.00) );
		list.add(new Product("Tablet", 350.50) );
		list.add(new Product("Hd Case", 80.90) );
	}
}
