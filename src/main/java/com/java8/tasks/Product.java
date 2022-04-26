package com.java8.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	public int id;
	public String name;
	public float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
}
