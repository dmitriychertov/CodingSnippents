package com.chertov.decorator.pattern;

public class Mozzarella extends PizzaToppings {

	private Pizza pizza;

	public Mozzarella(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return pizza.description() + "and mozzarella cheese. ";
	}

}
