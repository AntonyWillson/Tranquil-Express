package model;

public class Limousine extends Transport {

	public Limousine(int jarak) {
		super(jarak, 25000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Hitung() {
		int total = getTarif();
		if (jarak >= 2) {
			int multi = (int) Math.ceil(jarak /2);
			total += multi * 4000;
		}
		return total;
	}

}
