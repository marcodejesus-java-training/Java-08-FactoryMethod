package src;

public class Main {
    public static void main(String []args) throws Exception {
        RestauranteDePizzas LuigisPizzas = new RestauranteDePizzas();
        Pizza pizzaAPreparar;

        // Ordenamos una Pizza de Queso
        pizzaAPreparar = LuigisPizzas.OrdenarPizza("Queso");
        System.out.println("La pizza que ordenó es una: " + pizzaAPreparar.obtenerNombreDeLaPizza());

        // Ordenamos una Pizza Mexicana
        pizzaAPreparar = LuigisPizzas.OrdenarPizza("Mexicana");
        System.out.println("La pizza que ordenó es una: " + pizzaAPreparar.obtenerNombreDeLaPizza());

        // Ordenamos una Pizza Hawaiana
        pizzaAPreparar = LuigisPizzas.OrdenarPizza("Hawaiana");
        System.out.println("La pizza que ordenó es una: " + pizzaAPreparar.obtenerNombreDeLaPizza());
    }
}