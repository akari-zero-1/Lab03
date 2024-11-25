package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 17.95);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 22.95);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 16.99);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Frozen", "Animation", 16.20);
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost is: " + anOrder.totalCost());
		System.out.println();
		anOrder.removeDigitalVideoDisc(dvd1);
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.removeDigitalVideoDisc(dvd4);
		anOrder.removeDigitalVideoDisc(dvd3);
		
		anOrder.addDigitalVideoDisc(dvd4);
	}
}