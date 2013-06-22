package com.chertov.decorator.pattern;

public class EntryPoint {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();

		pizza = new ChickenMasala(pizza);
		pizza = new Onion(pizza);
		pizza = new Mozzarella(pizza);

		System.out.println("Yout're getting " + pizza.description());

	}

}
