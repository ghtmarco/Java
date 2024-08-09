package id.ac.binus;

import java.util.Scanner;

public class SelectionRepetition {

	public static void main(String[] args) {
		
		
		int x = 0;
		
		for(int i = 0; i<5; i++) {
			System.out.println("FOR: " + i);
//			System.out.println(i);
			
		}
		
		while(x<5) {
			System.out.println("While: " + x);
//			System.out.println(x);
			x++;
		}
		
		int y = 0;
		
		do {
			System.out.println("Do While: " + y);
			y++;
		}while(y<10);
		
		
//		Scanner scanner = new Scanner(System.in);
//		int radius = scanner.nextInt();
//		float area = 0;
//		if (radius>=0) {
//			area = (float) (radius*radius*Math.PI);
//			System.out.println("The area for the circle of radius : " + radius + " is " + area);
//		}
//	}
//}
//	
		
//		int bilangan = scanner.nextInt();
//		int hasil = 0;
//		
//		if(bilangan>0) {
//			if(bilangan % 2 == 1)
//				hasil = bilangan + bilangan;
//				else
//					hasil = bilangan * bilangan;
//			
//			System.out.println("hasil operasi adalah " + hasil);
//		}else {
//			System.out.println("Masukan bilangan positif ");
//		}

//	System.out.println((bilangan %2 == 0)? "Genap" : "Ganjil");
	
		
	
	}
}