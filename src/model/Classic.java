package model;

public class Classic extends Transport {

	public Classic(int jarak) {
		super(jarak, 3000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Hitung() {
		double total = getTarif();
		if (jarak >= 2) {
			int multi = (int) Math.ceil(jarak /2);
			System.out.println(multi);
			total += multi * 350;
		}
		
		if (jarak >=100) {
			int multi = (int) Math.ceil((jarak /100));
			total -= multi * 1000;
		}
		return total;
	}
	
}
