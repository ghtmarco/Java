package main;

public class Segitiga implements BangunDatar{

	private int a;
	private int t;
	
	public Segitiga(int a, int t) {
		this.a = a;
		this.t = t;
	}

	@Override
	public int hitungLuas() {
		return (1/2*this.a*this.t);
	}

	@Override
	public int hitungKeliling() {
		return (this.a+this.a+this.a);
	}

}
