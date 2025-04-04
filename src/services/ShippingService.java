package services;

import models.Shippable;

import java.util.List;

public class ShippingService {
    public static void ship(List<Shippable> items) {
        double totalWeight = 0;
        System.out.println("** Shipment Notice **");
        for (Shippable item : items) {
            System.out.println(item.getName() + " " + item.getWeight() + "kg");
            totalWeight += item.getWeight();
        }
        System.out.println("Total package weight: " + totalWeight + "kg\n");
    }
}
