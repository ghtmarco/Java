package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	int numberOfDigits = 2;
	
	
	public void persegi() {
	System.out.println("Bangun Datar Persegi");
	System.out.println("Sisi: ");
	Persegi kotak = new Persegi(input());
	System.out.println("Luas Persegi: " +kotak.hitungLuas());
	System.out.println("Keliling Persegi: " +kotak.hitungKeliling());
	}
	
	public void persegiPanjang() {
		System.out.println("Bangun Datar Persegi Panjang");
		System.out.println("Panjang: ");
		System.out.println("Lebar: ");
		PersegiPanjang panjang = new PersegiPanjang(input(), input());
		System.out.println("Luas Persegi Panjang: " +panjang.hitungLuas());
		System.out.println("Keliling Persegi Panjang: " +panjang.hitungKeliling());
	}
	
	public void segitiga() {
		System.out.println("Bangun Datar Segitiga");
		System.out.println("alas: ");
		System.out.println("tinggi: ");
		Segitiga segitiga = new Segitiga(input(), input());
		System.out.println("Luas Segitiga: " +segitiga.hitungLuas());
		System.out.println("Keliling Segitiga: " +segitiga.hitungKeliling());
	}
	
	public void lingkaran() {
		System.out.println("Bangun Datar Lingkaran");
		System.out.println("Jari-Jari: ");
		Lingkaran lingkaran = new Lingkaran(input());
		System.out.println("Luas Lingkaran: " +lingkaran.hitungLuas());
		System.out.println("Keliling Lingkaran: " +lingkaran.hitungKeliling());
	}
	public void kubus() {
		System.out.println("Bangun Datar Kubus");
		System.out.println("Sisi: ");
		Kubus kubus = new Kubus(input());
		System.out.println("Luas Kubus: " +kubus.hitungLuas());
		System.out.println("Keliling Kubus: " +kubus.hitungKeliling());
		System.out.println("Volume Kubus: " +kubus.hitungKeliling());
	}
	public void balok() {
		System.out.println("Bangun Datar Lingkaran");
		System.out.println("Panjang: ");
		System.out.println("Lebar: ");
		System.out.println("Tinggi: ");
		Balok balok = new Balok(input(), input(), input());
		System.out.println("Luas Balok: " +balok.hitungLuas());
		System.out.println("Keliling Balok: " +balok.hitungKeliling());
		System.out.println("Volume Balok: " +balok.hitungKeliling());
	}
	
	public int input() {
        int number = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(">> ");
                number = scan.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Masukkan Angka");
                scan.nextLine();
            }
        } while (!validInput);

        return number;
    }
	
	
	
	public void bangunRuang() {
		
		int pilihan = -1;
		System.out.println("1) Kubus");
		System.out.println("2) Balok");
		System.out.println("5) Back");
		pilihan = input();
		scan.nextLine();
		
		switch(pilihan) {
		case 1:
			kubus();
			break;
			
		case 2:
			balok();
			break;

		case 5:
			menu();
			break;
			
		default:
			break;
			
		}
		
	}
	
	public void bangunDatar() {
		
		int pilihan = -1;
		System.out.println("1) Persegi");
		System.out.println("2) Persegi Panjang");
		System.out.println("3) Lingkaran");
		System.out.println("4) Segitiga Siku-Siku");
		System.out.println("5) Back");
		pilihan = input();
		scan.nextLine();
		
		switch(pilihan) {
		case 1:
			persegi();
			break;
			
		case 2:
			persegiPanjang();
			break;
			
		case 3:
			lingkaran();
			break;
			
		case 4:
			segitiga();
			break;
		case 5:
			menu();
			break;
			
		default:
			break;
		
		}
		
	}
	
	public void menu() {
		int pilihan = 0;
		
		do {
			System.out.println("Selamat Datang di kelas Intro To MAT");
			System.out.println("Menu: ");
			System.out.println("1) Bangun Datar");
			System.out.println("2) Bangun Ruang");
			System.out.println("0) Exit");
			
			pilihan = input();
			scan.nextLine();
			
			switch(pilihan) {
			case 1:
				bangunDatar();
				break;
				
			case 2:
				bangunRuang();
				break;
				
			case 0:
				System.out.println("Terima Kasih!");
				System.exit(pilihan);
				return;
				
			default:
				break;
			}
			
		}while(pilihan != 0);
	}
	
	public Main() {
		menu();
	}

	public static void main(String[] args) {
		new Main();
	}

}
