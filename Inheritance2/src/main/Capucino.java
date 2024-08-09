package main;

import test.kopi;

public class Capucino extends kopi{
	
	double susu;

	public Capucino(int bijiKopi, double susu) {
		super(bijiKopi);
		this.susu = susu;
	}
	
	
	public void print() {
		
		System.out.println("Biji Kopi: " + bijiKopi);
		System.out.println("Susu (ML) : " + susu);
	}

}
