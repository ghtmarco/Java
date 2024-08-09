package main;

public class PersegiPanjang implements BangunDatar{

	private int panjang;
	private int lebar;

	public PersegiPanjang(int panjang, int lebar) {
		
		this.panjang = panjang;
		this.lebar = lebar;
	}

	@Override
	public int hitungLuas() {
		return (int)(this.lebar*this.panjang);
	}

	@Override
	public int hitungKeliling() {
		return (int)(2*(this.panjang+this.lebar));
	}


}
