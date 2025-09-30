package com.product;

import java.util.*;

public class TreeSet1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name or price to sort choose 1 of each");
		String ch = sc.next();
		Set<Product> s =null;
		if(ch.equalsIgnoreCase("name")) {
			s = new TreeSet<Product>(new SortProductByName());
		}else {
			s = new TreeSet<Product>(new SortProductByPrice());
		}
		s.add(new Product("Zphone 17",23000));
		s.add(new Product("Iphone 16",60000));
		s.add(new Product("Hphone 15",90000));
//		s.add(new Product("Mphone 15"));
		s.add(new Product("Samsang",1000000));
		
		for(Product p : s) {
			
			System.out.println(p);
		}
//		System.out.println("=============");
//		System.out.println(s);
	}
}
