package model;

public abstract class Transport {
	protected int jarak;
	public int tarif;
	public Transport(int jarak, int tarif) {
		super();
		this.jarak = jarak;
		this.tarif = tarif;
	}
	
	public int getJarak() {
		return jarak;
	}
	public void setJarak(int jarak) {
		this.jarak = jarak;
	}
	public int getTarif() {
		return tarif;
	}
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}
	
	public abstract double Hitung();
}
