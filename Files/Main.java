package com.product;

import java.util.*;

//pojoclass

public class Main {
	public static void main(String[] args) {
//		Product p1  = new Product("Iphone 17");
//		Product p2  = new Product("Iphone 16");
//		Product p3  = new Product("Iphone 15");
//		Product p4  = new Product("Iphone 15");
		
		Set<Product> s = new HashSet<Product>();
		s.add(new Product("Iphone 17"));
//		s.add(new Product("Iphone 16"));
		s.add(new Product("Iphone 15"));
		s.add(new Product("Iphone 15"));
		s.add(new Product("Samsang"));
		
		
//		for(Product p : s) {
//			System.out.println(p);
//		}
		System.out.println(s);
	}
}
