package com.testing;

public class coding {

	private void pooda() {
		System.out.println("poodapaiya");
		String value = "name";
	}
	
	
	public static void main(String[] args) {

		String S2 = "India.Srilanka.Pakistan";
		
		String data[]=S2.split("\\.");
		
		for(int i=0; i<data.length; i++) {
			String value = data[i];
			System.out.println(value);
			
	}		
		
		String str = " My name is Dass";
		String[] split = str.split(" ");
		for(int i=0; i<split.length; i++) {
			String du=split[i];
			System.out.println(du);
		}
		
		
		
	}
}


