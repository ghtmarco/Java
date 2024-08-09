package main;

import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		
		int panjang = 0;
		boolean cek = true;
		
		do {
			try {
				System.out.println("Entry Sebuah Bilangan: ");
				panjang = scan.nextInt();
				if(panjang <= 2) {
					cek = false;
					System.out.println("Bilangan (< 2): ");
				}else {
					cek = true;
				}
			}catch (Exception e) {
				cek = false;
				System.out.println("Invalid");
				}
	}while (!cek);
		int[][] bilangan = new int[panjang][panjang];
		for(int i = 0; i < bilangan.length; i++) {
			for(int j = 0; j < bilangan.length; j++) {
				bilangan[i][j] = (i+1)*(j+1);
				System.out.print(bilangan[i][j] + " ");
				}
			System.out.println("");
			}
		
		System.out.println("");
		
		for(int i = 0; i < panjang; i++) {
			for(int j = 0; j < panjang; j++) {
				bilangan[i][j] = (i+1)*(j+1);
				if(bilangan[i][j] %2 == 1) {
					System.out.print("Ganjil");
					System.out.print(" ");
				}else {
					System.out.print("Genap");
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	
	}
	

	public static void main(String[] args) {
		new Main();
	}

}
