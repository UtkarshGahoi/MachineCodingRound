package org.example;

import java.util.List;

public class User {
    String name;
    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static void addToCart(Dish dish) {
        Cart.addToCart(dish);
    }
    public static boolean serachByRestaurant(List<Restaurant>restaurantList,Restaurant restaurant){
        return OrderService.searchByRestaurant(restaurantList,restaurant);
    }
    public static boolean searchByDish(List<Dish>dishList,Dish dish){
        return OrderService.searchByDish(dishList,dish);
    }
    public static Order checkout(){
        List<Dish>dishList=Cart.getItemList();
        System.out.println("the size is"+dishList.size());

        for(Dish dish:dishList){
            System.out.println("Total amount for this o"+dish.getName()+dish.getPrice());
        }

        Address address=new Address("","","");
        Cart.clear();
        return new  Order(dishList,address,address);
    }
}
