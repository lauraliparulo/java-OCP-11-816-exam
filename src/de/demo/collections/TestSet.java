package de.demo.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(Set.of(1, 2, 4));

		set.retainAll(Set.of(2, 3, 4));

		System.out.println(set);
	}
}
