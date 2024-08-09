package test;

import main.AppleJuice;
import main.Capucino;

public class Main {

	public Main() {
		kopi Kopi = new kopi(10);
		System.out.println(Kopi.bijiKopi);
		
		System.out.println("");
		
		
		Capucino capucino = new Capucino(70, 10.5);
		capucino.print();
		
		System.out.println();
		
		AppleJuice juice = new AppleJuice(30, 500);
		System.out.println("Gula:" + juice.sugar + "gr");
		System.out.println("Water:" + juice.water + "ml");
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
