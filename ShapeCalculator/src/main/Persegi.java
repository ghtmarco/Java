package main;

public class Persegi implements BangunDatar{

	private int sisi;
	
	public Persegi(int sisi) {
		this.sisi = sisi;
	}

	@Override
	public int hitungLuas() {
		return (this.sisi*this.sisi);
	}

	@Override
	public int hitungKeliling() {
		return (4*this.sisi);
	}

}

