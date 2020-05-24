package de.demo.function;

public class Test2 {

	
	static void calculate(Double origin, Double rate, Payback<Double> func) {
		
		double payback = func.apply(origin, rate);
		
		System.out.println(payback);
		
	}
	
	
	
	public static void main(String[] args) {
		
		double origin = 1000;
		
		double rate = 0.1;
		
		calculate(origin, rate, new Payback<Double>() {
			
			public Double apply(Double origin, Double rate) {
				return origin * (1+rate);
			}
			
			
		}::apply);
		
	}
}
