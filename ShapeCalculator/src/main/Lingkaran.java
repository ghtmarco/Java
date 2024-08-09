package main;

public class Lingkaran implements BangunDatar{

	private int R;

	public Lingkaran(int R) {
		this.R = R;
		
	}

	@Override
	public int hitungLuas() {
	return (int)(Math.PI*this.R*this.R);
	}
	
	@Override
	public int hitungKeliling() {
	return (int)(2*Math.PI*this.R);
	}

}
