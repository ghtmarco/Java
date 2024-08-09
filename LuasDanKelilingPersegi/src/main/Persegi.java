package main;

public class Persegi implements BangunDatar {
	
	int sisi;

	public Persegi(int sisi) {
		
		this.sisi = sisi;		
	}

	@Override
	public int hitungLuas() {
		return sisi*sisi;
		
		
	}

	@Override
	public int hitungKeliling() {
		return 4*sisi;
		// TODO Auto-generated method stub
		
	}

}
