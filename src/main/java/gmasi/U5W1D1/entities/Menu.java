package gmasi.U5W1D1.entities;


import gmasi.U5W1D1.decorator.Consumation;
import gmasi.U5W1D1.decorator.ExtraAdditionDecorator;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Menu {
    List<Consumation> pizzas;
    List<Drink> drinks;

    @Override
    public String toString() {
        return "Menu \n" +
                "Pizzas=" + pizzas +
                ", Drinks=" + drinks +
                '}';
    }

    public void showMenu() {
        System.out.println("*** Menu ***");
        System.out.println("--- Pizzas --- \n");
        pizzas.forEach(System.out::println);
        System.out.println("--- Drinks --- \n");
        drinks.forEach(System.out::println);
    }
}
