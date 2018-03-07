package ru.korston;

public class Ticket {
    private String place;
    private String param2;
    private String param3;
    private long barcode;
    private int purchase;

    public Ticket(String place, long barcode, int purchase) {
        this.place = place;
        this.barcode = barcode;
        this.purchase = purchase;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public int getPurchase() {
        return purchase;
    }

    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }
}
