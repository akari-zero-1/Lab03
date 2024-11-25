package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.*;

public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full. Cannot add more discs.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int index = findDiscIndex(disc);
        if (index != -1) { 
            System.arraycopy(itemOrdered, index + 1, itemOrdered, index, qtyOrdered - index - 1);
            itemOrdered[qtyOrdered - 1] = null; 
            qtyOrdered--;
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("Cannot find the disc in the cart!");
        }
    }

    private int findDiscIndex(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].equals(disc)) {
                return i;
            }
        }
        return -1;
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }
	public void search(String keywords) {
		int matchItem = 0;
		int i = 0;
		while (i < qtyOrdered) {
			if (itemOrdered[i].isMatch(keywords)) {
				matchItem++;
				System.out.println(itemOrdered[i].toString());
			}
			i++;
		}
		if (matchItem == 0) {
			System.out.println("No item found!");
		}
	}
	public void search(int ID) {
		int matchItem = 0;
		int i = 0;
		while (i < qtyOrdered) {
			if (itemOrdered[i].getId() == ID) {
				matchItem++;
				System.out.println(itemOrdered[i].toString());
			}
			i++;
		}
		if (matchItem == 0) {
			System.out.println("No item found!");
		}
	}
	
	
}
