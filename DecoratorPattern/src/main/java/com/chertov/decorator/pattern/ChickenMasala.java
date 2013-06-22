package com.chertov.decorator.pattern;

public class ChickenMasala extends PizzaToppings {

	private Pizza pizza;

	public ChickenMasala(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return pizza.description() + " with chicken masala, ";
	}

}
