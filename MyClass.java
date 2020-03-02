public class MyClass{
    public static void main(String []args){
        PizzaRestaurant restaurant = new PizzaRestaurant();
        Pizza pizza = restaurant.OrderPizza("Cheese");
        
        System.out.println(pizza.getPizzaName());
    }
}