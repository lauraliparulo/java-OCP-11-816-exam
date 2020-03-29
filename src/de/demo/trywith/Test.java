package de.demo.trywith;

public class Test {

	public static void main(String[] args) {
		
		try(MyResource myResource = new MyResource()){
			myResource.open();
			
			throw new NullPointerException("try");
		} catch(Exception e) {
			throw new IllegalArgumentException("catch");
		} finally {
			throw new ClassCastException("finally");
		}
		
	}

}
