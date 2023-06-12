package org.example;

import java.util.List;

public class OrderService {
    public static boolean searchByRestaurant(List<Restaurant>restaurants,Restaurant restaurant){
        for(Restaurant restaurant1:restaurants){
            if(restaurant1.getName().equals(restaurant.getName())){
                System.out.println("we got the restuarant");
                return  true;
            }
        }
        return  false;
    }
    public static boolean searchByDish(List<Dish>dishList,Dish dish){
        for(Dish dish1:dishList){
            if(dish1.getName().equals(dish.getName())){
                System.out.println("we got the Dish");
                return  true;

            }
        }
        return  false;
    }


}
