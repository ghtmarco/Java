package id.ac.binus;

import java.util.Scanner;

public class WrapperClassLatihan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int bilangan = 0;
//		Integer angka = new long Integer(bilangan);
//		
//		System.out.println("Print Nilai Bilangan: " + bilangan);
//		
//		System.out.println("Nilai Minimum Integer: " + angka.MIN_VALUE);
//		
//		System.out.println("Nilai Maximum integer: " + angka.MAX_VALUE);
//		
//		long bilangan1 = 0;
//		Long angka = new Long (bilangan1);
//		
//		System.out.println("Print Nilai Bilangan: " + bilangan1);
//		
//		System.out.println("Nilai Minimum Integer: " + angka.MIN_VALUE);
//
//		System.out.println("Nilai Maximum integer: " + angka.MAX_VALUE);
//		
//		float bilangan2 = 0;
//		Float angka = new Float (bilangan2);
//		
//		System.out.println("Print Nilai Bilangan: " + bilangan2);
//		
//		System.out.println("Nilai Minimum Integer: " + angka.MIN_VALUE);
//
//		System.out.println("Nilai Maximum integer: " + angka.MAX_VALUE);
		
//		double bilangan3 = 0;
//		Double angka = new Double (bilangan3);
//		
//		System.out.println("Print Nilai Bilangan: " + bilangan3);
//		
//		System.out.println("Nilai Minimum Integer: " + angka.MIN_VALUE);
//
//		System.out.println("Nilai Maximum integer: " + angka.MAX_VALUE);
		
		
//		/*
//		 * Operasi String
//		 */
//		
//		char huruf = 'i';
//		
//		String nama = "Marco";
//		
//		String nama2 = "marco";
//		
//		if(nama.equalsIgnoreCase(nama2))
//			System.out.println("nama sama");
//		else
//			System.out.println("nama beda");
//		
//		nama = nama.replace('a', 'e');
//			System.out.println(nama);
//			
//					
//			String kalimat = "dia mengajukan dua buah syarat. Pertama, dia meminta pemuda itu untuk membendung sungai Citarum. Yang kedua, dia minta Sangkuriang untuk membuat sebuah sampan besar untuk menyeberang sungai itu.";
//		
//			kalimat = kalimat.replaceFirst("dia", "aku");
//			System.out.println(kalimat);
		
		
		/*
		 * Operasi Math
		 */
		
		
//		float bilangan = (float)Math.tan(90);
//		System.out.println(bilangan);
		
//		float bilangan = (float)Math.cos(90);
//		System.out.println(bilangan);
//		
//		float bilangan = (float)Math.sin(90);
//		System.out.println(bilangan);
//		
//		System.out.println(Math.max(33, 34));
//		
//		System.out.println(Math.min(33, 34));
//		
//		System.out.println(Math.ceil(2.5));
//		System.out.println(Math.floor(2.5));
//		System.out.println(Math.rint(2.5));
//		System.out.println(Math.round(2.5));
//		System.out.println(Math.abs(-34));
//		System.out.println(Math.PI);	
		
		/*
		 * Array Operation
		 */
		
//		int[] bilangan = new int[5];
//		
//		bilangan[0]=9;
//		bilangan[1]=11;
//		bilangan[2]=90;
//		bilangan[3]=110;
//		bilangan[4]=78;
		
//		System.out.println(bilangan [1]);
//		System.out.println(bilangan [0]);
//		System.out.println(bilangan [4]);
//		System.out.println(bilangan [2]);
//		System.out.println(bilangan [3]);
		
//		int[] angka = {99,94,87,88,89,200,400,678};
		
//		System.out.println(angka [6]);
//		System.out.println(angka [7]);
//		System.out.println(angka [1]);
//		System.out.println(angka [4]);
//		System.out.println(angka [2]);
//		System.out.println(angka [5]);
//		System.out.println(angka [3]);
//		System.out.println(angka [0]);
		
//		System.out.println(angka.length);
		
		Scanner scanner = new Scanner(System.in);
		
		int bilangan = 0;
		
		System.out.println("Masukan angka");
		bilangan = scanner.nextInt();
		
		System.out.println("Bilangan adalah: " + bilangan);
		if(bilangan % 2 == 1)
			System.out.println("Ganjil" + bilangan);
		else
			System.out.println("Genap" + bilangan);
 	}
	

}