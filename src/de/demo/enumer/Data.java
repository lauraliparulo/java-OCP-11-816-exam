package de.demo.enumer;

public enum Data {


	INTERNAL(3) {
		@Override
		int set() {
			// TODO Auto-generated method stub
			return 0;
		}
	},
	EXTERNAL(4) {
		int set()
		{
			number = 4;
			System.out.println(number);
			return number;
		}		
	};
	
	int number=2;
	
	Data(long l){
		number++;
	}	
	
	Data(Integer i){
		number--;
	}
	
	abstract int set();
}
