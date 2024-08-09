package id.ac.binus;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		boolean cek = true;
		int bilangan = 0;
		do {
			try {
				System.out.println("Entry Sebuah Bilangan :");
				bilangan = scanner.nextInt();
				cek = true;
			}catch (Exception e) {
				cek = false;
				System.out.println("Entry Data harus Bilangan");
				}
			scanner = new Scanner(System.in);
	}while (!cek);
		
		if(bilangan%2==0)
			System.out.println("Genap");
		else
			System.out.println("Ganjil");

		
	}

}