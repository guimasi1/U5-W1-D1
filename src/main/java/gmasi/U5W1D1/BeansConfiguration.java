package gmasi.U5W1D1;

import gmasi.U5W1D1.decorator.Consumation;
import gmasi.U5W1D1.decorator.ExtraSausageDecorator;
import gmasi.U5W1D1.decorator.ExtraVegetablesDecorator;
import gmasi.U5W1D1.decorator.Pizza;
import gmasi.U5W1D1.entities.Drink;
import gmasi.U5W1D1.entities.Menu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    public Pizza getPizza() {
        return new Pizza();
    }

    @Bean
    public Menu getMenu() {
        Consumation margherita = new Pizza();
        Consumation sausage = new Pizza();
        Consumation vegetables = new Pizza();
        sausage = new ExtraSausageDecorator(sausage);
        vegetables = new ExtraVegetablesDecorator(vegetables);

        List<Consumation> pizzas = new ArrayList<>();
        pizzas.add(margherita);
        pizzas.add(sausage);
        pizzas.add(vegetables);

        Drink cocaCola = new Drink("Coca-cola", 2.0);
        Drink beer = new Drink("Beer", 5.0);
        Drink redWine = new Drink("Red wine", 10);
        List<Drink> drinks = new ArrayList<>();
        drinks.add(cocaCola);
        drinks.add(beer);
        drinks.add(redWine);

        return new Menu(pizzas, drinks);
    }
}
