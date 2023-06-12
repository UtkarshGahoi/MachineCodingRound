package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
   private static List<Dish>dishList=new ArrayList<>();

   public static void  addToCart(Dish dish){
       dishList.add(dish);

   }
   public static void clear(){
       dishList.clear();
   }
   public static List<Dish> getItemList(){
       return  dishList;
   }

}
