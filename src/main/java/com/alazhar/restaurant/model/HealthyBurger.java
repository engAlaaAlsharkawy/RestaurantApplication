
package com.alazhar.restaurant.model;

import com.alazhar.restaurant.enums.BreadColor;
import com.alazhar.restaurant.enums.MeatType;
import java.util.List;

/**
 *
 * @author AlaaAli
 */
public class HealthyBurger extends NormalBurger {

    public HealthyBurger() {
    }

    public HealthyBurger(double sandwichPrice, MeatType meatType) {
        super("HealthyBurger", sandwichPrice, meatType, BreadColor.BROWN);
    }

    public HealthyBurger(double sandwichPrice, MeatType meatType, List<Additional> additionals) {
        super("Healthy Burger", sandwichPrice, meatType, BreadColor.BROWN, additionals);
    }  
}
