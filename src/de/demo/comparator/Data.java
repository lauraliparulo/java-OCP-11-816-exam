package de.demo.comparator;

import java.util.Comparator;

public class Data implements Comparable<Data>, Comparator<Data>{
	int number;
	
	Data(int number){
		this.number = number;
	}

	@Override
	public int compare(Data arg0, Data arg1) {
	return arg1.number - arg0.number;
	}

	@Override
	public int compareTo(Data arg0) {
		return number - arg0.number;
	}

	
	
}
