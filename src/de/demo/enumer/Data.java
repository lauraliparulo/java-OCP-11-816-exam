package de.demo.enumer;

public enum Data {

	INTERNAL(3);
	
	int number=2;
	
	Data(long l){
		number++;
	}	
	
	Data(Integer i){
		number--;
	}
}
