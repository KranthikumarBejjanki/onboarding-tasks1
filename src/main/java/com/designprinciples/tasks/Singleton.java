package com.designprinciples.tasks;

public class Singleton {

	private static Singleton obj = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstanceOfSingletonExample() {
		return obj;
	}

	public static void main(String[] args) {
		Singleton singletonExample1 = Singleton.getInstanceOfSingletonExample();
		Singleton singletonExample2 = Singleton.getInstanceOfSingletonExample();

		System.out.println(singletonExample1.hashCode());
		System.out.println(singletonExample2.hashCode());

	}
}
