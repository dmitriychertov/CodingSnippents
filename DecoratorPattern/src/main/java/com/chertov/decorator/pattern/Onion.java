package com.chertov.decorator.pattern;

public class Onion extends PizzaToppings {

	private Pizza pizza;

	public Onion(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return pizza.description() + "onions, ";
	}

}
