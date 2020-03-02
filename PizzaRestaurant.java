public class PizzaRestaurant{
    
    public Pizza OrderPizza(String type){
        Pizza pizza = null;
        
        if(type.equals("Cheese")){
            return new CheesePizza();
        }
        else if(type.equals("Mexican")){
            return new MexicanPizza();
        }
        
        
        return pizza;
    }
}