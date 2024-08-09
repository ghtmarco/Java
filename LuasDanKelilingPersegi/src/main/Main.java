package main;

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		
		System.out.print("Masukan Angka : ");
		int input;
		input = scan.nextInt();
		Persegi persegi = new Persegi(input);
		System.out.println("Hasil");
		System.out.println("Keliling : " + persegi.hitungKeliling() + "\n" + "Luas : " + persegi.hitungLuas());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
