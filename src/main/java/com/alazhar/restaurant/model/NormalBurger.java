
package com.alazhar.restaurant.model;

import com.alazhar.restaurant.enums.BreadColor;
import com.alazhar.restaurant.enums.MeatType;
import com.alazhar.restaurant.interfaces.BurgerSandwiches;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlaaAli
 */
public class NormalBurger implements BurgerSandwiches {

    private String sandwichName;
    private double sandwichPrice;
    private MeatType meatType;
    private BreadColor breadColor;

    private List<Additional> additionals = new ArrayList<>();

    public double calcCost(List<Additional> additionalsList, double price) {
        if (additionalsList.isEmpty()) {
            return price;
        } else {
            for (Additional additional : additionalsList) {
                price += additional.getAdditionalPrice();
            }
            this.additionals = additionalsList;
            return price;
        }
    }

    public List<Additional> getAdditionals() {
        return additionals;
    }

    public void setAdditionals(List<Additional> additionals) {
        this.additionals = additionals;
    }

    public NormalBurger() {
    }

    public NormalBurger(double sandwichPrice, MeatType meatType, BreadColor breadColor, List<Additional> additionalsList) {
        this.additionals = additionals;
        this.sandwichName = "Normal Burger";
        this.sandwichPrice = calcCost(additionalsList, sandwichPrice);
        this.meatType = meatType;
        this.breadColor = breadColor;
    }

    public NormalBurger(double sandwichPrice, MeatType meatType, BreadColor breadColor) {
        this.sandwichName = "Normal Burger";
        this.sandwichPrice = sandwichPrice;
        this.meatType = meatType;
        this.breadColor = breadColor;
    }

    public NormalBurger(String sandwichName, double sandwichPrice, MeatType meatType, BreadColor breadColor, List<Additional> additionalsList) {
        this.sandwichName = sandwichName;
        this.sandwichPrice = calcCost(additionalsList, sandwichPrice);
        this.meatType = meatType;
        this.breadColor = breadColor;
        this.additionals = additionals;
    }

    public NormalBurger(String sandwichName, double sandwichPrice, MeatType meatType, BreadColor breadColor) {
        this.sandwichName = sandwichName;
        this.sandwichPrice = sandwichPrice;
        this.meatType = meatType;
        this.breadColor = breadColor;
        if (this.setDefualtAdditionals() != null) {
            this.additionals = this.setDefualtAdditionals();
        }
    }

    public String getSandwichName() {
        return sandwichName;
    }

    public void setSandwichName(String sandwichName) {
        this.sandwichName = sandwichName;
    }

    public double getSandwichPrice() {
        return sandwichPrice;
    }

    public void setSandwichPrice(double sandwichPrice) {
        this.sandwichPrice = sandwichPrice;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    public BreadColor getBreadColor() {
        return breadColor;
    }

    public void setBreadColor(BreadColor breadColor) {
        this.breadColor = breadColor;
    }

    @Override
    public List<Additional> setDefualtAdditionals() {
        return this.additionals;
    }

    @Override
    public String toString() {
        return "NormalBurger{ \n" + "sandwichName=" + 
                sandwichName + ", sandwichPrice=" + 
                sandwichPrice + ", meatType=" + 
                meatType + ", breadColor=" + 
                breadColor + ", \n additionals=" + additionals + '}';
    }
}
