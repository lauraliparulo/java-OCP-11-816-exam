package de.demo.files;

import java.io.Serializable;

public class Data implements Serializable {

	int val1 = 1;
	//only non static and non transient values fields are serialized
	
	static int val2 = 2;
	transient int val3 = 4;
	
	
}
