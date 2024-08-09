package main;

public class Kubus implements BangunRuang {

	private int sisi;
	
	public Kubus(int sisi) {
		
		this.sisi = sisi;
		
	}

	@Override
	public int hitungLuas() {
		// TODO Auto-generated method stub
		return 6*(this.sisi*this.sisi);
	}

	@Override
	public int hitungKeliling() {
		// TODO Auto-generated method stub
		return 12*(this.sisi);
	}

	@Override
	public int hitungVolume() {
		// TODO Auto-generated method stub
		return this.sisi*this.sisi*this.sisi;
	}
}


