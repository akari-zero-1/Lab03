package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.*;

public class Store {
    private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[20];
    private int qtyItem;

    public void addDVD(DigitalVideoDisc dvd) {
        itemInStore[qtyItem] = dvd;
        qtyItem++;
        System.out.println("The DVD has been successfully added.");
        System.out.println();
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        int index = -1;
        if (qtyItem <= 0) {
            System.out.println("The store is currently empty.");
            System.out.println();
        } else {
            int i = 0;
            while (i < qtyItem) {
                if (itemInStore[i].equals(dvd)) {
                    index = i;
                    break;
                }
                i++;
            }
            if (index == -1) {
                System.out.println("This DVD is not available in the store.");
                System.out.println();
            } else {
                i = index;
                while (i < qtyItem - 1) {
                    itemInStore[i] = itemInStore[i + 1];
                    i++;
                }
                itemInStore[qtyItem - 1] = null;
                qtyItem--;
                System.out.println("DVD has been removed successfully.");
                System.out.println();
            }
        }
    }
}
