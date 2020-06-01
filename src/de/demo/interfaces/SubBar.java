package de.demo.interfaces;

public interface SubBar extends Bar {
	@Override
	default void m() {
		System.out.println("subbar");
	}

}
