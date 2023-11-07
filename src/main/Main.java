package main;

import java.util.Scanner;

import model.Classic;
import model.Limousine;
import model.Transport;

public class Main {
	Scanner s = new Scanner(System.in);
	public Main() {
		while (true) {
			System.out.println("Tranquil Express");
			System.out.println("1. Classic Taxi");
			System.out.println("2. Limousine Taxi");
			System.out.println("3. Exit");
			int choose;
			do {
				try {
					System.out.print("Choose your taxi");
					choose = s.nextInt();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					choose = -1;
				}
				s.nextLine();
			} while (choose < 1 || choose > 3);
			switch (choose) {
			case 1:
				menu1();
				break;
			case 2:
				menu2();
				break;
			case 3:
				System.exit(0);
				break;

			}
		}
	}
	
	void menu1() {
		int jarak;
		
		do {
			try {
				System.out.print("Total KM : ");
				jarak = s.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jarak = -1;
			}
			s.nextLine();
		} while (jarak <= 0);
		
		Transport c = new Classic(jarak);
				
		System.out.println("Payment : " + c.Hitung());
		System.out.println(" ");
	}
	
	void menu2() {
int jarak;
		
		do {
			try {
				System.out.print("Total KM : ");
				jarak = s.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jarak = -1;
			}
			s.nextLine();
		} while (jarak <= 0);
		
		Transport l = new Limousine(jarak);
				
		System.out.println("Payment : " + l.Hitung());
		System.out.println(" ");
	}

	public static void main(String[] args) {
		new Main();

	}

}
