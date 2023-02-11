package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

    	this.id = id;

        int hours = Integer.valueOf(deliveryTime.substring(0, 2));
        int minutes = Integer.valueOf(deliveryTime.substring(3));

        this.deliveryTime = hours * 60 + minutes;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}

/* hours=if deliveryTime is "12:34", then deliveryTime.substring(0, 2) would return "12", and Integer.valueOf("12") would return 12.
 * minutes=if deliveryTime is "12:34", then deliveryTime.substring(3) would return "34", and Integer.valueOf("34") would return 34.
 */