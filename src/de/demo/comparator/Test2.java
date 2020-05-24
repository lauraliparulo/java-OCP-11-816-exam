package de.demo.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	Data2 d1 = new Data2(1);
	Data2 d2 = new Data2(2);
	Data2 d3 = new Data2(3);
	
	List list = new ArrayList<>(List.of(d1,d2,d3));
	
	Comparator comparator = (o1,o2)-> o2.number - o1.number;
	
	Collections.sort(list, comparator.reversed()));
	
}
