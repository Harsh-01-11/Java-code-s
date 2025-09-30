package com.product;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparator<Product>{
	private String name;
	private Integer price;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}


	public Product(String name,Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return name.length();
	}

	/*
	 * @Override public boolean equals(Object obj) { if (obj instanceof Product &&
	 * this.name == ((Product)obj).name) {
	 * System.out.println("======================"); return true;
	 * 
	 * } System.out.println("===--------------====="); return false;
	 * 
	 * // if (this == obj) // return true; // if (obj == null) // return false; //
	 * if (getClass() != obj.getClass()) // return false; // Product other =
	 * (Product) obj; // return Objects.equals(name, other.name); }
	 */

	
//	
//	@Override
//	public int compare(Product o) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(o.name);
//	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
