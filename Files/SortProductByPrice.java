package com.product;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()-o2.getPrice();
	}

}
