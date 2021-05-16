
package com.alazhar.restaurant.model;

import com.alazhar.restaurant.enums.BreadColor;
import com.alazhar.restaurant.enums.MeatType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlaaAli
 */
public class DeluxeBurger extends NormalBurger {

    public DeluxeBurger() {
        super("DeluxeBurger", 60.00, MeatType.BEEF, BreadColor.WHITE);
    }

    @Override
    public String toString() {
        return "BurgerSandwiches{\n" + "sandwichName=" + super.getSandwichName() + 
                ", sandwichPrice=" + super.getSandwichPrice() + 
                ", meatType=" + super.getMeatType() + ", breadColor=" + super.getBreadColor() + 
                "DeluxeBurger{\n" + "additionals=" + super.getAdditionals().toString() + '}';
    }

    @Override
    public List<Additional> setDefualtAdditionals() {
        List<Additional> additionals = new ArrayList<>();
        Additional chips = new Additional("CHIPS", 0.00);
        Additional drink = new Additional("DRINK", 0.00);
        additionals.add(drink);
        additionals.add(chips);
        return additionals;
    }
}
