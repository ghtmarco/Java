package main;

public class Balok implements BangunRuang{

	private int panjang;
	private int lebar;
	private int tinggi;
	
	public Balok(int panjang, int lebar, int tinggi) {
		
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
		
	}

	@Override
	public int hitungLuas() {
		// TODO Auto-generated method stub
		return 2*((this.panjang*this.lebar)+(this.panjang*this.tinggi)+(this.lebar*this.tinggi));
	}

	@Override
	public int hitungKeliling() {
		// TODO Auto-generated method stub
		return 4*(this.panjang+this.lebar+this.tinggi);
	}

	@Override
	public int hitungVolume() {
		// TODO Auto-generated method stub
		return this.panjang*this.lebar*this.tinggi;
	}

}
