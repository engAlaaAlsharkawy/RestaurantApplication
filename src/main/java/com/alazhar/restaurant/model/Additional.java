
package com.alazhar.restaurant.model;

/**
 *
 * @author AlaaAli
 */
public class Additional {
    private String additionalName;
    private double additionalPrice;

    public Additional() {
    }

    public Additional(String additionalName, double additionalPrice) {
        this.additionalName = additionalName;
        this.additionalPrice = additionalPrice;
    }

    public String getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    @Override
    public String toString() {
        return "Additional{" + "additionalName=" + additionalName + ", additionalPrice=" + additionalPrice + '}';
    }
}
