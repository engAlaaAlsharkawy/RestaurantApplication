
package com.alazhar.restaurant;

import com.alazhar.restaurant.enums.BreadColor;
import com.alazhar.restaurant.enums.MeatType;
import com.alazhar.restaurant.model.Additional;
import com.alazhar.restaurant.model.DeluxeBurger;
import com.alazhar.restaurant.model.HealthyBurger;
import com.alazhar.restaurant.model.NormalBurger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alaa Ali
 */
public class RestaurantApplication {

    public static void main(String[] args) {

        Additional extraCheese = new Additional("Extra Cheese", 30.00);
        Additional extraTometo = new Additional("Extra Tometo", 5.00);
        Additional extraBasl = new Additional("Extra Basl", 10.00);
        Additional extraToom = new Additional("Extra Toom", 15.00);
        List<Additional> additionalsNormalBurger = new ArrayList<>();
        additionalsNormalBurger.add(extraCheese);
        additionalsNormalBurger.add(extraTometo);
        additionalsNormalBurger.add(extraBasl);
        additionalsNormalBurger.add(extraToom);
        NormalBurger normalBurger = new NormalBurger(50.00, MeatType.BEEF, BreadColor.BROWN, additionalsNormalBurger);
        System.out.println("normalBurger: \n" + normalBurger.toString());
        System.out.println("==================================================================");
        NormalBurger normalBurger1 = new NormalBurger(50.00, MeatType.BEEF, BreadColor.BROWN);
        System.out.println("normalBurger1 without Additionals: " + normalBurger1.toString());

        DeluxeBurger burger = new DeluxeBurger();
        System.out.println("DeluxeBurger ---> " + burger.toString());

        List<Additional> additionalsHealthyBurger = new ArrayList<>();
        additionalsHealthyBurger.add(extraCheese);
        additionalsHealthyBurger.add(extraTometo);
        HealthyBurger healthyBurger = new HealthyBurger(100.9, MeatType.BEEF, additionalsHealthyBurger);
        System.out.println("HealthyBurger -->\n" + healthyBurger.toString());
    }
}
